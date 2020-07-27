import java.util.Scanner;
public class arraydesc
{
  public static void main(String[] args) {
    int temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array : ");
    int n = sc.nextInt();
    System.out.println("Enter elements in the array : ");
    int a[] = new int[n];
    for (int i =0;i<n;i++)
    {
        a[i] = sc.nextInt();
    }
    for (int i=0;i<n;i++)
    {
      if(a[i]<0)
      {
        a[i] = 0;
      }
      for (int j = i+1;j<n;j++)
      {
          if(a[i]<a[j])
          {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
          }
      }
      System.out.print(a[i]+"  ");
    }
  }
}
