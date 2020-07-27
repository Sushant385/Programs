import java.util.Scanner;
public class arrayswap
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size for 1st array : ");
    int n = sc.nextInt();
    System.out.println("Enter the size for 2nd array : ");
    int m = sc.nextInt();
    int a[] = new int[m+n];
    int b[] = new int[m+n];
    int temp [] = new int[m+n];
    System.out.println("Enter elements in 1st arrays : ");
    for (int i=0;i<n;i++)
    {
        a[i] = sc.nextInt();
    }
    System.out.println("Enter elements in 2nd array : ");
    for(int j=0;j<m;j++)
    {
      b[j] = sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        temp[i] = a[i];
        a[i] = b[i];
        b[i] = temp[i];
    }
    System.out.print("After swapping 1st array :   ");
    for(int i=0;i<m; i++)
    {
      System.out.print(a[i]);
    }
    System.out.println();
    System.out.print("After swapping 2nd array :   ");
    for(int j=0;j<n;j++)
    {
      System.out.print(b[j]);
    }
  }
}
