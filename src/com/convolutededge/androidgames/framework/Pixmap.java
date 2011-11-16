/**
 * 
 */
package com.convolutededge.androidgames.framework;

import com.convolutededge.androidgames.framework.Graphics.PixmapFormat;

/**
 * @author cswenor
 *
 */
public interface Pixmap {
	public int getWidth();
	
	public int getHeight();
	
	public PixmapFormat getFormat();
	
	public void dispose();
}
