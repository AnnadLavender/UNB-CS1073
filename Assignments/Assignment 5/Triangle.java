/**
 This class represents a triangle shape using 3 points.
 @author Natalie Webber
 @author Ngoc Phuong Anh Nguyen 2712361
*/

public class Triangle {

   private CartesianPoint pointA;
   private CartesianPoint pointB;
   private CartesianPoint pointC;

   public Triangle (double x1, double y1,
                    double x2, double y2,
                    double x3, double y3) {
      pointA = new CartesianPoint (x1, y1);
      pointB = new CartesianPoint (x2, y2);
      pointC = new CartesianPoint (x3, y3);
   }

   public Triangle (CartesianPoint p1,
                    CartesianPoint p2,
                    CartesianPoint p3) {
      pointA = p1;
      pointB = p2;
      pointC = p3;
   }

   public CartesianPoint getPoint1()
   {
     return pointA;
   }

   public CartesianPoint getPoint2()
   {
     return pointB;
   }

   public CartesianPoint getPoint3()
   {
     return pointC;
   }

   public double getPerimeter () {
      return pointA.distance(pointB)
           + pointB.distance(pointC)
           + pointC.distance(pointA);
   }

   /**
   This method returns true if the triangle is an equilateral triangle, false otherwise.
   @return The result if the triangle is an equilateral triangle or not.
   */
   public boolean isEquilateral()
   {
     double TOLERANCE = 1E-14;
     if(Math.abs(pointA.distance(pointB) - pointB.distance(pointC)) < TOLERANCE &&Math.abs(pointA.distance(pointB) - pointA.distance(pointC)) <TOLERANCE)
     {
       return true;
     }
     else return false;
   }

   /**
   This method returns true if the triangle is a right-angle triangle, false otherwise.
   @return The result if the triangle is a right-angle triangle or not.
   */
   public boolean isRight()
  {
    double TOLERANCE = 1E-14;
    if(Math.abs(Math.pow(pointA.distance(pointB),2) - (Math.pow(pointB.distance(pointC),2) + Math.pow(pointC.distance(pointA),2)))< TOLERANCE ||Math.abs(Math.pow(pointB.distance(pointC), 2) - (Math.pow(pointA.distance(pointB), 2)+Math.pow(pointC.distance(pointA), 2)))< TOLERANCE || Math.abs(Math.pow(pointC.distance(pointA), 2) - (Math.pow(pointA.distance(pointB), 2)+Math.pow(pointB.distance(pointC), 2)))< TOLERANCE)
    {
      return true;
    }
    else return false;
  }
}
