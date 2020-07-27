a = [1,4,5,3,2]
c = []
for i in range(1,len(a),1):
    for j in range(0,len(a),1):
        if a[i]+a[j]==4:
            c.append(i)
            c.append(j)
print(c)
