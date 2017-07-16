//
//  Font.java
//  rrdiagram
//
//  Created by William Shakour (billy1380) on 16 Jul 2017.
//  Copyright © 2017 WillShex Limited. All rights reserved.
//
package net.nextencia.rrdiagram.common.font;

/**
 * @author William Shakour (billy1380)
 *
 */
public interface Font {

	public static final int PLAIN = 0;
	public static final int BOLD = 1;
	public static final int ITALIC = 2;

	/**
	 * @return
	 */
	String getFamily ();

	/**
	 * @return
	 */
	boolean isItalic ();

	/**
	 * @return
	 */
	boolean isBold ();

	/**
	 * @return
	 */
	float getSize ();

	/**
	 * @param text
	 * @return
	 */
	Rectangle2D getStringBounds (String text);

	/**
	 * @param text
	 * @return
	 */
	LineMetrics getLineMetrics (String text);

}
