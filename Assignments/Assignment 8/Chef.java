/**
This class represents someone who works as a chef at this restaurant.
@author Ngoc Phuong Anh Nguyen 3712361
*/
public class Chef extends RestaurantWorker
{
  /**
  The amount of union fees.
  */
  private double unionFees;

  /**
  This method constructs a server with a specified worker's name, job title and hourly salary rate.
  @param nameIn The name of the worker.
  @param jobTitleIn The job title of the worker.
  @param salaryRateIn The hourly salary rate of the worker.
  @param unionFeesIn The amount of union fees.
  */
  public Chef(String nameIn, String jobTitleIn, double salaryRateIn, double unionFeesIn)
  {
    super(nameIn, jobTitleIn, salaryRateIn);
    unionFees = unionFeesIn;
  }

  /**
  This method returns the current week's pay of the worker.
  @param hours The hours the worker worked this week.
  @return The pay of the worker in the current week.
  */
  public double computePay(double hours)
  {
    double pay;
    if(hours<=40)
    {
      pay = hours * super.getSalaryRate();
    }
    else
    {
      pay = (40 * super.getSalaryRate()) + (hours - 40) * 1.5 * super.getSalaryRate();
    }
    return pay;
  }
}
