package org.noix.annotations.extensions;

import org.noix.annotations.extension.AutoExtension;
import org.noix.annotations.extension.Extension;

@AutoExtension
public class HelloWorldExtension implements Extension {
	public void run() {
		System.out.println("hello word");
	}
}
