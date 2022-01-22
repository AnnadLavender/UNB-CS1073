/**
This class presents an Economy Ticket
@author Ngoc Phuong Anh Nguyen 3712361
*/

public class EconomyTicket extends Ticket
{
  /**
  This method constructs an Economy ticket with a specified name of the passenger, number of bags, and number of in-flight drinks.
  @param nameIn The name of the passenger.
  @param bagsNumberIn The number of bags.
  @param drinksNumberIn The number of in-flight drinks.
  */
  public EconomyTicket(String nameIn, int bagsNumberIn, int drinksNumberIn)
  {
    super(nameIn, bagsNumberIn, drinksNumberIn);
  }

  /**
   This method retrieves the boarding group number for Economy's passenger.
   @return boarding group number.
  */
  public int getGroupNumber()
  {
    int group = 2 + (int)(Math.random() * 3);
    return group;
  }

  /**
   This method retrieves the total cost of the ticket for Economy's passenger.
   @return total cost of the ticket.
  */
  public double getTotalCost()
  {
    double bagsPrice = 0;
    if(super.getBagsNumber()==0)
    {
      bagsPrice = 0;
    }
    else if(super.getBagsNumber()>0)
    {
      bagsPrice = 50 +(super.getBagsNumber() - 1) * 35;
    }
    return bagsPrice + (super.getDrinksNumber() * 2.50) + 1350;
  }
}
