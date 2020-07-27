p = input('Enter p : ').split(',')
grades = [int(i) for i in p]

a = []
b = []
for i in range(0,len(grades),1):
    next = ((grades[i]+4)//5)*5;
    b.append(next)
    if(grades[i]<38):
        a.append(grades[i])
    else:
        if(abs(grades[i]-b[i])<3):
            grades[i] = b[i]
            a.append(grades[i])
        else:
            a.append(grades[i]) 

print(a)

for i in range(0,len(apples),1):
        if c[i] in l:
            x += 1
    for j in range(0,len(oranges),1):
        if d[j] in l:
            y += 1
