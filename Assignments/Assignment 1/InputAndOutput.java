import java.util.Scanner;
/**
 @author Ngoc Phuong Anh Nguyen 2712361
**/
public class InputAndOutput
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("My name is TOM. What is your name?");
    String userInput1 = sc.nextLine();
    System.out.println("Pleased to meet you, " + userInput1);
    System.out.println("In which program are you enrolled?");
    String userInput2 = sc.nextLine();
    System.out.println("Thank you " + userInput1 +". Your program is " + userInput2);
  }
}
