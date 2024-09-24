def factorial(n):
    if n==1:
        return 1
    else:
        return n*factorial(n-1)
    
def strongORnot(n):
    temp = 0
    n1 = n 
    while n1>0:
        temp = temp + factorial(n1%10)
        n1 = n1//10
    if temp == n:
        print(n," is a strong number")
    else:
        print(n," is not  a strong number")

a = int(input("Enter a number : "))
strongORnot(a)
