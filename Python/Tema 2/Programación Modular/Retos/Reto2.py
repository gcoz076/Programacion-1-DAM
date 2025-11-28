matriz = [
    ['A', 'B', 'C', 'D'],    # Fila 1
    ['E', 'F', 'G', 'H'],    # Fila 2
    ['I', 'J', 'K', 'L'],    # Fila 3
    ['M', 'N', 'Ñ', 'O'],    # Fila 4
    ['P', 'Q', 'R', 'S'],    # Fila 5
    ['T', 'U', 'V', 'W'],    # Fila 6
    ['X', 'Y', 'Z', '_']     # Fila 7  (“_” representa el espacio)
]
cadenaCif = "21,34,74,21,71,31,61,44,74,34,34,21,23,11,74,13,44,42,74,61,53,11,12,11,32,44,74,72,74,51,21,53,54,31,54,61,21,42,13,31,11"
ListaSeparada = cadenaCif.split(",")
cadena = ""
cadenacifrar = "NO SOLO HAY QUE CONFIAR EN EL PROCESO, HAY QUE SEGUIRLO"
ListaSeparadacif =cadenacifrar.split(" ")
def descifrar(matriz, ListaSeparada):
    ListaDescifrada = []
    for par in ListaSeparada:
        fila = int(par[0]) -1
        columna = int(par[1]) -1
        letra = matriz[fila][columna]
        ListaDescifrada.append(letra)
    return ListaDescifrada

def cifrar(matriz, ListaSeparadacif):
    ListaYaCifrada = []
    for palabra in ListaSeparadacif:
        for letra in palabra:
            fila = 0
            columna = 0
            for i in range(len(matriz)):
                for j in range(len(matriz[i])):
                    if matriz[i][j] == letra:
                        fila = i + 1
                        columna = j + 1
            numero = str(fila) + str(columna)
            ListaYaCifrada.append(numero)
        ListaYaCifrada.append("74")
    return ListaYaCifrada


descifrado = descifrar(matriz, ListaSeparada)
for letra in descifrado:
    cadena = cadena + letra
print (cadena)
cifrado = cifrar(matriz, ListaSeparadacif)
print (cifrado)