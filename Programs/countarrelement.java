import java.util.*;
public class countarrelement
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = {3,1,2,3,3};
    List <Integer> l = new ArrayList<Integer>();
    Set <Integer> s = new HashSet<Integer>();
    for (int i = 0;i<a.length;i++)
    {
        s.add(a[i]);
    }
    System.out.println(s);
    for(Integer i : s)
    {
      int c = 0;
      for (int j=0;j<a.length;j++)
      {
          if (i==a[j])
          {
              c++;
          }
      }
      l.add(c);
    }

    System.out.println(a.length-Collections.max(l));
  }
}
