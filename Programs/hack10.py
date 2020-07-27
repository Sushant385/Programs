def find(arr):
    b = list(set(arr))
    max = 0
    for i in range(0,len(b)):
        if max < arr.count(b[i]):
            max = arr.count(b[i])
    return len(arr)-max


arr = [6,1,8,8,6,6]
print(find(arr))
