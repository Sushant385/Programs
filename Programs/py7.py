import numpy as np
a = np.array([[1,2,3,4],[5,6,7,8],[2,3,5,6],[6,7,3,4]])
rs = cs = 0
re = ce = 3
m=1
while rs<3 or cs<3:
    for col in range(cs,ce+1,1):
        a[rs][col] = m
        m +=1
    rs += 1
    for row in range(rs,re+1,1):
        a[row][ce] = m
        m +=1
    ce = ce-1
    for col in range(ce,cs-1,-1):
        a[re][col] = m
        m +=1
    re = re-1
    for row in range(re,rs-1,-1):
        a[row][cs] = m
        m +=1
    cs += 1
for i in range(0,len(a)):
    for j in range(0,len(a[0])):
        print(a[i][j],end='  ')
    print('\n')
