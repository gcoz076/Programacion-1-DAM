def generalista():
    lista = []
    for i in range(10):
        num = int(input("Dame un número:"))
        lista.append(num)
    return lista

def devuelvelista(lista):
    nuevalista = []
    for i in lista:
        if i % 10 == 3:
            nuevalista.append(i)
    return nuevalista

generalista1 = generalista()
print (generalista1)
devuelvelista1 = devuelvelista(generalista1)
print (devuelvelista1)
