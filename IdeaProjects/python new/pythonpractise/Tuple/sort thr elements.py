from operator import itemgetter

# Sample list of tuples
list_of_tuples = [(3, 6, 3), (2, 8, 4), (7, 4, 9)]

result = sorted(list_of_tuples, key=itemgetter(-1))
print(result)