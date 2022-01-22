/**
This is a driver program.
@author Ngoc Phuong Anh Nguyen 3712361
*/
public class As4TestDriver
{
  public static void main(String[] args)
  {
    ResidenceSenior adaleenGrant = new ResidenceSenior("Adaleen Grant", 1550.00, 48.00, 350, "Courtyard Gardens Hall", 212, 925.00);

    ResidenceSenior walterWhite= new ResidenceSenior("Walter White",0, 225, 0,  "Forest Glen Hall", 110, 1075.00);

    ResidenceSenior ruthFisher= new ResidenceSenior("Ruth Fisher", 1550.00, 0, 439.50, "Brookside Meadows Hall", 225, 850.00);

    adaleenGrant.setEntertainmentAmount(64.00);
    walterWhite.setHome("Cedar Lake Hall", 313, 1280.00);
    ruthFisher.setNursingCareAmount(2295.82);
    adaleenGrant.setFundingSupport(764.00);

    System.out.println(adaleenGrant.getOnSiteMailLabel());
    System.out.println("Total amount of fees owing: " + adaleenGrant.getTotalFeesOwing() + "\n");
    System.out.println(walterWhite.getOnSiteMailLabel());
    System.out.println("Total amount of fees owing: " + walterWhite.getTotalFeesOwing() + "\n");
    System.out.println(ruthFisher.getOnSiteMailLabel());
    System.out.println("Total amount of fees owing: " + ruthFisher.getTotalFeesOwing() + "\n");
  }
}
