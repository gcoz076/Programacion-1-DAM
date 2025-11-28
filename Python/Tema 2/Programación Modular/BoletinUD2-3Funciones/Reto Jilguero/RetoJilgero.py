def generalista():
    listanotas = []
    notas = int(input("Dame un número del 1 al 5: "))
    listanotas.append(notas)
    while notas <= 0:
        notas = int(input("Dame un número del 1 al 5, pero esta vez correcto: "))
        listanotas.append(notas)
    return listanotas

def valida(listanotas):
    estabien = True
    if min(listanotas) < 0 or max(listanotas) > 5:
        estabien = True
    else:
        estabien = False
    return estabien

def listasinduplicados(listanotas):
    listasindupla = []
    for elemento in listanotas:
        if elemento not in listasindupla:
            listasindupla.append(elemento) 
    return listasindupla

def contienenotas(listasindupla):
    minimos = min(listasindupla)
    maximos = max(listasindupla)
    print ("Mínimo", minimos, "Máximos", maximos)
    i = 0 
    while i > minimos and i < maximos:
        if listasindupla[i] > listasindupla[i + 1]:
            i = i + 1
    return minimos, maximos

def puntuacionjilgeros(listasindupla):
    print ("Esta es la lista de notas", listasindupla)
    puntuacion = len(listasindupla)
    return puntuacion

Generado = generalista
print (generalista)
validación = valida
print (validación)
listasindup = listasinduplicados
print (listasindup)
tienenotas = contienenotas
print (tienenotas)
puntuacion = puntuacionjilgeros
print (puntuacion)