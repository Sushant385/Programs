n = int(input('Enter number'))
if n%2==0:
    if n>0:
        print(n,'is positive even number')
    else:
        print(n,'is negative even number')
else:
    if n<0:
        print(n,'is negative odd number')
    else:
        print(n,'is positive odd number')
