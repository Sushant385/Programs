def twoString(s1,s2):
    l1 = list(set(s1))
    l2 = list(set(s2))
    for i in range(0,len(l1)):
        for j in range(0,len(l2)):
            if l1[i]==l2[j]:
                return 'Yes'
    return 'No'
    
s1 = 'hi'
s2 = 'world'
print(twoString(s1,s2))
