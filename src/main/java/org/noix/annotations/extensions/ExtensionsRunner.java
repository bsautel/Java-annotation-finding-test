package org.noix.annotations.extensions;

import java.util.Set;

import org.noix.annotations.extension.Extension;
import org.noix.annotations.finder.ExtensionsLoader;

public class ExtensionsRunner {
	private final ExtensionsLoader extensionsLoader = new ExtensionsLoader();

	public void run() throws InstantiationException, IllegalAccessException {
		Set<Extension> extensions = extensionsLoader.getExtensions();
		for (Extension extension : extensions) {
			extension.run();
		}
	}
}
