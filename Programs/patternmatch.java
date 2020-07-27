public class patternmatch
{
  public static void main(String[] args)
  {
    int c=0;
    String t;
    String s = "aababaaaabc";
    String p = "aa";
    for(int i=0;i<s.length()-p.length();i++)
    {
      t = s.substring(i,i+2);
      System.out.print(t+" ");
      if(p.equals(t))
      {
        c = c+1;
      }
    }
    System.out.println(c);
  }
}
