import java.util.Scanner;
public class feboprime
{
  public static void main(String[] args) {
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter nth position : ");
    int n = sc.nextInt();
    if(n%2!=0)
    {
      int a=1;
      int b=1;
      int c = 0;
      if(n==1 || n==3)
      {
        System.out.println("The series number present in "+n+" location is : 1");
      }
      else{
      for(i=3;i<=(n/2)+1;i++)
      {
        c = a+b;
        a=b;
        b=c;
      }
      System.out.println("The series number present in "+n+" location is : "+c);
      }
    }
    else
    {
      int count = 0,flag = 0,num=1;
      while(count < n/2)
      {
        num++;
        for(i=2;i<num;i++)
        {
          if(num%i==0)
          {
            flag = 1;
            break;
          }
          else
          {
            flag = 0;
          }
        }
        if(flag == 0)
        {
          count++;
        }
      }
      System.out.println("The  series number present in "+n+" location is : "+num);
    }
  }
}
