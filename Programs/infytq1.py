n=7
l1=[1,1,2,3,5,8,13]
l2=[2,3,5,7,11,13,17]
l3=[]
a=1
while(a<=n):
    for i in range(0,n,1):
        for j in range(0,n,1):
            if i%2==0:
                l3.append(i)
            else:
                l3.append(j)
print(l3)
        
