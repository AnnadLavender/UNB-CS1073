/**
  This is an example of a driver program; its purpose is
  to "try out" the Candidate class.
  @author Natalie Webber
  @author Ngoc Phuong Anh Nguyen 2712361
*/
public class Election
{
   public static void main (String[] args)
   {
      // Create a few Candidate objects:
      Candidate candidate1 = new Candidate ("Ron McDonald", "Conservative Party", "Prosperity and Progress");
      Candidate candidate2 = new Candidate ("Wendy Thomas", "Green Party", "Taking Action, Getting Results");
      Candidate candidate3 = new Candidate ("Mary Brown", "Liberal Party", "Make People Smile Again");
      Candidate candidate4 = new Candidate ("Rose Webber", "Peace Party", "Be Happy Everyday");

      candidate1.numVotes = candidate1.AddVotes(280);
      candidate2.numVotes = candidate2.AddVotes(211);
      candidate3.numVotes = candidate3.AddVotes(342);
      candidate2.numVotes = candidate2.AddVotes(153);

      // Now I can print out my candidates, just to confirm that
      // they were created properly:
      System.out.println ("Candidate 1:\n" + candidate1.toString());
      System.out.println ("Candidate 2:\n" + candidate2.toString());
      System.out.println ("Candidate 3:\n" + candidate3.toString());
      System.out.println ("Candidate 4:\n" + candidate4.toString());
   }
} // end of Election class
