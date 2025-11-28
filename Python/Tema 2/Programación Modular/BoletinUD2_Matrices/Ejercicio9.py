matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

def devuelveDiagonalPrincipal(matriz):
    diagonal = []
    for i in range(len(matriz)):
        diagonal.append(matriz[i][i])
    return diagonal

def devuelveDiagonalSecundaria(matriz):
    diagonal = []
    n = len(matriz)
    for i in range(n):
        diagonal.append(matriz[i][n - 1 - i])
    return diagonal

print(devuelveDiagonalPrincipal(matriz))
print(devuelveDiagonalSecundaria(matriz))

