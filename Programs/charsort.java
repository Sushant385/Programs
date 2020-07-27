import java.util.Scanner;
public class charsort
{
  public static void main(String[] args) {
    char temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String : ");
    String str = sc.nextLine();
    char s[] = new char[str.length()];
    for (int i = 0;i<str.length();i++)
    {
        s[i] = str.charAt(i);
    }
    for (int i=0;i<s.length;i++)
    {
      for (int j=i+1;j<s.length;j++)
      {
          if(s[i]>s[j])
          {
              temp = s[i];
              s[i] = s[j];
              s[j] = temp;
          }
      }
    }
    for(int i=0;i<str.length();i++)
    {
      System.out.print(s[i]+" ");
    }
  }
}
