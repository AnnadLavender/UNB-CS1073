/**
This class represents a rectangular box.
@author Ngoc Phuong Anh Nguyen 3712361
*/
public class Box
{
  /**
  The length of the box
  */
  private double length;
  /**
  The width of the box
  */
  private double width;
  /**
  The height of the box
  */
  private double height;

  /**
   This method constructs a rectangular Box with the specified length, width and height.
   @param lengthIn The length of the box.
   @param widthIn The width of the box.
   @param heightIn The height of the box.
  */
  public Box(double lengthIn, double widthIn, double heightIn)
  {
    length = lengthIn;
    width = widthIn;
    height = heightIn;
  }

  /**
   This method retrieves the length of the box.
   @return The length of the box
  */
  public double getlength()
  {
    return length;
  }

  /**
   This method retrieves the width of the box.
   @return The width of the box
  */
  public double getWidth()
  {
    return width;
  }

  /**
   This method retrieves the height of the box.
   @return The height of the box
  */
  public double getHeight()
  {
    return height;
  }

  /**
   This method retrieves the volumn of the box.
   @return The volumn of the box
  */
  public double volumeBox()
  {
    return length * width * height;
  }

  /**
   This method retrieves the surface area of the box.
   @return The surface area of the box
  */
  public double areaBox()
  {
    return 2*(length * width + length * height + width * height);
  }
}
