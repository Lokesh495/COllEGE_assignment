def ArmstrongORnot(n,l):
    n1 = n
    temp = 0
    while n1>0:
        mod = 1
        for i in range(1,l+1):
            mod = mod*(n1%10)
        temp =temp + mod
        n1 =n1//10
    if temp == n:
        print(n ,"is a armstrong number")
    else:
        print(n, "is not a armstrong number")
a = input("Enter a number : ")
ArmstrongORnot(int(a),len(a))