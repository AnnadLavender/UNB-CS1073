/**
 This class represents a Residence.
 @author Ngoc Phuong Anh Nguyen 3712361
*/
public class Residence
{
  /**
  The name of the building
  */
  private String buildingName;
  /**
  The unit number
  */
  private int unitNumber;
  /**
  The unit price
  */
  private double unitPrice;

  /**
   This method constructs a Residence with the specified building name, unit number and unit price.
   @param buildingNameIn The name of the building.
   @param unitNumberIn The unit number.
   @param unitPriceIn The unit price.
  */
  public Residence(String buildingNameIn, int unitNumberIn, double unitPriceIn)
  {
    buildingName = buildingNameIn;
    unitNumber = unitNumberIn;
    unitPrice = unitPriceIn;
  }

  /**
   This method retrieves the name of the building.
   @return The name of the building.
  */
  public String getBuildingName()
  {
    return buildingName;
  }

  /**
   This method retrieves the unit number.
   @return The unit number.
  */
  public int getUnitNumber()
  {
    return unitNumber;
  }

  /**
   This method retrieves the unit price.
   @return The unit price.
  */
  public double getUnitPrice()
  {
    return unitPrice;
  }
}
