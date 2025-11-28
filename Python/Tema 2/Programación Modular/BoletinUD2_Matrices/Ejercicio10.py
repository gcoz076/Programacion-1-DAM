matriz_no_cuadrada = [
    [1, 2, 3],
    [4, 5, 6]
]

matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
def devuelveDiagonalPrincipal(matriz):
    if len(matriz) == len(matriz[0]):
        diagonal = []
        for i in range(len(matriz)):
            diagonal.append(matriz[i][i])
        return diagonal
    else:
        return []

def devuelveDiagonalSecundaria(matriz):
    if len(matriz) == len(matriz[0]):
        diagonal = []
        n = len(matriz)
        for i in range(n):
            diagonal.append(matriz[i][n - 1 - i])
        return diagonal
    else:
        return []

print(devuelveDiagonalPrincipal(matriz))
print(devuelveDiagonalSecundaria(matriz))
print(devuelveDiagonalPrincipal(matriz_no_cuadrada))
print(devuelveDiagonalSecundaria(matriz_no_cuadrada))
