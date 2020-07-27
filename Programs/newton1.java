import java.util.*;
public class newton1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String s1=sc.nextLine();
for(int i=0;i<s1.length();i++){
s1=s1.replace("01","");
}
if(s1.length()==0){
  System.out.print("-1");
}else{
  System.out.print(s1);
}
}}
