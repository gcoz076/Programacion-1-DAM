matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
def obtener_elemento(matriz, fila, columna):
    return matriz[fila][columna]

def obtener_fila(matriz, fila):
    return matriz[fila]

def obtener_columna(matriz, columna):
    return [fila[columna] for fila in matriz]

print(obtener_elemento(matriz, 1, 2))
print(obtener_fila(matriz, 0))
print(obtener_columna(matriz, 1))