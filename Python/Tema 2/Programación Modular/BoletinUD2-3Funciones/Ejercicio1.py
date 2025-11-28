def obtengolista():
    lista = []
    for i in range(6):
        num = str(input("Dame un número:"))
        lista.append(num)
    return lista
def calculalista(lista):
    inversa = []
    for i in range(len(lista)-1, -1, -1):
        inversa.append(lista[i])
    return inversa

listainicial = obtengolista()
print (listainicial)
listinversa = calculalista(listainicial)
print (listinversa)