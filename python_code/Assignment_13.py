def remove_duplicates(list):
    temp = []
    for i in list:
        if i not in temp:
            temp.append(i) # Add items on List using append method
    return temp
        
    
    
    
list = [4,2,6,3,2,6,7,6,8,6]
list = remove_duplicates(list) # Reinitialize whole list
print(list)