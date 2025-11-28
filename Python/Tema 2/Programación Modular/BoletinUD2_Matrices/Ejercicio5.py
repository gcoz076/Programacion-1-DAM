matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

def suma_filas_pares(matriz):
    suma = 0
    for i in range(0, len(matriz), 2):
        for elemento in matriz[i]:
            suma += elemento
    return suma

resultado = suma_filas_pares(matriz)
print (resultado)