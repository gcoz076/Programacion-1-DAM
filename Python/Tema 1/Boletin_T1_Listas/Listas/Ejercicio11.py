import random

numeros = []
for i in range(20):
    numeros.append(random.randint(0, 100))

print("Lista original: ", numeros)

pares = []
impares = []

for numero in numeros:
    if numero % 2 == 0:
        pares.append(numero)
    else:
        impares.append(numero)
print("Estos son los números pares: ", pares)
print("Estos son los impares: ", impares)
resultado = pares + impares
print("Lista reorganizada (pares primero, luego impares): ", resultado)