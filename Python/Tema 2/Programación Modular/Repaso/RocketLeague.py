# MATRIZ UNICA (solo esto fuera de funciones)
puntuaciones = [
    [],  # inicial
    [],  # semifinal
    []   # final
]

# =============================
# Convierte fase → índice
# =============================
def fase_a_indice(fase):
    terminar = False
    indice = -1
    if fase == "inicial":
        indice = 0
        terminar = True
    if fase == "semifinal":
        indice = 1
        terminar = True
    if fase == "final":
        indice = 2
        terminar = True
    return indice

# =============================
# Pedir fase válida
# =============================
def pedir_fase():
    fase = ""
    terminar = False
    while terminar == False:
        fase = input("Introduce fase (inicial / semifinal / final): ").lower()
        if fase == "inicial" or fase == "semifinal" or fase == "final":
            terminar = True
    return fase

# =============================
# Comprobar si es número
# =============================
def es_numero(texto):
    numeros = "0123456789"
    es = True
    i = 0
    while i < len(texto):
        if texto[i] not in numeros:
            es = False
        i = i + 1
    return es

# =============================
# REGISTRAR PUNTUACIONES
# =============================
def registrar_puntuaciones(puntuaciones):
    fase = pedir_fase()
    indice = fase_a_indice(fase)
    if indice == 0:
        total = 8
    elif indice == 1:
        total = 4
    else:
        total = 2
    puntuaciones[indice] = []   # vaciar fase
    i = 0
    while i < total:
        entrada = input("Equipo " + str(i+1) + " (formato nombre:puntos): ")
        if ":" in entrada:
            parte = entrada.split(":")
            nombre = parte[0]
            puntos = parte[1]
            if es_numero(puntos):
                puntos = int(puntos)
                puntuaciones[indice].append([nombre, puntos])
                i = i + 1
            else:
                print("La puntuación debe ser numérica.")
        else:
            print("Formato incorrecto.")
    print("===================================")
    print("Datos registrados correctamente")
    print("===================================")
    return 0

# =============================
# LISTAR PUNTUACIONES
# =============================
def listar_puntuaciones(puntuaciones):
    fase = pedir_fase()
    indice = fase_a_indice(fase)
    terminar = False
    if len(puntuaciones[indice]) == 0:
        print("===================================")
        print("La fase", fase.upper(), "no está registrada")
        print("===================================")
        terminar = True
    if terminar == False:
        print("===================================")
        print("Fase", fase)
        print("===================================")
        i = 0
        while i < len(puntuaciones[indice]):
            equipo = puntuaciones[indice][i][0]
            puntos = puntuaciones[indice][i][1]
            print("El equipo", equipo, "ha obtenido", puntos, "puntos")
            i = i + 1
    return 0

# =============================
# CALCULAR CLASIFICADOS
# =============================
def ver_clasificados(puntuaciones):
    fase = pedir_fase()
    indice = fase_a_indice(fase)
    terminar = False
    if len(puntuaciones[indice]) == 0:
        print("===================================")
        print("La fase", fase.upper(), "no está registrada")
        print("===================================")
        terminar = True
    if terminar == False:
        if indice == 0:
            pasan = 4
        elif indice == 1:
            pasan = 2
        else:
            pasan = len(puntuaciones[indice])
        # Copiar para ordenar
        lista = []
        i = 0
        while i < len(puntuaciones[indice]):
            lista.append([puntuaciones[indice][i][0], puntuaciones[indice][i][1]])
            i = i + 1
        # BURBUJA
        n = len(lista)
        cambiado = True
        while cambiado == True:
            cambiado = False
            i = 0
            while i < n - 1:
                if lista[i][1] < lista[i+1][1]:
                    aux = lista[i]
                    lista[i] = lista[i+1]
                    lista[i+1] = aux
                    cambiado = True
                i = i + 1
        print("===================================")
        print("Clasificados en fase", fase)
        print("===================================")
        i = 0
        while i < pasan:
            print(lista[i][0], "con", lista[i][1], "puntos")
            i = i + 1
    return 0

def ejecutar_programa(puntuaciones):
    salir = False
    opcion = ""
    # primer menú antes del bucle
    print("===== MENU ROCKET LEAGUE =====")
    print("R) Registrar puntuaciones")
    print("L) Listar puntuaciones por fase")
    print("C) Ver clasificados")
    print("S) Salir")
    print("===============================")
    opcion = input("Elige una opción: ").lower()

    while salir == False:
        if opcion == "r":
            registrar_puntuaciones(puntuaciones)
        elif opcion == "l":
            listar_puntuaciones(puntuaciones)
        elif opcion == "c":
            ver_clasificados(puntuaciones)
        elif opcion == "s":
            print("Saliendo del programa…")
            salir = True
        else:
            print("Opción incorrecta")
        if salir == False:
            print("===== MENU ROCKET LEAGUE =====")
            print("R) Registrar puntuaciones")
            print("L) Listar puntuaciones por fase")
            print("C) Ver clasificados")
            print("S) Salir")
            print("===============================")
            opcion = input("Elige una opción: ").lower()
    return 0

Ejecucion = ejecutar_programa(puntuaciones)
print = Ejecucion