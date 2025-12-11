import random

def generaAleatorio():
    bolas = []
    for i in range(1, 75):
        num_Aleatorio = random.randint(1, 75)
        if num_Aleatorio not in bolas:
            bolas.append(num_Aleatorio)
    return bolas, num_Aleatorio

def buscaNumeroEnLista(fila, numero):
    i = 0
    encontrado = False
    posicion = -1
    while i < len(fila) and not encontrado:
        if fila[i] == numero:
            encontrado = True
            posicion = i
        else:
            i += 1
    return posicion

def compruebaSiHayLineaEnFila(bolas, fila):
    linea = []
    HanSalido = []
    Esta = False
    filaAcertante = None
    numero = buscaNumeroEnLista(fila, 13)
    for i in range(5):
        if numero in bolas:
            HanSalido.append(numero)
            linea.append(numero)
            if len(linea) == 5:
                print("¡¡¡¡ LINEAAA !!!!")
                filaAcertante = fila
                Esta = True
        else:
            print("Ese número no está en la lista")
            Esta = False
    return Esta, filaAcertante, HanSalido

def jugarALaLinea(carton_bingo, bolas):
    comprobacion = []
    for fila in carton_bingo:
        comprobacion = compruebaSiHayLineaEnFila(bolas, fila)
    return comprobacion

def imprimirSalida(filaAcertante, HanSalido):
    print("Numeros que han salido antes de completar la fila: ", len(HanSalido))
    print("Fila acertante: ", filaAcertante)
    print("Lista de numeros que han salido: ", HanSalido)

carton_bingo = [
    [5, 21, 38, 50, 63],
    [12, 17, 44, 47, 74],
    [1, 29, "--", 55, 69],
    [9, 25, 32, 59, 61],
    [14, 19, 41, 52, 66]
]

bolas = [5, 21, 38, 50, 63]

filaConLinea = jugarALaLinea(carton_bingo, bolas)
print(filaConLinea)

imprimirSalida(filaConLinea, bolas)
