/**
This class presents a First Class Ticket
@author Ngoc Phuong Anh Nguyen 3712361
*/

public class FirstClassTicket extends Ticket
{
  /**
  This method constructs a First Class ticket with a specified name of the passenger, number of bags, and number of in-flight drinks.
  @param nameIn The name of the passenger.
  @param bagsNumberIn The number of bags.
  @param drinksNumberIn The number of in-flight drinks.
  */
  public FirstClassTicket(String nameIn, int bagsNumberIn, int drinksNumberIn)
  {
    super(nameIn, bagsNumberIn, drinksNumberIn);
  }

  /**
   This method retrieves the boarding group number for First Class's passenger.
   @return boarding group number.
  */
  public int getGroupNumber()
  {
    return 1;
  }

  /**
   This method retrieves the total cost of the ticket for First Class's passenger.
   @return total cost of the ticket.
  */
  public double getTotalCost()
  {
    double drinksPrice = 0;

    if(super.getDrinksNumber() <= 2 && super.getDrinksNumber()>=0)
    {
      drinksPrice = 0;
    }
    else if(super.getDrinksNumber() > 2)
    {
      drinksPrice = (super.getDrinksNumber() - 2) * 2.5;
    }
    return (super.getBagsNumber() * 30) + drinksPrice +2175;
  }
}
