import java.util.*;
public class virprefix{
  public static String Prefix(String[] strs)
  {
    if(strs==null || strs.length==0)
    {
      return "";
    }
    for(int i = 0; i < strs[0].length(); i++)
    {
      for(int j = 1; j < strs.length; j++)
      {
        if(i>=strs[j].length() || strs[j].charAt(i)!=strs[0].charAt(i))
        {
          return strs[0].substring(0,i);
        }
      }
    }
    return strs[0];
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String[] strs = new String[n];
    for(int i=0;i<n;i++)
    {
      strs[i] = sc.nextLine();
    }
    // virprefix vp = new virprefix();
    // String res =  vp.Prefix(strs);
    String res = Prefix(strs);
    System.out.println(res);
  }
}
