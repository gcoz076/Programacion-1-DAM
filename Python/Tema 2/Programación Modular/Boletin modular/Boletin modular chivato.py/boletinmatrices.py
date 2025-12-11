matriz = [
    [8, 1, 6],
    [3, 5, 7],
    [4, 9, 2]
]

# ------------------------------------------------------
# 1a. Devuelve el elemento dada la fila y columna
# ------------------------------------------------------
def elemento(m, f, c):
    valor = m[f][c]
    return valor

# ------------------------------------------------------
# 1b. Devuelve una fila completa
# ------------------------------------------------------
def fila(m, f):
    resultado = m[f]
    return resultado

# ------------------------------------------------------
# 1c. Devuelve una columna completa
# ------------------------------------------------------
def columna(m, c):
    col = []
    for i in range(len(m)):
        col.append(m[i][c])
    return col

# ------------------------------------------------------
# 2. Suma de todos los elementos de una matriz
# ------------------------------------------------------
def suma_matriz(m):
    total = 0
    for fila in m:
        for elemento in fila:
            total += elemento
    return total

# ------------------------------------------------------
# 3. Lista con los números pares de la matriz
# ------------------------------------------------------
def pares(m):
    lista = []
    for i in range(len(m)):
        for j in range(len(m[i])):
            if m[i][j] % 2 == 0:
                lista.append(m[i][j])
    return lista

# ------------------------------------------------------
# 4. Suma de los elementos de una fila
# ------------------------------------------------------
def suma_fila(m, f):
    total = 0
    for elem in m[f]:
        total += elem
    return total

# ------------------------------------------------------
# 5. Suma de los elementos de filas pares
# ------------------------------------------------------
def suma_filas_pares(m):
    total = 0
    for f in range(len(m)):
        if f % 2 == 0:
            for elem in m[f]:
                total += elem
    return total

# ------------------------------------------------------
# 6. Suma de una columna
# ------------------------------------------------------
def suma_columna(m, c):
    total = 0
    for i in range(len(m)):
        total += m[i][c]
    return total

# ------------------------------------------------------
# 7. Suma de las columnas pares
# ------------------------------------------------------
def suma_columnas_pares(m):
    total = 0
    for f in range(len(m)):
        for c in range(len(m[f])):
            if c % 2 == 0:
                total += m[f][c]
    return total

# ------------------------------------------------------
# 8a. Máximo de una fila
# ------------------------------------------------------
def max_fila(m, f):
    mayor = m[f][0]
    for elem in m[f]:
        if elem > mayor:
            mayor = elem
    return mayor

# ------------------------------------------------------
# 8b. Máximo de una columna
# ------------------------------------------------------
def max_columna(m, c):
    mayor = m[0][c]
    for i in range(len(m)):
        if m[i][c] > mayor:
            mayor = m[i][c]
    return mayor

# ------------------------------------------------------
# 8c. Máximo total de la matriz
# ------------------------------------------------------
def max_total(m):
    mayor = m[0][0]
    for fila in m:
        for elem in fila:
            if elem > mayor:
                mayor = elem
    return mayor

# ------------------------------------------------------
# 9a. Diagonal principal
# ------------------------------------------------------
def diagonal_principal(m):
    diag = []
    for i in range(len(m)):
        diag.append(m[i][i])
    return diag

# ------------------------------------------------------
# 9b. Diagonal secundaria
# ------------------------------------------------------
def diagonal_secundaria(m):
    diag = []
    n = len(m)
    for i in range(n):
        diag.append(m[i][n - 1 - i])
    return diag

# ------------------------------------------------------
# 10. Diagonales solo si matriz es cuadrada
# ------------------------------------------------------
def diagonal_principal_cuadrada(m):
    if len(m) != len(m[0]):
        return []
    return diagonal_principal(m)

def diagonal_secundaria_cuadrada(m):
    if len(m) != len(m[0]):
        return []
    return diagonal_secundaria(m)

# ------------------------------------------------------
# 11. Suma diagonal principal o secundaria
# ------------------------------------------------------
def suma_diagonal(m, esPrincipal=True):
    total = 0
    if esPrincipal:
        diag = diagonal_principal(m)
    else:
        diag = diagonal_secundaria(m)

    for elem in diag:
        total += elem

    return total

# ------------------------------------------------------
# 12. Matriz posición (4 filas, 5 columnas)
# ------------------------------------------------------
def matriz_posicion():
    m = []
    for f in range(4):
        fila = []
        for c in range(5):
            fila.append(f + c)
        m.append(fila)
    return m

# ------------------------------------------------------
# 13a. ¿Todas las filas suman lo mismo?
# ------------------------------------------------------
def suma_filas_igual(m):
    suma_ref = suma_fila(m, 0)
    for f in range(1, len(m)):
        if suma_fila(m, f) != suma_ref:
            return False
    return True

# ------------------------------------------------------
# 13b. ¿Todas las columnas suman lo mismo?
# ------------------------------------------------------
def suma_columnas_igual(m):
    suma_ref = suma_columna(m, 0)
    for c in range(1, len(m[0])):
        if suma_columna(m, c) != suma_ref:
            return False
    return True

# ------------------------------------------------------
# 13c. ¿Suma por filas y columnas es igual?
# ------------------------------------------------------
def suma_total_igual(m):
    if not suma_filas_igual(m):
        return False
    if not suma_columnas_igual(m):
        return False
    return True

# ------------------------------------------------------
# 14a. Matriz lluvias 20x7 (0 a 100)
# ------------------------------------------------------
import random
def generar_lluvias():
    matriz = []
    for semana in range(20):
        fila = []
        for dia in range(7):
            fila.append(random.randint(0, 100))
        matriz.append(fila)
    return matriz

# ------------------------------------------------------
# 14b. Mayor cantidad y posición
# ------------------------------------------------------
def mayor_lluvia(m):
    mayor = -1
    semana = 0
    dia = 0
    for i in range(len(m)):
        for j in range(len(m[i])):
            if m[i][j] > mayor:
                mayor = m[i][j]
                semana = i
                dia = j
    return mayor, semana, dia

# ------------------------------------------------------
# 14c. Agua por semanas
# ------------------------------------------------------
def agua_por_semanas(m):
    lista = []
    for i in range(len(m)):
        total = 0
        for elem in m[i]:
            total += elem
        lista.append(total)
    return lista



# menu

def pintaMenu():
    print ("R) Registrar puntuaciones de equipo")
    print ("L) Listar equipos y su puntuación por fase")
    print ("C) Clasificados por fase")
    print ("S) Salir")
    opcion = input("Selecciona una opción del menú: ").lower()
    while opcion not in ("r", "l", "c"):
        print("Opcion incorrecta")
        opcion = input("Selecciona otra opción del menú: ").lower()
    return opcion
