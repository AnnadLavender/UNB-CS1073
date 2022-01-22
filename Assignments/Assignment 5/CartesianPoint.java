/**
 This class represents a point in the Cartesian
 co-ordinate system.
 @author Natalie Webber
*/
public class CartesianPoint {

   /**
    The x value for the point.
   **/
   private double x;

   /**
    The y value for the point.
   **/
   private double y;

   /**
    Constructs a CartesianPoint object with the
    given x and y values.
    @param xVal the initial x value.
    @param yVal the initial y value.
   **/
   public CartesianPoint (double xVal, double yVal) {
      x = xVal;
      y = yVal;
   }

   /**
    Calculates the distance between this
    CartesianPoint and the specified one.
    @param x2 the x value for the other point.
    @param y2 the y value for the other point.
    @return the distance between the two points.
   **/
   public double distance (double x2, double y2) {
      double dx = x - x2;
      double dy = y - y2;
      return Math.sqrt(dx*dx + dy*dy);
   }

   /**
    Calculates the distance between this
    CartesianPoint and the specified one.
    @param other the other point.
    @return the distance between the two points.
   **/
   public double distance (CartesianPoint other) {
      double dx = x - other.x;
      double dy = y - other.y;
      return Math.sqrt(dx*dx + dy*dy);
   }

   public double getX () {
      return x;
   }

   public double getY () {
      return y;
   }

   public void setX (double xVal) {
      x = xVal;
   }

   public void setY (double yVal) {
      y = yVal;
   }

   public void move (double xAmount, double yAmount) {
      x = x + xAmount;
      y = y + yAmount;
   }

   public String toString()
   {
     return "(" + x + ";" + y +")";
   }
}
