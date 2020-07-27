// Find the biggest and smallest element in a inputed matrix

import java.util.Scanner;
public class mat_max_no
{
  public static void main(String[] args) {
    int i,j,max=0,min=32767;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of matrix");
    int n = sc.nextInt();
    int a[][] = new  int[n][n];
    System.out.println("Enter the element in matrix : ");
    for (i=0;i<n;i++)
    {
      for (j=0;j<n;j++)
      {
          a[i][j] = sc.nextInt();
      }
    }
    for (i=0;i<n;i++)
    {
        for (j=0;j<n;j++)
        {
            if (a[i][j]>max)
            {
                max = a[i][j];
            }
            if (a[i][j]<min)
            {
                min = a[i][j];
            }
        }
    }
    System.out.println("The maximum value is : "+max);
    System.out.println("The minimum value is : "+min);
  }
}
