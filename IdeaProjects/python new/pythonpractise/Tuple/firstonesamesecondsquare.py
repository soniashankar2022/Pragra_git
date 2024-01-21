num=input("enter the number seperated by space")
#convert the string to int
convertednum = [int(x) for x in num.split()]

#for loop
result=[(i,i**2) for i in convertednum]
#print result
print(result)
