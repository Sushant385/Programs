public class magicsquare
{
	public static void main(String[] args) {
	    int row,col,n=3,m=1,count=0;
	    row=0;
	    col = n/2;
			int a[][] = new int[n][n];
	    while(m<=n*n)
	    {
	        a[row][col] = m;
	        m++;
					count++;
				//	row--;
				//	col++;
	        if(row==-1)
	        {
	            row = n-1;
	        }else{
						row--;
					}
	        if(col==n)
	        {
	            col=0;
	        }else{
						col++;
					}
	        if(count == n)
	        {
						if(row==-1)
						{
								row = n-1;
						}else{
							row--;
						}
						if(col==n)
						{
								col=0;
						}else{
							col++;
						}
						count = 0;
	        }

	    }
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            System.out.print(a[i][j]+"  ");
	        }
	         System.out.println();
	    }
	}
}
