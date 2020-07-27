import java.util.*;
public class longpalindrome
{
  static boolean palindrome(String s)
  {
    int i = 0,j = s.length()-1;
    while(i!=j)
    {
        if(s.charAt(i)==s.charAt(j))
        {
          i++;
          j--;
        }
        else{
          return false;
        }
    }
    return true;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter lines : ");
    String s = sc.nextLine();
    String[] word = s.split(" ");
    int c = 0;
    List <String> st = new ArrayList<>();
    for(int i=0;i<word.length;i++)
    {
      if (palindrome(word[i])==true)
      {
          st.add(word[i]);
      }
    }
    int max = 0;
    String str = " ";
    for(int i=0;i<st.size();i++)
    {
      if(st.get(i).length()>max)
      {
        max = st.get(i).length();
        str = st.get(i);
      }
    }
    System.out.println(max+"  "+str);
  }
}
