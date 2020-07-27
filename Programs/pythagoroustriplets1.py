n = int(input('Enter the value upto which number you want pythagoral Triplets : '))
for i in range(0,n-3):
    for j in range(i+1,n-2):
        for k in range(j+1,n-1):
            if(i**2 + j**2 == k**2):
                print(i ,j ,k )
