import java.util.Scanner;

public class pyramidtrain
{
  public static void main(String[] args)
  {
    int i,j,k,l,a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows");
    int n = sc.nextInt();
    for(i=0;i<n;i++)
    {
      a = 1;
      if (i==0)
      {
          b = n-1;
      }
      else
      {
        b = n-i;
      }
      for (j=0;j<n-i;j++)
      {
          System.out.print(a+" ");
          a++;
      }
      for(l=0;l<2*i-1;l++)
      {
        System.out.print("*"+" ");
      }

      for (k=0;k<=n-i-1;k++)
      {
        if(b>0)
        {
          System.out.print(b+" ");
          b--;
        }
      }
      System.out.println();
    }
  }
}
