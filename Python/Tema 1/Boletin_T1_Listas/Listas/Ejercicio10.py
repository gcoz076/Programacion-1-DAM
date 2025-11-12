numeros = []
for i in range(15):
    numero = int(input("Dime el numero: "))
    numeros.append(numero)
rotacion = [numeros[-1]] + numeros [:-1]

print ("Lista: ", numeros)
print ("Lista inversa: ", rotacion)

cantidad = int(input("Dime el número de elementos: "))
elementos = len(numeros)
if elementos > cantidad:
    for o in range(cantidad):
        numeros = [numeros[-1]] + numeros[:-1]
    print("Lista: ", numeros)
else:
    print("El número introducido no es válido.")