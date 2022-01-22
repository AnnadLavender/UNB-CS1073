/**
This class represents a candidate in an election.
@author Natalie Webber
@author Ngoc Phuong Anh Nguyen 2712361
*/
public class Candidate
{
   // Instance variables:
   // For each Candidate object, store his/her name,
   // the number of votes he/she has received so far,
   // and his/her political party.
   private String name;
   public int numVotes;
   private String party;
   private String slogan;

   // The constructor creates a new Candidate object
   // and initializes the instance variables.
   public Candidate (String nameIn, String partyIn, String sloganIn)
   {
      name = nameIn;
      numVotes = 0; //no votes counted yet
      party = partyIn;
      slogan = sloganIn;
   }

   public int AddVotes(int number)
   {
     return numVotes+=number;
   }

   // This is a method that we can call on a Candidate
   // object. (Specifically, it is an accessor method).
   // This method creates and returns a String containing
   // all the information about the state of the object.
   public String toString ()
   {
      return ("Name: "  + name + "\n" + "Number of Votes: "  + numVotes + "\n" + "Party: " + party + "\n" + "Slogan: " + slogan + "\n");
   }

} // end of Candidate class
