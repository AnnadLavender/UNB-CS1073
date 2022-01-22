/**
 This class represents a dog.
 @author Ngoc Phuong Anh Nguyen 3712361
*/
public class Dog
{

   /**
    The name of the dog.
   */
   public String name;

   /**
    The age of the dog (in years).
   */
   public int age;

   /**
    This method constructs a Dog with the specified
    name and age.
    @param nameIn The name of the dog.
    @param ageIn The age of the dog (in years).
   */

   public Dog(String nameIn, int ageIn)
   {
     name = nameIn;
     age = ageIn;
   }

   /**
    This method retrieves the name of the dog.
    @return The name of the dog.
   */
   public String getName()
   {
     return name;
   }

   /**
    This method retrieves the age of the dog.
    @return The age of the dog (in years).
   */
   public int getAge()
   {
     return age;
   }

   /**
    This method computes and returns the dog's age in
    "person years".
    @return The age of the dog (in person years).
   */
   public int getAgeInPersonYears()
   {
     return age*7;
   }

   /**
    This method is called to change the name of the dog.
    @param nameIn The new name for the dog.
   */
   public void setName(String nameIn)
   {
     name = nameIn;
   }

   /**
    This method is called to increase the age of the dog
    by one year.
   */
   public int increaseAge()
   {
     return age +=1;
   }

} //end Dog
