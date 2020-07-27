def triplet(arr,r):
    n = len(arr)
    c = 0
    for i in range(0,n-2):
        for j in range(i+1,n-1):
            for k in range(j+1,n):
                if arr[i]<arr[j]<arr[k]:
                    print(i,' ',j,' ',k)
                    c += 1
                    break
                break
    print(c)

arr = [1,2,2,4]
#arr = [1,5,5,25,125]
r = 2
triplet(arr,r)
