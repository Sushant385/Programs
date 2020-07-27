def anagram(a,b):
    if len(a)!=len(b):
        return 'Not Anagram'
    else:
        a1 = (list(a))
        b1 = (list(b))
        a1.sort()
        b1.sort()
        print(a1)
        print(b1)
        i = 0
        while(i<len(a1)+1):
            if a1[i]!=b1[i]:
                return 'Not Anagram'
                break
            else:
                i += 1
                if i==len(a1):
                    return 'Anagram'
a = 'cheater'
b = 'teacher'
print(anagram(a,b))
'''
 l1 = []
    l2 = []
    u1 = list(set(s1))
    u2 = list(set(s2))
    for i in u1:
        if s1.count(i)!=s2.count(i):
            l1.append(i)
    for j in u2:
        if s2.count(j)!=s1.count(j):
            l2.append(j)
    c = len(l1)+len(l2)
    return c

'''
