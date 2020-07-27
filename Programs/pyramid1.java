import java.util.Scanner;

public class pyramid1
{
  public static void main(String[] args) {
    int i,j;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m =1;
    for (i=1;i<=n;i++)
    {

        for (j=1;j<=i;j++)
        {
            System.out.print(m);
            m++;
        }
        m++;
        System.out.println(" ");
    }
  }
}
