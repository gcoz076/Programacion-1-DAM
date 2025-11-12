numero = input("Dame un número: ")
lista = list(numero)
num = input("¿Que número quieres añadir? ")
veces = int(input("¿Cuantas veces quieres añadirlo? "))
total = ""
if num == "":
    print ("El número no es valido")
else:
    for i in range(veces):
        lista.append(num)

    for i in lista:
        total = total + i
print ("Este es el numero en total: ", total)
