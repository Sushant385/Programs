s = "[()]{{))}}}]]()]]}("
p = 0
sq = 0
c = 0
for i in s:
    if(i=='[' or i==']'):
        sq += 1
    elif(i=='{' or i=='}'):
        c += 1
    elif(i=='(' or ')'):
        p += 1
    else:
        print('No parensis found')
print('The number of Square brackets is : ',sq)
print('The number of Curly brackets is : ',c)
print('The number of parenthesis is : ',p)
    
