/**
 This class represents a Credit Card.
 @author Ngoc Phuong Anh Nguyen 3712361
*/

public class CreditCard
{
  /**
  The name of the card holder
  */
  public String cardHolderName;
  /**
  The credit card number
  */
  public String cardNumber;
  /**
  The current balance owing
  */
  public double currentBalance;

  /**
   This method constructs a CreditCard with the specified card holder name and number.
   @param cardHolderNameIn The name of the card holder.
   @param cardNumberIn The card number.
  */
  public CreditCard(String cardHolderNameIn, String cardNumberIn)
  {
    cardHolderName = cardHolderNameIn;
    cardNumber = cardNumberIn;
    currentBalance = 0;
  }

  /**
   This method retrieves the name of the card holder.
   @return The name of the card holder.
  */
  public String getCardHolderName()
  {
    return cardHolderName;
  }

  /**
   This method retrieves the card number.
   @return The name of the card number
  */
  public String getCardNumber()
  {
    return cardNumber;
  }

  /**
   This method retrieves the current balance owing.
   @return The name of the current balance owing.
  */
  public double getCurrentBalance()
  {
    return currentBalance;
  }

  /**
   This method is called to add the price of a purchase to the card's balance
owing.
   @param currentBalanceValue The  purchase amount.
  */
  public void setCurrentBalance(double currentBalanceValue)
  {
    currentBalance+=currentBalanceValue;
  }

  /**
   This method is called to  reduce the balance owing on the card by the payment amount.
   @param paymentAmount The  payment amount.
  */
  public void makeAPayment(double paymentAmount)
  {
    currentBalance-=paymentAmount;
  }

  /**
   This method calculates and returns the amount of interest that will be charged on the balance owing on the CreditCard when given the interest rate as a percentage.
   @param interest The interest rate.
   @return The amount of interest.
  */
  public double calculateInterest(double interest)
  {
    return interest*currentBalance;
  }
}
