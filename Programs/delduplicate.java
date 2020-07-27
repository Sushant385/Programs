import java.util.Scanner;
public class delduplicate
{
  public static void main(String[] args) {
    int temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array : ");
    int n = sc.nextInt();
    int a[] = new int[n];
    //int b[] = new int[n];
    System.out.println("Enter elements into array : ");
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }
    System.out.println("After deleting duplicates : ");
    for (int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]==a[j])
        {
          a[i] = -1;
        }
      }
    }
    for (int i=0;i<n;i++)
    {
      if (a[i]!=-1) {
        System.out.print(a[i]+" ");
      }
    }
  }
}
