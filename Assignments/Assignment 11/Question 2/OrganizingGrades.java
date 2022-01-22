/**
  This is a grades organizing program.
  @uthor Ngoc Phuong Anh Nguyen 3712361
*/
import java.util.Scanner;

class OrganizingGrades
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many grades will you enter? ");
    int number = sc.nextInt();

    double temp;
    double[] grades = new double[number];
    // Input
    for(int i=0;i<number;i++)
    {
      System.out.print("Enter grade " + (i+1) +": ");
      grades[i] = sc.nextDouble();
      while(grades[i]<0 || grades[i]>100)
      {
        System.out.println("The grade must between 0 and 100.");
        System.out.print("Enter grade " + (i+1) +": ");
        grades[i] = sc.nextDouble();
      }
    }
    // Check
    double max = grades[0];
    double min = grades[0];
    for(int i=1;i<number;i++)
    {
      if(max<grades[i])
      {
        max = grades[i];
      }
      else if(min>grades[i])
      {
        min = grades[i];
      }
    }
    // Move
    for(int j=0;j<number;j++)
    {
      if(grades[j]==min)
      {
        temp = grades[number-1];
        grades[number-1] = grades[j];
        grades[j] = temp;
        break;
      }
    }

    for(int i=0;i<number;i++)
    {
      if(grades[i]==max)
      {
        temp = grades[i];
        grades[i] = grades[0];
        grades[0] = temp;
        break;
      }
    }
    // Output
    System.out.println("\nReordered grades:");
    for(int i=0;i<number;i++)
    {
      System.out.println(grades[i]);
    }
  }
}
