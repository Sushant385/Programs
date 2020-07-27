n = int(input('Enter the size of row matrix'))
#m = int(input('Enter the size of the column of the matrix'))
A = []
a = []
b = []
c = []
for i in range(0,n,1):
    a.append(int(input()))
for j in range(0,n,1):
    b.append(int(input()))
for k in range(0,n,1):
    c.append(int(input()))
A.append(a)
A.append(b)
A.append(c)

rs = []
cs = []
Max = 0
Maxcol = 0
for i in range(0,len(A)):
    rowsum = 0
    colsum = 0
    for j in range(0,len(A[0])):
        rowsum += A[i][j]
        #if(rowsum>Max):
         #   Max = A[i][j]
        colsum += A[j][i]
        #if(colsum>Max):
         #   Maxcol = A[j][i]
    rs.append(rowsum)
    cs.append(colsum)
print(rs)
print(cs)
'''
print("The maximum sum of the row no. is : ",Max)
print("The maximum sum of the column no. is : ",Maxcol)
'''

        

