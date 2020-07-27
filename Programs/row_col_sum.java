import java.util.Scanner;
public class row_col_sum
{
  public static void main(String[] args) {
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of matrix : ");
    int n = sc.nextInt();
    int a[][] = new int[n][n];
    System.out.println("Enter elements in matrix : ");
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("Here is your answer : ");
    for(i=0;i<n;i++)
    {
      int rowsum = 0;
      int colsum = 0;
      for (j=0;j<n;j++)
      {
          rowsum = rowsum+a[i][j];
          colsum = colsum+a[j][i];
      }
      System.out.print(rowsum+" ");
      System.out.println(colsum+" ");
    }
  }
}
