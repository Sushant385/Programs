
s = 'aaabcdaabcdeaghi'
sub = list(s)
print(sub)
n = len(s)
substring = []
for i in range(0,n,1):
    for j in range(i+1,n,1):
        if sub[i]!=sub[j] and sub[i] not in substring:
            substring.append(sub[i])
        else:
            i = i-len(substring)
print(' '.join(map(str,substring)))


'''
s = 'aaabcdaabcdeaghi'
sub = list(s)
print(sub)
n = len(s)
substring = []
for i in sub:
    if i == i+1:
        i=i-len(substring)
    else:
        substring.append(i)
            
print(' '.join(map(str,substring)))

'''
'''
s = 'aaabcdaabcdeaghi'
sub = list(s)
print(sub)
n = len(s)
substring = []
for i in sub:
    if i!=i+1 and i not in substring:
        substring.append(i)
    else:
        i = i-len(substring)
print(' '.join(map(str,substring)))
'''

