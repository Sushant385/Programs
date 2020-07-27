string = input('Enter words')
length = 0
for i in string.split(): 
    if(len(i) > length):
        length = len(i)  
print(i) 
 
