/**
This class presents a Ticket
@author Ngoc Phuong Anh Nguyen 3712361
*/

public class Ticket
{
  /**
  The passenger's name.
  */
  private String name;
  /**
  The number of bags.
  */
  private int bagsNumber;
  /**
  The number of in-flight drinks.
  */
  private int drinksNumber;

  /**
  This method constructs a ticket with a specified name of the passenger, number of bags, and number of in-flight drinks.
  @param nameIn The name of the passenger.
  @param bagsNumberIn The number of bags.
  @param drinksNumberIn The number of in-flight drinks.
  */
  public Ticket(String nameIn, int bagsNumberIn, int drinksNumberIn)
  {
    name = nameIn;
    bagsNumber = bagsNumberIn;
    drinksNumber = drinksNumberIn;
  }

  /**
   This method retrieves the name of the passenger.
   @return the name of the passenger.
  */
  public String getName()
  {
    return name;
  }

  /**
   This method retrieves the number of bags.
   @return The number of bags.
  */
  public int getBagsNumber()
  {
    return bagsNumber;
  }
  
  /**
   This method retrieves the number of in-flight drinks.
   @return The number of in-flight drinks.
  */
  public int getDrinksNumber()
  {
    return drinksNumber;
  }
}
