// Java program to check whether two strings are anagram to each other or not
import java.util.Scanner;
public class anagramno
{
  public static void main(String[] args) {
    char temp,temp1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st String : ");
    String str = sc.nextLine();
    System.out.println("Enter 2nd String : ");
    String str1 = sc.nextLine();
    char s1[] = new char[str.length()];
    char s2[] = new char[str1.length()];
    char s4[] = new char[s1.length];
    if (str.length()!=str1.length())
    {
        System.out.println("Both are not ANAGRAM ");
    }
    else
    {
        for (int i=0;i<str.length();i++)
        {
            s1[i] = str.charAt(i);
            s2[i] = str1.charAt(i);
        }
        for (int i=0;i<s1.length;i++)
        {
          for(int j=0;j<s1.length;j++)
          {
            if (s1[i]<s1[j])
            {
                temp = s1[i];
                s1[i] = s1[j];
                s1[j] = temp;
            }
            if (s2[i]<s2[j])
            {
              temp1 = s2[i];
              s2[i] = s2[j];
              s2[j] = temp1;
            }
          }
        }
        int i = 0;
        while(i<s1.length)
        {
          System.out.println(s1[i]+"=="+s2[i]);
            if (s1[i]!=s2[i])
            {
                System.out.println("Both are not Anagram");
                s4[i] = s2[i];
                break;
            }
            else{
              i++;
              if(i==s1.length){
              System.out.println("Both are  Anagram");
            }
          }
        }
        for (int z=0;z<s4.length;z++)
        {
            System.out.print(s4[z]);
        }
        System.out.println(s4.length);
    }
  }
}
