def primeORnot(n):
    for i in range(2,n):
        if n%i==0:
            break
    else:
        return True
    return False

def check_list(list):
    for i in list:
        if primeORnot(i):
            continue
        else:
            return False
    return True

list = [2,3,5,7,11]
print(check_list(list))
