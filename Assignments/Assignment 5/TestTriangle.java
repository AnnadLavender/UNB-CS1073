/**
This is a driver program
@author Ngoc Phuong Anh Nguyen 2712361
*/
public class TestTriangle
{
  public static void main(String[] args)
  {
    Triangle tria1 = new Triangle(-0.5,0.0,0.5,0.0,0.0,Math.sqrt(3)/2);
    Triangle tria2 = new Triangle(0.0,0.0,1.0,0.0,0.0,1.0);

    // Check if the triangle is equilateral.
    if(tria1.isEquilateral())
    {
      System.out.println("The triangle 1 is an equilateral triangle");
    }
    else
    {
      System.out.println("The triangle 1 is not an equilateral triangle");
    }

    // Check if the triangle is a right-angle triangle
    if(tria2.isRight())
    {
      System.out.println("The triangle 2 is a right-angle triange");
    }
    else
    {
      System.out.println("The triangle 2 is not a right-angle triange");
    }
  }
}
