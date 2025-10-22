numero1 = int(input("Escribe un número "))
numero2 = int(input("Escribe el siguiente número "))
numero3 = int(input("Escribe el último número "))
mayor = 0
if numero1 >= numero2 and numero1 >= numero3:
    mayor = +1
    print ("El mayor es: ", numero1)
elif numero2 >= numero1 and numero2 >= numero3:
    mayor = +1
    print ("El mayor es: ", numero2)
else:
    mayor = +1
    print ("El mayor es: ", numero3)
