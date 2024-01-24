# Create a list with numbers
my_list = [2, 20, 10, 50, 90]

# Add a specific number
number_to_add = 12
# Find the indices of two numbers
indices_of_numbers = []
for i in range(len(my_list)): #0 to -1
    for j in range(i+1, len(my_list)):
        if my_list[i] + my_list[j] == number_to_add:
            indices_of_numbers.append((i, j))
            break

# Print the list and the indices of the two numbers
print("List:", my_list)
print(f"The indices of two numbers whose sum is {number_to_add}: {indices_of_numbers}")

#how it works
# i=0 -->2 , j=1 -->20 ..so 2+20-->not 12
# i=0-->2 ,j-2 -->10    ..so 2+10 -->12