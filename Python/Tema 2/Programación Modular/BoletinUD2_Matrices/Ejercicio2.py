matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

def suma_matriz(matriz):
    total = 0
    for fila in matriz:
        for elemento in fila:
            total += elemento
    return total

resultado = suma_matriz(matriz)
print(resultado)