// Program for matrix multiplication
import java.util.Scanner;
public class matmultiply
{
  public static void main(String[] args) {
    int i,j,k;
    Scanner sc = new Scanner(System.in);
    System.out.println("Both matrix must be same size of square matrix ");
    System.out.println("Enter size of 1st matrix : ");
    int n = sc.nextInt();
    int a[][] = new int[n][n];
    System.out.println("Enter the elements for 1st matrix : ");
    for (i=0;i<n;i++)
    {
        for (j=0;j<n;j++)
        {
            a[i][j] = sc.nextInt();
        }
    }
    System.out.println("Enter size of 2nd matrix : ");
    int m = sc.nextInt();
    int b[][] = new int[m][m];
    System.out.println("Enter the elements for 2st matrix : ");
    for (i=0;i<m;i++)
    {
        for (j=0;j<m;j++)
        {
            b[i][j] = sc.nextInt();
        }
    }
    System.out.println("Here is your answer : ");
    int c[][] = new int[n][n];
    for (i=0;i<n;i++)
    {
      for (j=0;j<n;j++)
      {
        for (k=0;k<m;k++)
        {
          c[i][j] = c[i][j]+(a[i][k]*b[k][j]);

        }  System.out.print(c[i][j]+"  ");
      }
      System.out.println();
    }
  }
}
