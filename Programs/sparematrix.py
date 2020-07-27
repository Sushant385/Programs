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

zero = 0

for i in range(0,len(A),1):
    for j in range(0,len(A[0]),1):
        if(A[i][j]==0):
            zero += 1
n = n*n
if(zero>=n//2):
    print("Spare matrix")
else:
    print("Not Spare Matrix")

