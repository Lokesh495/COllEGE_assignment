def sort_list(list):
    temp = []
    for tup in list:
        if tup not in temp :
            if len(temp)==0:
                temp.append(tup)
            else:
                for temp_value in temp:
                    if temp_value[-1]>=tup[-1] and tup not in temp:
                        temp.insert(temp.index(temp_value),tup)
                        break
                else:
                    temp.append(tup)
                    
    return temp
list = [(3,4),(4,7),(2,1),(9,3)]
 
print(sort_list(list))