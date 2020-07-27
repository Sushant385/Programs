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
TA = [[0,0,0],[0,0,0],[0,0,0]]
for i in range(0,n):
    for j in range(0,n):
        TA[i][j] = A[j][i] #Transpose of A
        
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
TB = [[0,0,0],[0,0,0],[0,0,0]]
for i in range(0,n):
    for j in range(0,n):
        TB[i][j] = B[j][i] #Transpose of B

AB =[[0,0,0],[0,0,0],[0,0,0]]
for i in range(0,len(A)):  #Multiplication of A * B
    for j in range(0,len(A[0])):
        for k in range(0,len(B)):
            AB[i][j] = AB[i][j]+A[i][k]*B[k][j]
            
TAB = [[0,0,0],[0,0,0],[0,0,0]]
for i in range(0,len(AB)):
    for j in range(0,len(AB[0])):
        TAB[i][j] = AB[j][i]  #Transpose of AB

if(TAB[i][j] == TB[i][j]*TA[i][j]):
    print("Equal")
else:
    print("not equal")
