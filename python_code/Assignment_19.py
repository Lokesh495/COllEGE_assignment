def find_common(listA,listB):
    temp = []
    for samp in listA:
        if samp in listB:
            temp.append(samp)
    return temp
    

listA = [1,2,3,4,2,9,6]
listB = [4,5,3,9]

print(find_common(listA,listB))