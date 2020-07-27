import java.util.*;
public class primediff
{
  static boolean prime(int n)
  {
    if(n<2){
      return false;
    }
    else{
      int i = 2;
      while(i<=n/2){
        if(n%i==0){
          return false;
        }
        i++;
      }
      return true;
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any range : ");
    int s  = sc.nextInt();
    int e = sc.nextInt();
    for(int i=s;i<=e;i++)
    {
      if(prime(i) == true){
        System.out.print(i+" ");
      }
    }
  }
}
