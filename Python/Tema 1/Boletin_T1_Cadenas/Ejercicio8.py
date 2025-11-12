numero = input("Dame un número: ")
lista = list(numero)
num = input("¿Que número quieres añadir? ")
lista2 = list(num)
total = ""
numerototal = lista + lista2
if num == "":
    print ("El número no es valido")
else:
    for i in numerototal:
        total = total + i
print ("Este es el numero en total: ", total)
