/**
This is a driver program
@author Ngoc Phuong Anh Nguyen 2712361
*/
import java.util.Scanner;

public class ApplyToPeerMentor
{
  public static void main(String[] args)
  {
    String choice;
    Scanner sc = new Scanner(System.in);

    System.out.println("Are you an undergrad student?");
    choice = sc.nextLine();
    // Are you an undergrad student?-->yes
    if(choice.equals("yes"))
    {
      System.out.println("Will you be on a study term?");
      choice = sc.nextLine();
      // Will you be on a study term?-->yes
      if(choice.equals("yes"))
      {
        System.out.println("Is your GPA at least 2.7?");
        choice = sc.nextLine();
        // Is your GPA at least 2.7?-->yes
        if(choice.equals("yes"))
        {
          System.out.println("You should apply!");
          // You should apply!
        }
        // Is your GPA at least 2.7?-->no
        else if(choice.equals("no"))
        {
          // Sorry, you cannot apply.
          System.out.println("Sorry, you cannot apply");
        }
      }
      // Will you be on a study term?-->no
      else if(choice.equals("no"))
      {
        // Sorry, you cannot apply.
        System.out.println("Sorry, you cannot apply");
      }
    }
    // Are you an undergrad student?-->no
    else if(choice.equals("no"))
    {
      System.out.println("Are you a grad student?");
      choice = sc.nextLine();
      // Are you a grad student?-->yes
      if(choice.equals("yes"))
      {
        System.out.println("Do you have your supervisor's permission?");
        choice = sc.nextLine();
        // Do you have your supervisor's permission?-->yes
        if(choice.equals("yes"))
        {
          // You should apply!
          System.out.println("You should apply!");
        }
        // Do you have your supervisor's permission?-->no
        else if(choice.equals("no"))
        {
          // Sorry, you cannot apply.
          System.out.println("Sorry, you cannot apply");
        }
      }
      // Are you a grad student?-->no
      else if(choice.equals("no"))
      {
        // Sorry, you cannot apply.
        System.out.println("Sorry, you cannot apply");
      }
    }
  }
}
