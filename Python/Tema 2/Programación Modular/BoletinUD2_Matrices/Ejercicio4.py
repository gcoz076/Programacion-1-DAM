matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

def sumafila(matriz,fila):
    total = 0
    fila = matriz[fila]
    for elemento in fila:
        total = total + elemento
    return total

solucion = sumafila(matriz, 2)
print (solucion)