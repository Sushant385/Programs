def kap(n):
    if n==1:
        return True
    elif n==0 or n==2 or n==3:
        return False
    else:
        ns = n**2
        ns = str(ns)
        left,right = ns[:(len(ns)//2)+1],ns[(len(ns)//2)-1:]
        print('l = ',left,'r = ',right)
        if (int(right)+int(left))==n:
            return True
        else:
            return False
'''
for i in range(1,101):
    if kap(i)==True:
        print(i)
   '''
print(kap(123))

