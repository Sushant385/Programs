import java.util.Scanner;
public class ms
{
	public static void main(String[] args) {
		int i=0,j=0,m=1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];

		while(i<n)
		{
		    while(j<n)
		    {
		        a[0][n/2] = 1;
		        m++;
		         i--;
		         j++;

		        if(i<0)
		        {
		            i=n-1;
		        }
		        if(j>n-1)
		        {
		            j=0;
		        }
		        a[i][j] = m;
		    }
				i++;
		}
		for(int p=0;p<n;p++)
		{
		    for(int q=0;q<n;q++)
		    {
		        System.out.print(a[p][q]+" ");
		    }
		    System.out.println();
		}
	}
}
