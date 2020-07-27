def rotate(a,k,q):
    for i in range (q):
        i = (m - k) % n
        print(a[i])

n = 3
k = 2
q = 3
a = [1,2,3]
print(rotate(a,k,q))
