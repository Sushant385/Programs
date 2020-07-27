
def powerSum(x,n):
    #uni = []
    for i in range(1,x//2):
        if i**n == x:
            print(i)
        for j in range(i+1,x//2):
            if(i**n+j**n)==x:
                return i,j
            
    #return uni

'''
def powerSum(x,n):
    for i in range(1,x//2-1):
        if ((i)**n+(i+1)**n)==x:
            return i,i+1

'''        
x = 100
n = 2
print(powerSum(x,n))



