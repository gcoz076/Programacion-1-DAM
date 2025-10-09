num = int(input("Dame un número: "))
for i in range(num):
    if i == 0 or i == num -1:
        print("*" + "#" * (num - 2) + "*" )
    else:
        print("*" * num)
print ("Listo")