def string_palidromeCheck(str):
    
    if str == str[::-1]:
        print(str," is a palindrome number")
    else:
        print(str," is not a palindrome number")
        
    
str = input("Enter String : ")
string_palidromeCheck(str)