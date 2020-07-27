import java.util.Scanner;

public class pro4
{
  public static void main(String[] args) {
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row size of matrix");
    int n = sc.nextInt();
    System.out.println("Enter value for matrix");
    int A[][] = new int[n][n];
    for (i=0;i<n;i++)
    {
        for (j=0;j<n;j++)
        {
          A[i][j] = sc.nextInt();
        }
    }
    System.out.println("The output matrix is : ");
    for (i=0;i<n;i++ )
    {
        for (j=0;j<n;j++)
        {
            if(i<j)
            {
              A[i][j] = 0;
            }
            System.out.print(A[i][j]+" ");
        }
        System.out.println();
    }
  }
}
