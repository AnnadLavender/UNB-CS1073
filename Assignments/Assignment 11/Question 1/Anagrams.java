/**
  This class is used to check Anagrams.
  @uthor Ngoc Phuong Anh Nguyen 3712361
*/

public class Anagrams
{
  private int CHARACTER_RANGE= 123;
  public boolean checkAnagram(String string1, String string2)
  {
    string1 = string1.toLowerCase();
    string2 = string2.toLowerCase();
    int count[] = new int[CHARACTER_RANGE];

    if (string1.length() != string2.length())
    {
      return false;
    }

    for (int i = 0; i < string1.length(); i++)
    {
      count[string1.charAt(i)]++;
      count[string2.charAt(i)]--;
    }
    for (int i = 0; i < CHARACTER_RANGE; i++)
    {
      if (count[i] != 0)
      {
        return false;
      }
    }
    return true;
  }
}
