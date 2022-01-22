/**
This is a driver program
@author Ngoc Phuong Anh Nguyen 3712361
*/
import java.util.Scanner;
public class SleepTracker
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double optimalTime, sleepHistory;
    double lowestTime=0;
    double sum=0;
    int total = 0;
    int belowOptimal = 0;

    System.out.println("Please enter your optimal sleep time (in hours): ");
    optimalTime = sc.nextDouble();
    System.out.println("Next, enter your recorded sleep history values (in hours).\nEnter a negative number when done: ");
    sleepHistory = sc.nextDouble();

    while(sleepHistory>=0)
    {
      total++;
      if(sleepHistory<optimalTime)
      {
        belowOptimal++;
      }
      if(total==1||sleepHistory<lowestTime)
      {
        lowestTime=sleepHistory;
      }
      sum+=sleepHistory;
      sleepHistory = sc.nextDouble();
    }
    System.out.println("Your sleep report:");
    if(total<=1)
    {
      System.out.println(total + " night total");
    }
    else
    {
      System.out.println(total + " nights total");
    }
    if(belowOptimal<=1)
    {
      System.out.println(belowOptimal + " night below your optimal sleep time");
    }
    else
    {
      System.out.println(belowOptimal + " nights below your optimal sleep time");
    }
    System.out.print("Lowest sleep time: " + lowestTime);
    if(lowestTime==1||lowestTime==0)
    {
      System.out.println(" hour");
    }
    else
    {
      System.out.println(" hours");
    }

    System.out.print("Average sleep time: " + sum/total +" hours");
  }
}
