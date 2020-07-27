def squareno(n):
    for i in range(1,n,1):
        if(i**2<n):
            for j in range(1,n,1):
                if(j**2<n):
                    if(i**2+j**2==n):
                        print(i,j)
                        return True
    return False
n = int(input('Enter n'))
if squareno(n):
    print('It is Possible')
else:
    print('It is not Possible')
