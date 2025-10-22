num = int(input("Dame un número: "))
for i in range(num):
    if i == 0 or i == num -1:
        print("*" * num)
    else:
        print("*" + " " * (num - 2) + "*" )
print ("Listo")