/**
This class represents a cylindrical tube with closed ends.
@author Ngoc Phuong Anh Nguyen 3712361
*/
public class Tube
{
  /**
  The radius of the tube
  */
  private double radius;
  /**
  The height of the tube
  */
  private double height;

  /**
   This method constructs a  cylindrical tube with closed ends with the specified radius and height.
   @param radiusIn The radius of the tube.
   @param heightIn The height of the tube.
  */
  public Tube(double radiusIn, double heightIn)
  {
    radius = radiusIn;
    height = heightIn;
  }

  /**
   This method retrieves the radius of the tube.
   @return The radius of the tube.
  */
  public double getRadius()
  {
    return radius;
  }

  /**
   This method retrieves the height of the tube.
   @return The height of the tube.
  */
  public double getHeight()
  {
    return height;
  }

  /**
   This method retrieves the volumn of the tube.
   @return The volumn of the tube.
  */
  public double volumeTube()
  {
    return Math.pow(radius,2) * Math.PI*height;
  }

  /**
   This method retrieves the surface area of the tube.
   @return The surface area of the tube.
  */
  public double areaTube()
  {
    return 2 * (Math.pow(radius,2) * Math.PI) + 2 * Math.PI * radius * height;
  }
}
