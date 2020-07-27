import java.util.Scanner;

public class twosum
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array   :   ");
      int n = sc.nextInt();
      int a[] = new int[n];
      System.out.println("Enter some numbers  :   ");
      for (int i=0;i<n;i++)
      {
          a[i] = sc.nextInt();
      }
      System.out.println("Enter the sum you want  :  ");
      int sum = sc.nextInt();
      for (int i=0;i<n;i++)
      {
          for (int j=i+1;j<n;j++)
          {
              if(a[i]+a[j]==sum)
              {
                System.out.print("["+a[i]+","+a[j]+"]");
              }
          }
      }
  }
}
