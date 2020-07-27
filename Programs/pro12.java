import java.util.Scanner;
public class pro12
{
  public static void main(String[] args) {
    int i=0,j=0,c=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of rows");
    int m = sc.nextInt();
    System.out.println("Enter no of cols");
    int n = sc.nextInt();
    int a[][] = new int[m][n];
    System.out.println("Enter the number : ");
  /*  for (i=0;i<m;i++)
    {
        for (j=0;j<n;j++)
        {
          a[i][j] = sc.nextInt();
        }
    }*/
    System.out.println("Your matrix is : ");
    for(i=0,j=0;i<m && j<n ;i++,j++)
    {
      for(j=0;j<n;j++)
      {
        if(a[i][j]>=0 && a[i][j]<n){
        System.out.print(c+" ");
        c++;
      }
      }
      System.out.println();
      for (j=m-1;j>i+1;j--)
      {
        if(a[i][j]==a[i+1][j]){
          System.out.println(c+" ");
          c++;
        }
      }
      System.out.println();
    }
  }
}
