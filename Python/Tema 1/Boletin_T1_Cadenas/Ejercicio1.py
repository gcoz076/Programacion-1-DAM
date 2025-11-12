numero = input("Dime un numero: ")
lista = []
listareversa = []

for i in range (len(numero)-1,-1,-1):
    lista.insert(0,numero[i])
    listareversa.append(numero[i])
print(listareversa)
print(lista)

if lista == listareversa:
    print("Es capicua")
else:
    print("No lo es")