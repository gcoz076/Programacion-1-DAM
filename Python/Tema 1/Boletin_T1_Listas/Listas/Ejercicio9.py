numeros = []
for i in range(15):
    numero = int(input("Dime el numero: "))
    numeros.append(numero)
rotacion = [numeros[-1]] + numeros [:-1]

print ("Lista: ", numeros)
print ("Lista inversa: ", rotacion)