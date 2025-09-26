numero1 = int(input("Escribe un número"))
numero2 = int(input("Escribe el siguiente número"))
if numero2 != 0:
    resultado = int(numero1/numero2)
    print ("Este es el resultado: ", resultado)
else:
    print("Error, no se puede dividir entre 0")