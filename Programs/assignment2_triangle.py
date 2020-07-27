import numpy as np
a = int(input('Enter 1st number'))
b = int(input('Enter 2nd number'))
c = int(input('Enter 3rd number'))
if(a+b<c or b+c<a or c+a<b):
    print("Triangle can not be found")
else:
    print("Triangle can be formed")
    if(a==b and b==c and c==a):
        print("The triangle is equilateral triangle")
    elif(a==b or b==c or c==a):
        print("Isoceles triangle")
    else:
        print("scalene triangle")
    s = (a+b+c)//2;
    area = np.sqrt(s*(s-a)*(s-b)*(s-c))
    print("The area of the triange is : ",area)
    perimeter = 2 * s;
    print("The perimeter of the triangle : ",perimeter)
    
