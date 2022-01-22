/**
This is a driver program.
@author Ngoc Phuong Anh Nguyen 3712361
*/
import java.util.Scanner;
public class ScholarshipAssessment
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int creditHours;
    String coopProgram = "none";
    double gpa;
    int scholarship;
    int others;
    String finance;

    System.out.print("Enter the number of credit hours completed in the last year: ");
    creditHours = sc.nextInt();
    while(creditHours<0)
    {
      System.out.print("Credit hours must be non-negative.\nEnter the number of credit hours completed in the last year: ");
      creditHours = sc.nextInt();
    }
    sc.nextLine();

    if(creditHours<24)
    {
      System.out.print("Have you participated in a university co-op program in the last year (yes or no)? ");
      coopProgram = sc.nextLine();
      while(!coopProgram.equalsIgnoreCase("yes") && !coopProgram.equalsIgnoreCase("no"))
      {
        System.out.print("Enter yes or no: ");
        coopProgram = sc.nextLine();
      }
    }

    System.out.print("Enter your GPA: ");
    gpa = sc.nextDouble();
    while(gpa<0||gpa>4)
    {
      System.out.print("Invalid GPA. Enter a non-negative GPA: ");
      gpa = sc.nextDouble();
    }

    if(creditHours>=24||coopProgram.equalsIgnoreCase("yes"))
    {
      if(gpa>=2.7)
      {
        System.out.print("Enter the number of official university clubs, societies, or teams in which you participated last year: ");
        others = sc.nextInt();
        while(others<0)
        {
          System.out.print("Please enter valid number: ");
          others = sc.nextInt();
        }
        sc.nextLine();

        System.out.print("Do youhave demonstrated financial need (yes or no)? ");
        finance =sc.nextLine();
        while(!finance.equalsIgnoreCase("yes") && !finance.equalsIgnoreCase("no"))
        {
          System.out.print("Enter yes or no: ");
          finance =sc.nextLine();
        }
        scholarship = 500;
        if(gpa>=3.0 && gpa<3.7)
        {
          scholarship += 200;
        }
        else if(3.7<=gpa&&gpa<=4.0)
        {
          scholarship += 400;
        }

        if(others>=3)
        {
          scholarship+=100;
        }

        if(finance.equalsIgnoreCase("yes"))
        {
          scholarship*=2;
        }
        System.out.print("You are eligible for a scholarship of $"+scholarship);
      }
      else
      {
        System.out.print("Sorry, you are not eligible for a scholarship.");
      }
    }
    else
    {
      System.out.print("Sorry, you are not eligible for a scholarship.");
    }
  }
}
