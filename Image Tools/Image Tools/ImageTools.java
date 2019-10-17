import java.awt.Color;
import java.awt.Transparency;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Point;


public class ImageTools
{
	public static int HORIZONTAL_FLIP 	= 1;
	public static int VERTICAL_FLIP 	= 2;
	public static int DOUBLE_FLIP		= 3;

	/* Pre: Receives the name of a fine with an image
	 * Post: 	loads the image and returns it.
	 * null is returned if the image cannot be loaded */
	public static BufferedImage load(String fileName)
	{
		return null;
	}

	/* Pre: Receives a buffered image
	 * Post: 	creates and returns a copy of the received image
	 * null is returned if the received image is null */
	public static BufferedImage copy(BufferedImage img)
  	{
	   return null;
  	}
	
	/* Pre: Receives a buffered image
	 * Post: 	creates and returns a copy of the received image with a color mode that allows transparency 
	 * null is returned if the received image is null */
  	public static BufferedImage copyWithTransparency(BufferedImage img)
  	{
    	return null;
  	}

	/* Pre: Receives a buffered image
	 * Post: 	returns true if the image has a transparent mode and false otherwise */
  	public static boolean hasTransparency(BufferedImage img)
  	{
	   return null;
  	}

	/* Pre: Receives a buffered image and two positive double scale values (percentages) 
	 * Post: 	creates and returns a scaled copy of the received image
	 * null is returned if the received image is null or if non-positive scales are provided*/
  	public static BufferedImage scale(BufferedImage img,double horizontalScale,
  			double verticalScale)
  	{
	    return null;
  	}

	/* Pre: Receives a buffered image and two positive dimensions
	 * Post: 	creates and returns a scaled copy of the received image
	 * null is returned if the received image is null or if non-positive dimensions are provided*/
  	public static BufferedImage scale(BufferedImage img,int newWidth,
  			int newHeight)
  	{
	   return null;
  	}

	/* Pre: Receives a buffered image and a double angle
	 * Post: 	creates and returns a rotated copy of the received image
	 * null is returned if the received image is null*/
  	public static BufferedImage rotate(BufferedImage img,double angle)
  	{
  		return null;
  	}

	/* Pre: Receives a buffered image and a type of flip (int)
	 * Post: 	creates and returns a flipped copy of the received image
	 * null is returned if the received image is null or if an invalid flipping value is provided*/
  	public static BufferedImage flip(BufferedImage img,int type)
  	{
	  	return null;
  	}

	/* Pre: Receives a buffered image
	 * Post: 	creates and returns a blured copy of the received image, 
	 *	the bluring is created by blending each cell with its 8 neighbors.
	 * null is returned if the received image is null*/
  	public static BufferedImage blur(BufferedImage img)
  	{
  		return null;
  	}

	/* Pre: Receives a buffered image and two positive dimensions
	 * Post: 	creates and returns a copy with inverted colors of the received image
	 * null is returned if the received image is null */
  	public static BufferedImage invertColor(BufferedImage img)
  	{
  		return null;
  	}

	/* Pre: Receives a buffered image and a double percentage
	 * Post: creates and returns a copy of the received image with the given percentage in decimal form of the images remaining 
	 * non-fully transparent pixels changed to be completely transparent.
	 * null is returned if the received image is null or if non-positive percentage is provided*/
  	public static BufferedImage removePixels(BufferedImage img,double percentToRemove)
  	{
  		return null;
  	}

	/* Pre: Receives a buffered image and a number of pixels to remove
	 * Post: creates and returns a copy of the received image with the given number of the images remaining pixels removed
	 * non-fully transparent pixels changed to be completely transparent.
	 * null is returned if the received image is null or if non-positive number is provided
	 * Note: is there are not enough pixels in the image it will remove as many as it can*/
  	public static BufferedImage removePixels(BufferedImage img,int numToRemove)
  	{
  		return null;
  	}

	/* Pre: Receives a buffered image and a double percentage to fade
	 * Post: creates and returns a copy of the received image that has been faded the given percentage
	 * fading is done by multiply the alpha value by (1-fade)
	 * null is returned if the received image is null or if non-positive fade value is provided
	 * Note: any fade greater than 1 will be reduced to 1*/
  	public static BufferedImage fade(BufferedImage img,double fade)
  	{
  		return null;
  	}


	/* Pre: Receives a buffered image and a double percentage to lighten
	 * Post: creates and returns a copy of the received image that has been lighten by the given percentage + 1
	 * null is returned if the received image is null or if non-positive lightenFactor value is provided
	 * Note: any color that valve that end up being larger than 255 will be changed to 255*/
  	public static BufferedImage lighten(BufferedImage img, double lightenFactor)
  	{
  		return null;
  	}


	/* Pre: Receives a buffered image and a double percentage to darken
	 * Post: creates and returns a copy of the received image that has been darkened by 1 minus the given percentage 
	 * null is returned if the received image is null or if non-positive darkenFactor value is provided or a darkenFactor above 1 is provided
	 * Note: any color that valve that end up being larger than 255 will be changed to 255*/
  	public static BufferedImage darken(BufferedImage img, double darkenFactor)
  	{
  		return null;
  	}
}