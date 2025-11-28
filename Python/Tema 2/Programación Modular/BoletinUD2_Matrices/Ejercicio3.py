matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

def numeros_pares(matriz):
    pares = []
    for fila in matriz:
        for elemento in fila:
            if elemento % 2 == 0:
                pares.append(elemento)
    return pares

print(numeros_pares(matriz))