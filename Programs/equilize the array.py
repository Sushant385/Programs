'''
def find(arr):
    b = list(set(arr))
    max = 0
    for i in range(0,len(b)):
        if max < arr.count(b[i]):
            max = arr.count(b[i])
    #return len(arr)-max
    return b

arr = [6,1,8,8,6,6]
print(find(arr))
'''

def equalizeArray(arr):
    s=list(set(arr))
    l=[]
    for i in range(len(s)):
        c=0
        for j in range(len(arr)):
            if s[i]==arr[j]:
                c+=1
            l.append(c)
    return(len(arr)-max(l))

a = [6,1,8,8,6,6]
print(equalizeArray(a))
