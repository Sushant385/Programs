import java.util.*;
public class bracketcount
{
  static boolean count(String s)
  {
    Stack <Character> st = new Stack<Character>();
    char val = '\0';
    for (int i=0;i<s.length();i++)
    {
      if ((s.charAt(i)=='[') || (s.charAt(i)=='{') || (s.charAt(i)=='('))
      {
          st.push(s.charAt(i));
      }
      else
      {
        if (st.isEmpty())
        {
            return false;
        }
        else
        {
           val = st.pop();
        }
        if (s.charAt(i)==']' && val!='[')
        {
            return false;
        }
        else if (s.charAt(i)=='}' && val!='{')
        {
            return false;
        }
        else if (s.charAt(i)==')' && val!='(')
        {
            return false;
        }
      }
  }
  return true;

}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter different brackets in one line : ");
    String s = sc.next();
    if (count(s)==true)
    {
        System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
