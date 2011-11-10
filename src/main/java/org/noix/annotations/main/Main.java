package org.noix.annotations.main;

import java.util.Set;

import org.noix.annotations.extension.Extension;
import org.noix.annotations.finder.ExtensionsLoader;


public class Main {
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		ExtensionsLoader extensionsLoader = new ExtensionsLoader();
		Set<Extension> extensions = extensionsLoader.getExtensions();
		for (Extension extension : extensions) {
			extension.run();
		}
	}
}
