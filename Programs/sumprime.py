def isprime(n):
    if n<2:
        return False
    i=2
    while i<=int(n/2):
        if n%i == 0:
            return False
        i += 1
    return True
n = int(input('Enter value'))
j=1
m=1
for i in range(1,n+1,1):
    if isprime(i):
        j=n-i
    if isprime(j):
        m=i+j
        print(i,j,m)
        break
    
