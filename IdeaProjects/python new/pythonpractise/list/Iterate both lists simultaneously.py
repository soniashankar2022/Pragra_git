list1 = [10, 20, 30, 40]
list2 = [100, 200, 300, 400]

# Using zip to combine elements from list1 and list2
zipped = zip(list1, list2[::-1])


# Printing the reversed list
result=list(zipped)
print(result)