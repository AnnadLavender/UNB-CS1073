/**
This is a driver program.
 @author Ngoc Phuong Anh Nguyen 3712361
*/
public class DogTestDriver
{
  public static void main (String[] args)
  {
    // Dog Objects
    Dog dog1 = new Dog("Kiki",3);
    Dog dog2 = new Dog("Donut",4);
    Dog dog3 = new Dog("Sashimi",2);

    // Change the name of the second Dog object.
    dog2.setName("Hamburger");

    // Record the fact that the third Dog object had a birthday (increase his age).
    dog3.age = dog3.increaseAge();

    System.out.println ("Dog 1:\n" + "Dog name: " + dog1.name + "\nAge: " + dog1.age + "\nAge in person years: " + dog1.getAgeInPersonYears() + "\n");
    System.out.println ("Dog 2:\n" + "Dog name: " + dog2.name + "\nAge: " + dog2.age + "\nAge in person years: " + dog2.getAgeInPersonYears() + "\n");
    System.out.println ("Dog 3:\n" + "Dog name: " + dog3.name + "\nAge: " + dog3.age + "\nAge in person years: " + dog3.getAgeInPersonYears() + "\n");
  }
}
