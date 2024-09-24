a = int(input("Enter first number : "))
b = int(input("Enter second number : "))

for i in range(a,b+1):
    for j in range(1,11):
        print(i*j," ",end="")
        
    print()
