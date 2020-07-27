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
Max = 0
for m in range(0,len(A)):
    for n in range(0,len(A[0])):
       if A[m][n]>Max:
           Max = A[m][n]
       else:
           Max = Max
print("The maximum element in the matrix is : ",Max)
