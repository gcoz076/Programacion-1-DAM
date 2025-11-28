matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

def suma_columna(matriz, columna):
    suma = 0
    for fila in matriz:
        if columna >= 0 and columna < len(fila):
            suma += fila[columna]
    return suma

resultado = suma_columna(matriz, 2)
print ("resultado: ", resultado)