import java.util.*;
public class twostringvir
{
  public static void main(String[] args) {
    String s1 = "hi";
    String s2 = "world";
    Set <Character> l1 = new HashSet<Character>();
    Set <Character> l2 = new HashSet<Character>();
    List <Character> ls1 = new ArrayList<Character>();
    List <Character> ls2 = new ArrayList<Character>();
    for(int i=0;i<s1.length();i++)
    {
      l1.add(s1.charAt(i));
    }
    for (int j=0;j<s2.length();j++)
    {
        l2.add(s2.charAt(j));
    }
    for(Character x : l1)
      ls1.add(x);
    for(Character y : l2)
      ls2.add(y);
    for(int i=0;i<l1.size();i++)
    {
      for(int j=0;j<l2.size();j++)
      {
        if(ls1.get(i)==ls2.get(j))
        {
          System.out.println("Yes");
        }
      }
    }
    System.out.println("No");

  }
}
