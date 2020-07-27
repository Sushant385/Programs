'''
def getTrip(String,n):
    String.sort()
    start = 0
    trip = 0
    for i in range(n-1,-1,-1):
        if String[i]>1.99:
            trip += 1
        elif String[i]<=1.99:
            if String[i]+String[start]<=3.00:
                start += 1
            trip += 1
        if start >= i:
            break
    return trip
'''


def getTrip(String,n):
    String.sort()
    start = 0
    trip = 0
    for i in range(n-1,-1,-1):
        if String[i]<=1.99:
            if String[i]+String[start]<=3.00:
                start += 1
            trip += 1
        else:
            trip += 1
        if start >= i:
            break
    return trip

n = int(input())
String = list(map(float,input().split(',')))
trips = getTrip(String,n)
print(trips)
