import random
def factorial(n):
    if n==1:
        return 1
    else:
        return n*factorial(n-1)
    
def possible_permutation(list):
    permutation_count = factorial(len(list))
    
    temp = []
    for _ in range(0,permutation_count):
        temp_value=random.choices(list,k=3)
        temp.append(temp_value)
    return temp

list = [1,2,3,4]
permutation = possible_permutation(list)    
print("All possible permutation of given list :")
for i in permutation:
    print(i)