# Input a list of numbers
my_list = input("Enter the list separated by spaces: ").split()

# Convert each element to an integer
my_list = [int(x) for x in my_list]

# Reverse the list
my_list.reverse()

# Print the reversed list
print(my_list)
