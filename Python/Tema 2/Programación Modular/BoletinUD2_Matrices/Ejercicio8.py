matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

def maximo_fila(matriz, fila):
    maximo = matriz[fila][0]
    for elemento in matriz[fila]:
        if elemento > maximo:
            maximo = elemento
    return maximo

def maximo_columna(matriz, columna):
    maximo = matriz[0][columna]
    for fila in matriz:
        if fila[columna] > maximo:
            maximo = fila[columna]
    return maximo

def maximo_total(matriz):
    maximo = maximo_fila(matriz, 0)
    for i in range(1, len(matriz)):
        max_fila = maximo_fila(matriz, i)
        if max_fila > maximo:
            maximo = max_fila
    return maximo


print("Máximo de la fila 1:", maximo_fila(matriz, 1))      
print("Máximo de la columna 2:", maximo_columna(matriz, 2))
print("Máximo total de la matriz:", maximo_total(matriz))
