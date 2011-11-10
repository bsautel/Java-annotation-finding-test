package org.noix.annotations.finder;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.noix.annotations.extension.AutoExtension;
import org.noix.annotations.extension.Extension;
import org.reflections.Reflections;

public class ExtensionsFinder {
	private static final String AUTO_EXTENSION_PACKAGE = "org.noix";

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Set<Class<? extends Extension>> computeExtensionTypes() {
		Reflections reflections = new Reflections(AUTO_EXTENSION_PACKAGE);
		Set<Class<?>> types = reflections
				.getTypesAnnotatedWith(AutoExtension.class);
		ensureClassesAreExtensions(types);
		return (Set<Class<? extends Extension>>) (Set) types;
	}

	private void ensureClassesAreExtensions(Set<Class<?>> types) {
		for (Class<?> type : types) {
			Class<?>[] interfaces = type.getInterfaces();
			List<Class<?>> interfacesList = Arrays.asList(interfaces);
			if (!interfacesList.contains(Extension.class)) {
				throw new AssertionError(type.getCanonicalName()
						+ " doesn't implement the "
						+ Extension.class.getCanonicalName() + " interface");
			}
		}
	}
}
