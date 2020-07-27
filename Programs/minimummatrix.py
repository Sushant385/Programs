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

for i in range(0,n,1):
    for j in range(0,n,1):
        Min = A[i][j]
        if(A[i][j]<Min):
            Min = A[i][j]
        else:
            Min = Min
print("Minimum is : ",Min)
