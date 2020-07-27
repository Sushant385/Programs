// Java program to find all permutations of a string
import java.util.Scanner;
public class permutation
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String : ");
    String str = sc.nextLine();
    char ch[] = new char[str.length()];
    for (int i=0;i<str.length();i++)
    {
        ch[i] = str.charAt(i);
    }
    for (int i=ch.length-1;i>=0;i--)
    {
        for (int j=1;j<=i-1;j++)
        {
            System.out.print(ch[i]+""+ch[j]);
        }
        System.out.println();
    }
  }
}
