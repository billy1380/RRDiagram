//
//  Color.java
//  rrdiagram
//
//  Created by William Shakour (billy1380) on 16 Jul 2017.
//  Copyright © 2017 WillShex Limited. All rights reserved.
//
package net.nextencia.rrdiagram.common;

/**
 * @author William Shakour (billy1380)
 *
 */
public class Color {
	public static final Color BLACK = new Color(0, 0, 0);

	int r, g, b, a;

	public Color (int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
}
