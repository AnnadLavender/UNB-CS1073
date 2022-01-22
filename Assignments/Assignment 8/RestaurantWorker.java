/**
This class represents a person who works at a restaurant.
@author Ngoc Phuong Anh Nguyen 3712361.
*/

public class RestaurantWorker
{
  /**
  The name of the worker.
  */
  private String name;

  /**
  The job title of the worker.
  */
  private String jobTitle;

  /**
  The hourly salary rate of the worker.
  */
  private double salaryRate;

  /**
  This method constructs a restaurant worker with a specified worker's name, job title and hourly salary rate.
  @param nameIn The name of the worker.
  @param jobTitleIn The job title of the worker.
  @param salaryRateIn The hourly salary rate of the worker.
  */
  public RestaurantWorker(String nameIn, String jobTitleIn, double salaryRateIn)
  {
    name = nameIn;
    jobTitle = jobTitleIn;
    salaryRate = salaryRateIn;
  }

  /**
  This method retrieves the name of the worker.
  @return The name of the worker.
  */
  public String getName()
  {
    return name;
  }

  /**
  This method retrieves the job title of the worker.
  @return The job title of the worker.
  */
  public String getJobTitle()
  {
    return jobTitle;
  }

  /**
  This method retrieves the hourly salary rate of the worker.
  @return The hourly salary rate of the worker.
  */
  public double getSalaryRate()
  {
    return salaryRate;
  }

  /**
  This method returns the current week's pay of the worker.
  @param hours The hours the worker worked this week.
  @return The pay of the worker in the current week.
  */
  public double computePay(double hours)
  {
    return salaryRate * hours;
  }
}
