def sort_list(lst):
    return sorted(set(lst), key=lambda x: x[-1])

# Sample list
lst = [(3, 4), (4, 7), (2, 1), (9, 3)]

# Print the sorted list
print(sort_list(lst))