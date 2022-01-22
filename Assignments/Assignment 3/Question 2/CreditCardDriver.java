/**
This is a driver program.
 @author Ngoc Phuong Anh Nguyen 3712361
*/

public class CreditCardDriver
{
  public static void main(String[] args)
  {
    //Mateo Garcia object
    CreditCard mateosCard = new CreditCard("Mateo Garcia","1234123412341234");
    mateosCard.setCurrentBalance(112.55);

    // Sarah Jones object
    CreditCard sarahsCard = new CreditCard("Sarah Jones","246813578642");
    sarahsCard.setCurrentBalance(1675.89);

    // Justin Tremblay object
    CreditCard justinsCard = new CreditCard("Justin Tremblay","234510106789");
    justinsCard.setCurrentBalance(25.00);

    // Jill Thomas object
    CreditCard jillsCard = new CreditCard("Jill Thomas","3579864278901234");
    jillsCard.setCurrentBalance(75.86);
    jillsCard.setCurrentBalance(63.44);

    sarahsCard.makeAPayment(500.00);
    justinsCard.makeAPayment(10.00);
    mateosCard.setCurrentBalance(40.00);
    mateosCard.setCurrentBalance(6.00);
    jillsCard.makeAPayment(96.50);
    justinsCard.makeAPayment(15.00);

    // Output
    System.out.println("\nCard Holder Name: "+ mateosCard.cardHolderName + "\nCredit Card Number: " + mateosCard.cardNumber + "\nCurrent Balance Owing: " + mateosCard.currentBalance + "\nAmount of Interest: " +mateosCard.calculateInterest(0.2));
    System.out.println("\nCard Holder Name: "+ sarahsCard.cardHolderName + "\nCredit Card Number: " + sarahsCard.cardNumber + "\nCurrent Balance Owing: " + sarahsCard.currentBalance + "\nAmount of Interest: " +sarahsCard.calculateInterest(0.17));
    System.out.println("\nCard Holder Name: "+ justinsCard.cardHolderName + "\nCredit Card Number: " + justinsCard.cardNumber + "\nCurrent Balance Owing: " + justinsCard.currentBalance + "\nAmount of Interest: " +justinsCard.calculateInterest(0.125));
    System.out.println("\nCard Holder Name: "+ jillsCard.cardHolderName + "\nCredit Card Number: " + jillsCard.cardNumber + "\nCurrent Balance Owing: " + jillsCard.currentBalance + "\nAmount of Interest: " +jillsCard.calculateInterest(0.125));
  }
}
