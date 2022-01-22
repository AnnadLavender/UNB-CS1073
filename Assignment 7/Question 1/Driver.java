/**
This is a driver program.
Ngoc Phuong Anh Nguyen 3712361
*/
import java.util.Scanner;
import java.text.NumberFormat;
public class Driver
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    NumberFormat formatter = NumberFormat.getNumberInstance();
    formatter.setMaximumFractionDigits(3);
    formatter.setMinimumFractionDigits(3);
    int input=0;
    int temp;
    int count = 0;
    double lengthBox, widthBox, heightBox;
    double radiusTube, heightTube;
    double maxVolume =0;
    double minArea = 0;
    int maxType = 0;
    int minType= 0;;

    while(input!=3)
    {
      System.out.println("What would you like to do?");
      System.out.println("1 - Get info for a box");
      System.out.println("2 - Get info for a tube");
      System.out.println("3 - Quit");
      System.out.print("Enter your choice: ");
      input = sc.nextInt();

      switch(input)
      {
        case 1:
        {
          System.out.print("Length (in cm): ");
          lengthBox = sc.nextDouble();
          System.out.print("Width (in cm): ");
          widthBox = sc.nextDouble();
          System.out.print("Height (in cm): ");
          heightBox = sc.nextDouble();

          Box box = new Box(lengthBox, widthBox, heightBox);

          System.out.println("The volume is: " + formatter.format(box.volumeBox()) + " cubic centimeters.");
          System.out.println("The surface area is: "+ formatter.format(box.areaBox())+ " square cemtimeters.\n");

          count++;

          if(count==1)
          {
            maxVolume = box.volumeBox();
            minArea = box.areaBox();
            maxType = 1;
            minType = 1;
          }

          if(count > 1)
          {
            if(maxVolume < box.volumeBox())
            {
              maxVolume = box.volumeBox();
              maxType = 1;
            }

            if(minArea > box.areaBox())
            {
              minArea = box.areaBox();
              minType = 1;
            }
          }
        }
        break;

        case 2:
        {
          System.out.print("Radius (in cm): ");
          radiusTube = sc.nextDouble();
          System.out.print("Height (in cm): ");
          heightTube = sc.nextDouble();

          Tube tube = new Tube(radiusTube, heightTube);

          System.out.println("The volume is: " + formatter.format(tube.volumeTube()) + " cubic centimeters.");
          System.out.println("The surface area is: "+ formatter.format(tube.areaTube())+ " square cemtimeters.\n");

          count++;

          if(count==1)
          {
            maxVolume = tube.volumeTube();
            minArea = tube.areaTube();
            maxType = 2;
            minType = 2;
          }

          if(count > 1)
          {
            if(maxVolume < tube.volumeTube())
            {
              maxVolume = tube.volumeTube();
              maxType = 2;
            }

            if(minArea > tube.areaTube())
            {
              minArea = tube.areaTube();
              minType = 2;
            }
          }
        }
        break;

        case 3:
        {
          System.out.println("Exit");
        }
        break;

        default:
        {
          System.out.println("Please input valid value.\n");
        }
        break;
      }
    }
    System.out.print("The container with the largest volume is a ");
    if(maxType==1)
    {
      System.out.println("box.");
    }
    if(maxType==2)
    {
      System.out.println("tube.");
    }

    System.out.println("Its volume is: " + formatter.format(maxVolume) + " cubic centimeters.");

    System.out.print("The container with the smallest surface area is a ");
    if(minType==1)
    {
      System.out.println("box.");
    }
    if(minType==2)
    {
      System.out.println("tube.");
    }

    System.out.println("Its volume is: " + formatter.format(minArea) + " cubic centimeters.");
  }
}
