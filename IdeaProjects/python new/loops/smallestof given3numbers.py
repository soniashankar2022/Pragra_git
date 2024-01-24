num1 = int(input("enter the first numbers : "))
num2 = int(input("enter the second numbers : "))
num3 = int(input("enter the third numbers : "))
if num1 < num2 and num1 < num3:
    print("num1 is smallest")
elif num2 < num3:
    print("num2 is smallest")
else:
    print("num3 is smallest")
