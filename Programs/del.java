public class del
{
  public static void main(String[] args) {
    int a[] = new int[]{1,2,3,2,4,3,5};
    int b[] = new int[10];
    b[0] = a[0];
    int m =2;
    for (int i=1,k=1;i<a.length && k<m ;i++)
    {
      if (b[k]!=a[i])
      {
        k++;
          b[k] = a[i];
          m++;
      }
    }
    System.out.println("output");
    for(int i =0 ; i<10;i++)
    {
      System.out.println(b[i]);
    }
  }
}
