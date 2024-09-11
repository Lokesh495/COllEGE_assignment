def primeORnot(n):
    for i in range(2,n):
        if n%i==0:
            break
    else:
        return f"{n} is a prime number"
    return f"{n} is not a prime number"

a = int(input("enter a number : "))
print(primeORnot(a))    