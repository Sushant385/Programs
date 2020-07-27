import java.util.*;
public class substring
{
  public static void main(String[] args) {
    String s = "welcometojava";
    int k = 3;
    String sub = " ";
    int n = s.length()-k;
    String a[] = new String[n+1];
    String temp;
    for(int i=0;i<=n;i++)
    {
      a[i] = s.substring(i,i+k);
    }
    for(int i=0;i<a.length;i++)
    {
      for (int j=i+1;j<a.length;j++) {
        if (a[i].compareTo(a[j])>0)
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
      }
    }
    System.out.println(a[0] +" ");
    System.out.println(a[a.length-1]);
  }
}
