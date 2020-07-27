n = int(input('Enter size of list'))
l1 = []
for i in range(0,n):
    l1.append(int(input()))
for i in range(0,len(l1)):
    if(l1[i]<0):
        l1[i] = 0
    for j in range(i+1,len(l1)):
        if(l1[i]<l1[j]):
            temp = l1[i]
            l1[i] = l1[j]
            l1[j] = temp
    print(l1[i],end=' ')

