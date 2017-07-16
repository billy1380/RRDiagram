/*
 * Christopher Deckers (chrriis@nextencia.net)
 * http://www.nextencia.net
 *
 * See the file "readme.txt" for information on usage and redistribution of
 * this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package net.nextencia.rrdiagram.common;

import net.nextencia.rrdiagram.common.font.Font;

/**
 * @author Christopher Deckers
 */
public class Utils {

	private Utils () {}

	public static String escapeXML (String s) {
		if (s == null || s.length() == 0) { return s; }
		StringBuilder sb = new StringBuilder((int) (s.length() * 1.1));
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '<':
				sb.append("&lt;");
				break;
			case '>':
				sb.append("&gt;");
				break;
			case '&':
				sb.append("&amp;");
				break;
			case '\'':
				sb.append("&apos;");
				break;
			case '\"':
				sb.append("&quot;");
				break;
			default:
				sb.append(c);
				break;
			}
		}
		return sb.toString();
	}

	public static String convertColorToHtml (Color c) {
		StringBuilder connectorColorSB = new StringBuilder("#");
		if (c.r < 16) {
			connectorColorSB.append('0');
		}
		connectorColorSB.append(Integer.toHexString(c.r));
		if (c.g < 16) {
			connectorColorSB.append('0');
		}
		connectorColorSB.append(Integer.toHexString(c.g));
		if (c.b < 16) {
			connectorColorSB.append('0');
		}
		connectorColorSB.append(Integer.toHexString(c.b));
		String connectorColor = connectorColorSB.toString();
		return connectorColor;
	}

	public static String convertFontToCss (Font font) {
		StringBuilder sb = new StringBuilder();
		sb.append("font-family:").append(font.getFamily())
				.append(",Sans-serif;");
		if (font.isItalic()) {
			sb.append("font-style:italic;");
		}
		if (font.isBold()) {
			sb.append("font-weight:bold;");
		}
		sb.append("font-size:" + font.getSize() + "px;");
		return sb.toString();
	}

}
