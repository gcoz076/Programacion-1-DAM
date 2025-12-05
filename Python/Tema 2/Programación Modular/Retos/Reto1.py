def calculacadena(posicion1, posicion2, numero):
    salida = numero[posicion1] + numero[posicion2]
    #print(salida)
    return salida, "hola"

numero = input("Introduce una cadena que tenga más de 4 caracteres: ")
numint = int(numero)

while len(numero) <= 4:
    print ("Numero demasiado corto")
    numero = input("Introduce una cadena que tenga más de 4 caracteres: ")

if numint %2 == 0:
    #calculo = numero[2] + numero[4]
    output = calculacadena(2, 4, numero)
    print (output)
elif numint %3 == 0:
    #calculo = numero[1] + numero[3]
    calculacadena(1, 3, numero)
elif numint %7 == 0:
    #calculo = numero[0] + numero[3]
    calculacadena(0, 3, numero)