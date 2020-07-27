// WAP to print the numbers which are divisible by 7 but not multiple of 5
import java.util.Scanner;
public class train1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array  :  ");
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    System.out.println("Enter values  :  ");
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }
    System.out.println("The numbers present in array which is divisible by 7 but not multiple of 5 are  :");
    for(int i=0;i<n;i++)
    {
      if(a[i] % 7 == 0 && a[i] % 5 != 0)
      {
          System.out.print(a[i]+" ");
      }
    }
  }
}
