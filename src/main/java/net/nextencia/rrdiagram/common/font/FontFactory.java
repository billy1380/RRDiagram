//
//  FontFactory.java
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
public interface FontFactory {
	Font create (final String name, final int style, final int size);
}
