// Check the given inputed matrix is Sparse matrix or not
import java.util.Scanner;
public class sparsematrix
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
    int zeros = 0;
    for(i=0;i<n;i++)
    {
      for (j=0;j<n;j++)
      {
          if(a[i][j]==0)
          {
            zeros++;
          }
      }
    }
    n=n*n;
    if(zeros>=n/2)
    {
      System.out.println("The given matrix is sparse ");
    }
    else
    {
      System.out.println("The given matrix is not sparce ");
    }
  }
}
