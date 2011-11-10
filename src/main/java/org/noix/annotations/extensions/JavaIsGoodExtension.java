package org.noix.annotations.extensions;

import org.noix.annotations.extension.AutoExtension;
import org.noix.annotations.extension.Extension;

@AutoExtension
public class JavaIsGoodExtension implements Extension {
	public void run() {
		System.out.println("Java is good!");
	}
}
