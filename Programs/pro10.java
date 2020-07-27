// find the word(s) with the highest number of characters
import java.util.Scanner;

public class pro10
{
  public static void main(String[] args) {
    int i,max=0;
    Scanner sc = new Scanner(System.in);
    /*System.out.println("Enter the number of words you want to enter  : ");
    int n = sc.nextInt();
    System.out.println("Enter your words : ");
    String str[] = new String[n];
    String str1 = " ";
    for(i=0;i<n;i++)
    {
      str[i] = sc.next();
      if(str[i].length()>max){
        max = str[i].length();
        str1 = str[i];
      }
    }*/
    try{
    String a = " ";
    String str = sc.nextLine();
    String A[] = str.split(" ",5);
    for (i=0;i<=str.length();i++) {
      if(A[i].length()>max){
        max = A[i].length();
        a = A[i];
      }
    }
    System.out.println("The longest word is : "+a);
  }
  catch (Exception e){
    System.out.println(e);
  }
  }
}
