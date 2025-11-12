numero = input("Dame un número: ")
inicio = int(input("Dime en que número quieres empezar: "))
fin = int(input("Dime en que número quieres finalizar: "))

lista = list(numero)
longitud = len(lista)

if inicio < 0 or fin < 0 or inicio >= longitud or fin >= longitud or inicio > fin:
    print("Rango no válido")
else:
    trozo = ""
    for i in range(inicio, fin + 1):
        trozo = trozo + lista[i]
    print("El trozo es:", trozo)