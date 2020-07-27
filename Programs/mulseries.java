import java.util.Scanner;
public class mulseries
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n'th term : ");
    int n = sc.nextInt();
    if(n%2==0)
    {
      int val = 1;

        for (int i=2;i<=n/2;i++)
        {
          val = 3*val;
        }
        System.out.println("The number present at "+n+" location is : "+val);
    }
    else
    {
      int x = 1;
      for (int i=2;i<=(n/2)+1;i++)
      {
        x = 2*x;
      }
      System.out.println("The number present at "+n+" location is : "+x);
    }
  }
}
