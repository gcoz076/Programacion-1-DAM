num = int(input("Dame un número: "))
for i in range(num):
    if i %2 == 0:
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