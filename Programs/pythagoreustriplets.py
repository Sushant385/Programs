a =[2,5,1,3,6,4,7]
for i in range(0,len(a)-2):
    for j in range(i+1,len(a)-1):
        for k in range(j+1,len(a)):
            if(i**2 + j**2 == k**2):
                print(i ,j, k)
