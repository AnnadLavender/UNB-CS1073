/**
This is a driver program.
@author Ngoc Phuong Anh Nguyen 3712361
*/
import java.util.Scanner;

public class MayaMath
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n, temp, temp2;

    System.out.print("Enter an Arabic number: ");
    n = sc.nextInt();
    while(n<0)
    {
      System.out.print("Invalid input. You must enter a non-negative number.\nPlease enter another Arabic ");
      n = sc.nextInt();
    }


    for(int i=0;i<n;i++)
    {
      if(Math.pow(20,i+1)>n && n>=Math.pow(20,i))
      {
        for(int j = i;j>=0;j--)
        {
          temp = n/(int)Math.pow(20,j);
          n-=temp*(int)Math.pow(20,j);
          {
            if(temp>=5)
            {
              temp2 = temp/5;
              for(int k=0;k<temp2; k++)
              {
                System.out.print("_ ");
                temp = temp - 5;
              }

              if(temp<5 && temp>=1)
              {
                for(int k=0;k<temp;k++)
                {
                  System.out.print("O ");
                }
              }
            }
            else if(temp>=1)
            {
              for(int k=0;k<temp;k++)
              {
                System.out.print("O ");
              }
            }
            else if(temp==0)
            {
              {
                System.out.print("U");
              }
            }


            System.out.print("\n");
          }
        }
      }
    }

    if(n==0)
    {
      System.out.print("U");
    }
  }
}
