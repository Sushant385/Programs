// Find transpose of a matrix
import java.util.Scanner;
public class transpose
{
  public static void main(String[] args) {
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of the matrix : ");
    int n = sc.nextInt();
    int a[][] = new int[n][n];
    System.out.println("Enter the elements in the matrix : ");
    for (i=0;i<n;i++)
    {
        for (j=0;j<n;j++)
        {
            a[i][j] = sc.nextInt();
        }
    }
    int b[][] = new int[n][n];
    System.out.println("The transpose of the matrix is : ");
    for (i=0;i<n;i++)
    {
      for (j=0;j<n;j++)
      {
          b[i][j] = a[j][i];
          System.out.print(b[i][j]+" ");
      }
      System.out.println();
    }
  }
}
