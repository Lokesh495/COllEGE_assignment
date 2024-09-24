def shiftValues_inEnd(list,val):
    for i in range(0,len(list)):
        if list[i]==val:
            list.remove(val)
            list.append(val)
    
list = [3, 4, 0, 0, 0, 6, 2, 0, 6, 7, 6, 0, 0, 0, 9, 10, 7, 4, 4, 5, 3, 0, 0, 2, 9, 7, 1]
val = int(input("Enter a number you want to shift at end of list : "))
shiftValues_inEnd(list,val)
print(list)