import java.util.Scanner;
public class pro7
{
  public static void main(String[] args) {
    int i,j,k,temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of matrix");
    int n = sc.nextInt();
    int a[][] = new int[n][n];
    System.out.println("Enter matrix element");
    for (i=0;i<n;i++) {
      for (j=0;j<n;j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("The answer is : ");
    for (i=0;i<n;i++) {
      for (j=0,k=n-1;j<n && k>=0;j++,k--) {
        if (i==j) {
          temp = a[i][j];
          a[i][j] = a[i][k];
          a[i][k] = temp;
        }
      }
    }
    for (i=0;i<n;i++) {
      for (j=0;j<n;j++) {
        System.out.print(a[i][j]+" ");
      }
        System.out.println();
    }
  }
}
