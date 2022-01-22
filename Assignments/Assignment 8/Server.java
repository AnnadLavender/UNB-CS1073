/**
This class represents someone who works as a server at this restaurant.
@author Ngoc Phuong Anh Nguyen 3712361
*/

public class Server extends RestaurantWorker
{
  /**
  The footwear allowance amount.
  */
  private double allowanceAmount;

  /**
  This method constructs a server with a specified worker's name, job title and hourly salary rate.
  @param nameIn The name of the worker.
  @param jobTitleIn The job title of the worker.
  @param salaryRateIn The hourly salary rate of the worker.
  @param allowanceAmountIn The footwear allowance amount
  */
  public Server(String nameIn, String jobTitleIn, double salaryRateIn, double allowanceAmountIn)
  {
    super(nameIn, jobTitleIn, salaryRateIn);
    allowanceAmount = allowanceAmountIn;
  }

  /**
  This method returns the current week's pay of the worker.
  @param hours The hours the worker worked this week.
  @return The pay of the worker in the current week.
  */
  public double computePay(double hours)
  {
    return (allowanceAmount * hours) + super.computePay(hours);
  }
}
