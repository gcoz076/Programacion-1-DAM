def Menu():
    print("(A) Registrar puntuaciones del equipo")
    print("(L) Listar equipos y su puntuacion por fase")
    print("(C) Clasificados por fase")
    print("(S) Salir")

    opcion = input("Introduce una opción: ").upper()

    while opcion != "A" and opcion != "L" and opcion != "C" and opcion != "S":
        print("Opción incorrecta")
        print("(A) Registrar puntuaciones del equipo")
        print("(L) Listar equipos y su puntuacion por fase")
        print("(C) Clasificados por fase")
        print("(S) Salir")
        opcion = input("Introduce una opción: ").upper() 
    if opcion == "S":
        print("Saliendo del programa")

    return opcion

def validacionFase(eleccion):
    fase = input("Introduce la fase en la que quieres registrar las puntuaciones(inicial, semifinal, final): ").lower()
    while fase != "final" and fase != "semifinal" and fase != "inicial":
        fase = input("Introduce la fase en la que quieres registrar las puntuaciones (inicial, semifinal, final): ").lower()
    return fase

def registroPuntuaciones(fase):
    equipos = []
    puntuaciones = []

    if fase == "inicial":
        cantidad = 8
    elif fase == "semifinal":
        cantidad = 4
    elif fase == "final":
        cantidad = 2
    
    for i in range(cantidad):
        entrada = input(f"Equipo {i+1} en este formato (nombre:puntuación): ")
        partes = entrada.split(":")
        equipos.append(partes[0])
        puntuaciones.append(int(partes[1]))
    
    print("="*40)
    print("Datos registrados correctamente")
    print("="*40)

    for j in range(len(equipos)):
        print(f"{equipos[j]}:{puntuaciones[j]}")
    return equipos, puntuaciones

def listarPuntuacionesDeEquipo(fase, equipos, puntuaciones, registrado):
    if not registrado:
        print("="*40)
        print(f"La fase {fase} no ha sido registrada en el sistema")
        print("="*40)
    else:
        print("="*40)
        print(f"Fase {fase}")
        print("="*40)
        for i in range(len(equipos)):
            print(f"El equipo {equipos[i]} ha obtenido {puntuaciones[i]} puntos")

def calculaClasificados(fase, equipos, puntuaciones, registrado):
    if not registrado:
        print("="*40)
        print(f"La fase {fase} no ha sido registrada en el sistema")
        print("="*40)
    else:
        if fase == "inicial":
            cantidad_clasificados = 4
        elif fase == "semifinal":
            cantidad_clasificados = 2
        else: 
            cantidad_clasificados = 1

        equipos_temporal = equipos
        puntuaciones_temporal = puntuaciones

        print("="*40)
        print(f"Clasificados en Fase {fase}")
        print("="*40)

        for l in range(cantidad_clasificados):
            max_punt = 0
            indice_max = 0

            for i in puntuaciones_temporal:
                if i > max_punt:
                    max_punt = i
                    indice_max = puntuaciones_temporal.index(max_punt)
            
            equipo = equipos_temporal[indice_max]
            print(f"El equipo {equipo} con {max_punt}")

            equipos_temporal.pop(indice_max)
            puntuaciones_temporal.pop(indice_max)

equipos_inicial = []
puntuaciones_inicial = []
registrado_inicial = False

equipos_semifinal = []
puntuaciones_semifinal = []
registrado_semifinal = False

equipos_final = []
puntuaciones_final = []
registrado_final = False

eleccion = Menu()

while eleccion != "S":
    if eleccion == "A":
        fase = validacionFase(eleccion)
        if fase == "inicial":
            equipos_inicial, puntuaciones_inicial = registroPuntuaciones(fase)
            registrado_inicial = True
        elif fase == "semifinal":
            equipos_semifinal, puntuaciones_semifinal = registroPuntuaciones(fase)
            registrado_semifinal = True
        elif fase == "final":
            equipos_final, puntuaciones_final = registroPuntuaciones(fase)
            registrado_final = True
    if eleccion == "L":
        fase = validacionFase(eleccion)
        if fase == "inicial":
            print(listarPuntuacionesDeEquipo(fase, equipos_inicial, puntuaciones_inicial, registrado_inicial))
        elif fase == "semifinal":
            print(listarPuntuacionesDeEquipo(fase, equipos_semifinal, puntuaciones_semifinal, registrado_semifinal))
        elif fase == "final":
            print(listarPuntuacionesDeEquipo(fase, equipos_final, puntuaciones_final, registrado_final))
    if eleccion == "C":
        fase = validacionFase(eleccion)
        if fase == "inicial":
            print(calculaClasificados(fase, equipos_inicial, puntuaciones_inicial, registrado_inicial))
        elif fase == "semifinal":
            print(calculaClasificados(fase, equipos_semifinal, puntuaciones_semifinal, registrado_semifinal))
        elif fase == "final":
            print(calculaClasificados(fase, equipos_final, puntuaciones_final, registrado_final))

    eleccion = Menu()