import java.util.Scanner;
public class pythagoriantriplets
{
  public static void main(String[] args) {
    int i,j,k;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter upto what number you want to print pythagoriantriplets : ");
    int n = sc.nextInt();
    System.out.println("Here is your ANSWER : ");
    for(i=0;i<=n-3;i++)
    {
      for(j=i+1;j<=n-2;j++)
      {
        for(k=j+1;k<=n-1;k++)
        {
          if ((Math.pow(i,2)+Math.pow(j,2) == Math.pow(k,2)))
          {
            System.out.println(i+"  "+j+"  "+k);
          }
        }
      }
    }
  }
}
