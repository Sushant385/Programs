def super_digit(a,k):
    b = []
    n = [int(s) for s in a]
    for i in range(0,k,1):
        b = b+n
    if len(n)==0:
        return 0
        print(0)
    elif len(n)==1:
        return n[0]
        print(n[0])
    else:
        return super_digit(sum(int(s)),k)

a = input('Enter number')

k = int(input('Enter no of times repeat'))
print(super_digit(a,k))
#super_digit(n,k)
