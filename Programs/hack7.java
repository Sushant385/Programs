public class hack7
{
  public void findSum(int n)
  {
    String l = String.valueOf(n);
    int c = 0;
    int a[] = new int[l.length()];
    for(int i=0;i<l.length();i++)
    {
      a[i] = l.charAt(i);
    }

    System.out.println(a);
  }
  public static void main(String[] args)
  {
      hack7 h = new hack7();
      h.findSum(12);
  }
}
