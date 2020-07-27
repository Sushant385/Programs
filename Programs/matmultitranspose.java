// AB' = B'*A'
import java.util.Scanner;
public class matmultitranspose
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
            a[i][j] = sc.nextInt();  // matrix a
        }
    }
    int ta[][] = new int[n][n];
    for (i=0;i<n;i++)
    {
      for (j=0;j<n;j++)
      {
          ta[i][j] = a[j][i];  // transpose a
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
            b[i][j] = sc.nextInt();   // matrix b
        }
    }
    int tb[][] = new int[m][m];
    for (i=0;i<m;i++)
    {
      for (j=0;j<m;j++)
      {
          tb[i][j] = b[j][i];  // transpose b
      }
    }
    int tbta[][] = new int[n][n];
    for (i=0;i<n;i++)
    {
      for (j=0;j<n;j++)
      {
        for (k=0;k<m;k++)
        {
          tbta[i][j] = tbta[i][j]+(ta[i][k]*tb[k][j]);  // matrix b'*a'
        }
      }
    }
    System.out.println("Here is your answer : ");
    int ab[][] = new int[n][n];
    for (i=0;i<n;i++)
    {
      for (j=0;j<n;j++)
      {
        for (k=0;k<m;k++)
        {
          ab[i][j] = ab[i][j]+(a[i][k]*b[k][j]);  // matrix ab
        }
      }
    }
    int tab[][] = new int[n][n];
    for (i=0;i<m;i++)
    {
      for (j=0;j<m;j++)
      {
          tab[i][j] = ab[j][i];  // transpose ab
      }
    }
    if (tab == tbta)
    {
        System.out.println("Transpose of AB is equal to Transpose of B into(*) Transpose of A");
    }
    else{
      System.out.println("Transpose of AB is not equal to Transpose of B into(*) Transpose of A");
    }
  }
}
