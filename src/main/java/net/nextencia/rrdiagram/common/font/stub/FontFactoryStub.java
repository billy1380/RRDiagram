//
//  FontFactoryStub.java
//  rrdiagram
//
//  Created by William Shakour (billy1380) on 16 Jul 2017.
//  Copyright © 2017 WillShex Limited. All rights reserved.
//
package net.nextencia.rrdiagram.common.font.stub;

import net.nextencia.rrdiagram.common.font.Font;
import net.nextencia.rrdiagram.common.font.FontFactory;
import net.nextencia.rrdiagram.common.font.LineMetrics;
import net.nextencia.rrdiagram.common.font.Rectangle2D;

/**
 * @author William Shakour (billy1380)
 *
 */
public class FontFactoryStub implements FontFactory {

	public Font create (final String name, final int style, final int size) {
		return new Font() {

			@Override
			public boolean isItalic () {
				return (style & Font.ITALIC) != 0;
			}

			@Override
			public boolean isBold () {
				return (style & Font.BOLD) != 0;
			}

			@Override
			public float getSize () {
				return size;
			}

			@Override
			public String getFamily () {
				return name;
			}

			@Override
			public Rectangle2D getStringBounds (String text) {
				return new Rectangle2D(10, 10,
						(int) ((float) (text.length() * size) * 0.6f), size);
			}

			@Override
			public LineMetrics getLineMetrics (String text) {
				return new LineMetrics();
			}
		};
	}

}
