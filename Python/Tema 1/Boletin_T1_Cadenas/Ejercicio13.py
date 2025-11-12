numero1 = input("Dame el primer número: ")
numero2 = input("Dame el segundo número: ")

lista = list(numero1)
lista2 = list(numero2)

total = ""
numerototal = lista + lista2

if numero1 == "":
    print ("El número no es valido")
else:
    for i in numerototal:
        total = total + i
print ("Este es el numero en total: ", total)