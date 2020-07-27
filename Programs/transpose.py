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
B =[[0,0,0],[0,0,0],[0,0,0]]
for i in range(0,n):
    for j in range(0,n):
        B[i][j] = A[j][i]
for i in range(0,len(A)):
    for j in range(0,len(A[0])):
        print(B[i][j],end=' ')
    print('\n')
