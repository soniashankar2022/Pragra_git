numbers = input("Enter the numbers separated by space: ")
number_list = [int(num) for num in numbers.split()]  # Convert the input string to a list of integers

largest=max(number_list)

largest_number = number_list[0]

for num in number_list:
    if num > largest_number:
        largest_number = num

print("The largest number in the list is:", largest_number)
