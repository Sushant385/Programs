/* JAVA program to delete consonant*/
import java.util.Scanner;
public class delconsonant
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any String : ");
    String str = sc.nextLine();
    str = str.toLowerCase();
    String str1=" ";
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
      {
        System.out.print(str.charAt(i));
      }
    }
  }
}
