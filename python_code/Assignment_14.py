def find_word(list,n):
    temp = []
    for words in list:
        if len(words)>n:
            temp.append(words)
    return temp
list = ["Lokesh","Kamal","Amit","Ayush","Aniket"]

n = int(input("Enter length of words that accepted : "))

print(find_word(list,n))