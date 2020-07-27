def findDigit(n):
    l = list(str(n))
    l = [int(i) for i in l]
    i,c = 0,0
    while i<len(l):
        if l[i] == 0:
            l[i] = -1
        else:
            if n%l[i]!=0:
                i += 1
            else:
                c += 1
        i += 1
    return c

n = 1012
print(findDigit(n))


