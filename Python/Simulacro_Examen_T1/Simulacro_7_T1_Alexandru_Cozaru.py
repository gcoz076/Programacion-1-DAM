contador = 0
suma = 0
num = int(input("Dame un número: "))
contador = contador +1
suma = suma + num
if num == 0:
    print("desordenado")
else:
    anterior = num
    creciente = True
    decreciente = True
    hay_al_menos_dos = False

    num = int(input("Dame un número: "))
    contador = contador +1
    suma = suma + num
    while num != 0:
        hay_al_menos_dos = True
        if num > anterior:
            decreciente = False
        elif num < anterior:
            creciente = False
        else:
            creciente = False
            decreciente = False
        anterior = num
        num = int(input("Dame un número: "))
        contador = contador +1
        suma = suma + num
    if not hay_al_menos_dos:
        print("desordenado")
    elif creciente:
        print("creciente")
    elif decreciente:
        print("decreciente")
    else:
        print("desordenado")
print ("Has puesto", contador, "numeros")
suma = suma / contador
print ("Esta es la media de los números: ", suma)