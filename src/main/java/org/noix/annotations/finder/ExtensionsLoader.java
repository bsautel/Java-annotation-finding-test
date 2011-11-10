package org.noix.annotations.finder;

import java.util.HashSet;
import java.util.Set;

import org.noix.annotations.extension.Extension;

public class ExtensionsLoader {
	private final ExtensionsFinder finder = new ExtensionsFinder();

	public Set<Extension> getExtensions() throws InstantiationException,
			IllegalAccessException {
		Set<Class<? extends Extension>> types = finder.computeExtensionTypes();
		HashSet<Extension> result = new HashSet<Extension>();
		for (Class<? extends Extension> type : types) {
			result.add(type.newInstance());
		}
		return result;
	}
}
