num1 = int(input("Dame un número: "))
num2 = int(input("Dame un número: "))

while num1 < 11 or num2 <11:
    print ("Error")
    num1 = int(input("Dame un número: "))
    num2 = int(input("Dame un número; "))

if num1 < num2:
    for i in range(0, num2 +1, 11):
        if i>num1:
            print (i)
else:
    for i in range (0, num1 +1, 11):
        if 1>num2:
            print(i)