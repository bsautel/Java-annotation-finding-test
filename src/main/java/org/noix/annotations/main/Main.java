package org.noix.annotations.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.noix.annotations.extensions.ExtensionsRunner;

public class Main {
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		configureLogger();
		ExtensionsRunner extensionsRunner = new ExtensionsRunner();
		extensionsRunner.run();
	}

	private static void configureLogger() {
		Logger.getLogger("").setLevel(Level.WARNING);
	}
}
