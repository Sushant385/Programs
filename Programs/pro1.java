import java.util.Scanner;

public class pro1
{
  public static void main(String[] args)
  {
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value for n");
    int n = sc.nextInt();
    System.out.println("Your pyramid is : ");
    int k = 1;
    int l = 0,m=0;
    for (i=1;i<=n;i++)
    {
        l = m+k+1;
        m=i-1;
        for (j=1;j<=i;j++)
        {
            if (i%2==0)
            {
                System.out.print(l);
                l--;
                k++;
            }
            else
            {
              System.out.print(k);
              k++;
            }
        }
        System.out.println();
    }
  }
}
