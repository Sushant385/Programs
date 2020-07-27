
def countstr(Str):
    s = list(set(Str))
    s.sort()
    count = []
    for i in s:
        c = 0
        for j in Str:
            if i==j:
                c+=1
        count.append(c)
    Str1 = ''
    for i in range(0,len(count)):
        Strcount = str(count[i])
        Str1 += s[i]+Strcount
    return Str1

Str = 'aabbccd'
print(countstr(Str))

'''     
def equalizeArray(arr):
    s=list(set(arr))
    l=[]
    re=''
    for i in range(len(s)):
        c=0
        for j in range(len(arr)):
            if(s[i]==arr[j]):
                c+=1
        l.append(c)
        print(l)
    i=0
    while(i<len(l)):
        st=str(l[i])
        s = sorted(s)
        re=re+s[i]+st
        i+=1
    return(re)

arr='abaabca'
print(equalizeArray(arr))
'''
