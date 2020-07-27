l = [4,6,5,3,3,1]
#l = [1,2,2,3,1,2]
n = len(l)
a =[]   
b = []

for i in range(0,n):
    for j in range(0,n):
        if abs(l[i]-l[j])==1 or abs(l[j]-l[i])==0:
            a.append(l[i])
        break

print(a)

'''
for i in range(0,len(l)-1):
    if (abs(l[i]-l[i+1]<=1) or l[i]-l[i+1]<=1):
        a.append(l[i])
print(a)
'''
