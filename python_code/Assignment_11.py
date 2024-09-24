def count_string(list):
    count = 0
    for s in list:
        if len(s)>2 and s[0]==s[-1]:
            count = count+1
    return count
            
    
list = ["abc","xyz","aba","1221","xy","zxyyz"]

print(count_string(list))