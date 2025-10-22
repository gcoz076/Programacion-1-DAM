num = int(input("Dame un número: "))
for i in range(1, num+1):
    if i == 1 or i == num:
        print("*" + "#" * (num - 2) + "*" )
    else:
        cadena = ""
        for j in range(num):
            if j %2 == 0:
                cadena = cadena + "*"
            else:
                cadena = cadena + "@"
        print (cadena)
print ("Listo")