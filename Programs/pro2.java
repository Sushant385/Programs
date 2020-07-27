import java.util.Scanner;

public class pro2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value for n");
    int n = sc.nextInt();
    System.out.println("Your pyramid is : ");
    int i,j,c=1,m;
    for (i=1;i<=n;i++)
    {
      m = c+i-1;
      for (j=1;j<=i;j++)
      {
        if (i%2==0)
        {
          System.out.print(m+" ");
          m--;
          c++;
        }
        else
        {
          System.out.print(c+" ");
          c++;
        }
      }
      System.out.println();;
    }
  }
}
