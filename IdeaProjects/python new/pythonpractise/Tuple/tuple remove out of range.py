# Sample list of tuples
list_of_tuples = [(1, 2), (3, 4), (5, 6), (7, 8)]

# Define the range you want to keep
lower_limit = 3
upper_limit = 6

# Initialize an empty list to store filtered tuples
filtered_list = []

# Iterate through each tuple in the original list
for tup in list_of_tuples:
    # Check if the first element of the tuple is within the specified range
    if lower_limit <= tup[0] <= upper_limit:
        # If it is, add the tuple to the filtered list
        filtered_list.append(tup)

# Print the original list and the filtered list
print("Original List:", list_of_tuples)
print("Filtered List:", filtered_list)
