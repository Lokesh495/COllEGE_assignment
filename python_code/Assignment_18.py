def create_list(list,a):
    temp= []
    for i in range(1,a+1):
        for j in list:
            temp.append(f"{j}{i}")
    return temp
    
    
list = ["p","q"]
a  =int(input("Enter a range of new list values : "))
print(create_list(list,a))