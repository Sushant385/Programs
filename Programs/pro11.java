import java.util.Scanner;

public class pro11
{
  public static void main(String[] args) {
    int m=1;
    Scanner sc = new Scanner(System.in);
    int rs=0,cs=0;
    System.out.println("Enter size of row");
    int re = sc.nextInt();
    System.out.println("Enter size of column");
    int ce = sc.nextInt();
    int a[][] = new int[re][ce];
    int p=re,q=ce;
	    while(cs<ce || rs<re)
	    {
	        for(int i=cs;i<ce;i++)
	        {
	            a[rs][i] = m;
	            m++;
	        }
	        rs = rs+1;
	        for(int i=rs;i<re;i++)
	        {
	            a[i][ce-1] = m;
	            m++;
	        }
	        ce = ce-1;
	        for(int i=ce-1;i>=cs;i--)
	        {
	            a[re-1][i] = m;
	            m++;
	        }
	        re = re-1;
	        for(int i=re-1;i>=rs;i--)
	        {
	            a[i][cs] = m;
	            m++;
	        }
	        cs = cs+1;
	    }
      System.out.println("Here is your output");
	    for(int i=0;i<p;i++)
	    {
	        for(int j=0;j<q;j++)
	        {
	            System.out.print(" "+a[i][j]+" ");
	        }
	        System.out.println();
	    }
  }
}
