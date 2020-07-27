import sys
import numpy as np
n=int(input('Enter no of rows'))
m=(2*n)-1
a = np.zeros(n*m).reshape(n,m)
row = 0
col = int(m/2)
for i in range(1,n+1,1):
    for j in range(1,((2*i)-1)+1,1):
        a[row][col] = int(input())
        col += 1
    row += 1
    col = col-row-i
for i in range(0,n,1):
    for j in range(0,m,1):
        print(int(a[i][j]),end=' ')
    print('\n')
 
c=int(m/2)
Sum =a[0][c]
for i in range(1,n,1):
    Min = sys.maxsize
    if(a[i-1][c+1]!=0):
        Min=a[i-1][c+1]
    e=[a[i][c-1],a[i][c],a[i][c+1]]
    x=c-1
    for k in range(0,len(e)):
        if(e[k]<=Min):
            Min=e[k]
            c=x+k
    Sum = Sum+Min
for i in range(c+1,m,1):
    Sum+=a[n-1][i]
print('The sum of shortest path is : ',int(Sum))
