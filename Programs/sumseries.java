import java.util.Scanner;
public class sumseries
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n'th term : ");
    int n = sc.nextInt();
    if(n%2==0)
    {
      int x = 0;
      for (int i=2;i<=n/2;i++)
      {
          x = x+6;
      }
      System.out.println("The number present at "+n+" location is : "+x);
    }
    else
    {
      int y = 0;
      for (int i=2;i<=(n/2)+1;i++)
      {
          y = y+7;
      }
      System.out.println("The number present at "+n+" location is : "+y);
    }
  }
}
