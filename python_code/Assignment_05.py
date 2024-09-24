def reverse(n):
    temp = 0
    while n>0:
        temp =temp*10+n%10
        n = n//10
    return temp
def palindromeORnot(n):
    if n == reverse(n):
        print(n," is a palindrome number")
    else:
        print(n, "is not a palindrome number")

a = int(input("Enter number : "))
palindromeORnot(a)
