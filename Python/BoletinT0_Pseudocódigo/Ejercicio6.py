print ("Escribe un número")
numero1 = int(input())
print ("Escribe el siguiente número")
numero2 = int(input())
if numero2 != 0:
    resultado = int(numero1/numero2)
    print ("Este es el resultado: ", resultado)
else:
    print("Error, no se puede dividir entre 0")