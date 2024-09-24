def check_circularIdentical(listA,listB):
    temp = []
    temp = listA+listA
    if listB in (listA + listA):
        print("list2 is a sublist of the concatenated list1.")
    
    
listA = [1,2,3]
listB = [2,3,1]
listC = [2,1,3]
check_circularIdentical(listA,listB)