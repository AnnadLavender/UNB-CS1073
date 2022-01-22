/**
 This class represents a Residence Senior.
 @author Ngoc Phuong Anh Nguyen 3712361
*/
public class ResidenceSenior
{
  /**
  The full name of the senior
  */
  private String name;

  /**
  The amount that this senior will pay per month for the care program that he/she has selected.
  */
  public double nursingCareAmount;

  /**
  The amount that this senior will pay per month for the activities and entertainment plan that he/she has selected
  */
  public double entertainmentAmount;

  /**
  The amount of financial support that this senior receives each month
  */
  private double fundingSupport;

  /**
  The residence within the retirement complex where this senior is currently living
  */
  private Residence home;

  /**
   This method constructs a Residence Senior with the specified senior's name,  nursing care, entertainment and residence fees, as well as the funding support
   @param seniorNameIn The name of the senior.
   @param nursingCareAmountIn The amount of the nursing care fee.
   @param entertainmentAmountIn The amount of the entertainment fee.
   @param fundingSupportIn The amount of the funding support.
   @param homeIn The residence where the senior is living.
  */
  public ResidenceSenior(String nameIn, double nursingCareAmountIn, double entertainmentAmountIn, double fundingSupportIn, String buildingNameIn, int unitNumberIn, double unitPriceIn)
  {
    name = nameIn;
    nursingCareAmount = nursingCareAmountIn;
    entertainmentAmount = entertainmentAmountIn;
    fundingSupport = fundingSupportIn;
    home = new Residence(buildingNameIn, unitNumberIn, unitPriceIn);
  }

  /**
   This method is called to change the name of the senior.
   @param currentName The new name for the senior.
  */
  public void setName(String currentName)
  {
    name = currentName;
  }

  /**
   This method is called to change the amount of nursing care fee.
   @param currentNursingCareAmount The new amount of nursing care fee.
  */
  public void setNursingCareAmount(double currentNursingCareAmount)
  {
    nursingCareAmount = currentNursingCareAmount;
  }

  /**
   This method is called to change the amount of entertainment fee.
   @param currentEntertainmentAmount The new amount of nursing care fee.
  */
  public void setEntertainmentAmount(double currentEntertainmentAmount)
  {
    entertainmentAmount = currentEntertainmentAmount;
  }

  /**
 This method is called to change the amount of funding support.
 @param currentFundingSupport The new amount of funding support.
*/
  public void setFundingSupport(double currentFundingSupport)
  {
    fundingSupport = currentFundingSupport;
  }

  /**
 This method is called to set a new residence for a senior.
 @param currentHome The new residence.
*/
  public void setHome(String currentBuildingNameIn, int currentUnitNumberIn, double currentUnitPriceIn)
  {
    home = new Residence(currentBuildingNameIn, currentUnitNumberIn, currentUnitPriceIn);
  }

  /**
 This method returns the the total fees that must be paid to the facility this month.
 @return The total fees of this month.
*/
  public double getTotalFeesOwing()
  {
    return nursingCareAmount + entertainmentAmount - fundingSupport + home.getUnitPrice();
  }

  /**
 This method  returns a textual string that includes the
senior's name and residence location
 @return The information about Senior's name and residence location.
*/
  public String getOnSiteMailLabel()
  {
    return name + "\n" + home.getBuildingName() + ", " + home.getUnitNumber();
  }
}
