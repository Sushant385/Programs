def kangaroo(x1,v1,x2,v2):
    if x2>x1 and v2>v1:
        return 'NO'
    if v1+v1==v2+v2:
        return 'YES'
    else:
        return 'YES'
x1 = 0
v1 = 3
x2 = 4
v2 = 2
print(kangaroo(x1,v1,x2,v2))
