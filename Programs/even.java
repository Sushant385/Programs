import java.util.Scanner;
public class even
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    if (n%2==0)
    {
      if(n<0){
        System.out.println(n +"  is a negative even number");
      }
      else{
        System.out.println(n +"  is positive even number");
      }
    }
    else{
      if(n<0){
        System.out.println(n +"  is negative odd number");
      }
      else{
        System.out.println(n +"  is positive odd number");
      }
    }
  }
}
