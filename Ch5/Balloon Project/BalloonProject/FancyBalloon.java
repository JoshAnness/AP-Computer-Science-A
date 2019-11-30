/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class FancyBalloon extends Balloon
{

  private int xCenter, yCenter, radius;
  private Color color;

  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public FancyBalloon()
  {
    super();
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public FancyBalloon(int x, int y, int r, Color c)
  {
    super(x, y, r, c);
  }

  /**
   * Draws a solid circle if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled draws a solid circle if true
   */
  public void draw(Graphics g, boolean makeItFilled)
  {
    int x = getX(), y = getY(), r = getRadius();
    g.setColor(getColor());
    if (makeItFilled)
      g.fillRect(x - r,
                 y - r, r, 2*r);
    else
      g.drawRect(x - r,
                 y - r, r, 2*r);
  }
  
  public double distance(int x, int y)
  {
    double dx = x - getX();
    double dy = y - getY();
    dx = dx/(2*Math.sqrt(2));
    return Math.sqrt(dx*dx + dy*dy);
  }
  
}