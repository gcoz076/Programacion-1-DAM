matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

def suma_columnas_pares(matriz):
    suma = 0
    for fila in matriz:
        for i in range(len(fila)):
            if i % 2 == 0:
                suma = suma + fila[i]
    return suma

resultado = suma_columnas_pares(matriz)
print("Suma:", resultado)