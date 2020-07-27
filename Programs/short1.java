import java.util.Scanner;
public class short1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix : ");
		int n = sc.nextInt();
		int m = ((2*n)-1);
		//int row = 0;
		int col = m/2;
		int a[][] = new int[n][m];
		System.out.println("Enter the elements in the matrix : ");
		for (int i=1;i<=n;i++)
		{
				for(int j=1;j<=((2*i)-1);j++)
				{
					a[i-1][col] = sc.nextInt();
					col++;
				}
				//row++;
				//col = col-row-i;
				col = col-2*i;
		}
		System.out.println("This is your inputed matrix");
		for (int i=0;i<n;i++)
		{
				for(int j=0;j<m;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
		}
		int c = m/2;
		int sum = a[0][c];
		int min;
		for (int i=1;i<n;i++)
		{
				min = 1024;
				if (a[i-1][c+1]!=0)
				{
						min = a[i-1][c+1];
				}
				int b[] = new int[]{a[i][c-1],a[i][c],a[i][c+1]};
				int x = c-1;
				for(int k=0;k<b.length;k++)
				{
					if(b[k]<=min)
					{
						min=b[k];
						c=x+k;
					}
				}
				sum = sum+min;
		}
		for(int i=c+1;i<m;i++)
		{
			sum = sum+a[n-1][i];
		}
		System.out.println("The sum of shortest diatance is : "+sum);
	}
}
