import java.util.*;
public class reverse_string
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    String o = "";
    String s = String.valueOf(i);
    int n = s.length()-1;
    if(s.charAt(0)=='-')
    {
      o+='-';
    }
    while(n>=0)
    {
      if(s.charAt(n)=='-'){
        break;
      }
      o+= s.charAt(n);
      n-=1;
    }
    System.out.print(o);
  }
}
