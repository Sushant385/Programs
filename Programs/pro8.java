// alphanumeric character count
import java.util.Scanner;

public class pro8
{
  public static void main(String[] args) {
    int i,j,c=0,d=0,s=0,sp=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your line : ");
    String str = sc.nextLine();
    for (i=0;i<str.length();i++)
    {
        if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z'){
          c++;
        }
        else if(str.charAt(i) == ' '){
          s++;
        }
        else if((int)str.charAt(i)>=33 && (int)str.charAt(i)<=47 || (int)str.charAt(i)>=58 && (int)str.charAt(i)<=64 || (int)str.charAt(i)>=91 && (int)str.charAt(i)<=96){
          sp++;
        }
        else{
          d++;
        }
    }
    System.out.println("No of Alphabets are : "+ c);
    System.out.println("No of digits are : "+d);
    System.out.println("No of spaces are : "+s);
    System.out.println("No of special character are : "+sp);
  }
}
