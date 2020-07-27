import java.util.Scanner;
public class arr
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array : ");
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    int temp [] = new int[n];
    System.out.println("Enter elements in 1st arrays : ");
    for (int i=0;i<n;i++)
    {
        a[i] = sc.nextInt();
    }
    System.out.println("Enter elements in 2nd array : ");
    for(int j=0;j<n;j++)
    {
      b[j] = sc.nextInt();
    }
    System.out.print("Before swaping 1st array : ");
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]);
    }
    System.out.println();
    System.out.print("Before swapping 2nd array : ");
    for (int j=0;j<n;j++)
    {
        System.out.print(b[j]);
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        temp[i] = a[i];
        a[i] = b[j];
        b[j] = temp[i];
      }
    }
    System.out.println();
    System.out.print("After swapping 1st array :  ");
    for(int i=0;i<n; i++)
    {
      System.out.print(a[i]);
    }
    System.out.println();
    System.out.print("After swapp 2nd array :  ");
    for(int j=0;j<n;j++)
    {
      System.out.print(b[j]);
    }

  }
}
