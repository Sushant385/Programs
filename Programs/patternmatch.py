t = 'aababaaaabc'
p = 'aa'
n = len(t)-len(p)
c = 0
s = list(t)
'''
for i in range(0,n+1,1):
    for j in range(0,len(p),1):
        if t[j]==p[j]:
            print(' '.join(map(str,t[j])))
            print(p[j],end=',')
            c += 1
        else:
            i = i-len(p)

print('\n',c)
'''

for i in range(0,len(t),1):
    for j in range(0,len(p),1):
        if t[i]==p[j]:
            c += 1
        else:
            i = i-len(p)
            temp = ' '
print(temp)
print(c)
