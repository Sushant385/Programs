import java.util.Scanner;
public class pro5
{
  public static void main(String[] args) {
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of matrix  :  ");
    int n = sc.nextInt();
    int a[][] = new int[n][n];
    System.out.println("Enter some values in matrix : ");
    for (i=0;i<n;i++) {
      for (j=0;j<n;j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("The output matrix is : ");
    for (i=0;i<n;i++) {
      for (j=0;j<n;j++) {
        if(i>j){
          a[i][j] = 0;
        }
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}
