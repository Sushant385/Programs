n = int(input('Enter the size of 1st matrix'))
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
m = int(input('Enter the size of 2nd matrix'))
B =[]
p = []
q = []
r = []
for i in range(0,n,1):
    p.append(int(input()))
for j in range(0,n,1):
    q.append(int(input()))
for k in range(0,n,1):
    r.append(int(input()))
B.append(p)
B.append(q)
B.append(r)

C =[[0,0,0],[0,0,0],[0,0,0]]
print('Here is your output for multiplication of matrix')
for i in range(0,len(A)):
    for j in range(0,len(A[0])):
        for k in range(0,len(B)):
            C[i][j] = C[i][j]+A[i][k]*B[k][j]
        print(C[i][j],end=' ')
    print('\n')
