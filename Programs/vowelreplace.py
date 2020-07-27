'''
def isvowel(Str):
        for i in Str:
            if(i=='a' or i=='e' or i=='i' or i=='o' or i=='u'):
                return True
            else:
                return False
'''
str1 = input('Enter String1  :  ')
str2 = input('Enter String2  :  ')
str3 = input('Enter String3  :  ')

l = ['a','e','i','o','u','A','E','I','O','U']
for i in str1:
    if i in l:
    #if isvowel(i):
        str1 = str1.replace(i,'%')
        
for j in str2:
    if j not in l:
    #if not isvowel(j):
        str2 = str2.replace(j,'#')
s3=str3.upper()
print(str1,end='')
print(str2,end='')
print(s3,end='')

