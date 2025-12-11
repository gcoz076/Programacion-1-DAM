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

def dameFase():
    fase = input("Que fase quieres registrar(inicial, semifinal o final): ")
    while fase not in ("inicial", "semifinal", "final"):
        fase = input("Incorrecto, di de nuevo la fase que quieres registrar(inicial, semifinal o final): ")
    return fase

def registroPuntuaciones():
    listaequipos = []
    listapuntos = []
    fase = dameFase()
    if fase == "inicial":
        for i in range(8):
            equipos = input("Dime el nombre del equipo: ")
            listaequipos.append(equipos)
            puntos = int(input("Y su puntuación: "))
            listapuntos.append(puntos)

    elif fase == "semifinal":
        for i in range(4):
            equipos = input("Dime el nombre del equipo: ")
            listaequipos.append(equipos)
            puntos = int(input("Y su puntuación: "))
            listapuntos.append(puntos)
    else:
        for i in range(2):
            equipos = input("Dime el nombre del equipo: ")
            listaequipos.append(equipos)
            puntos = int(input("Y su puntuación: "))
            listapuntos.append(puntos)
        print("===========================================")
        print("Datos registrados correctamente")
        print("===========================================")
    return fase, listaequipos, listapuntos

puntuacionesfinal = []
def listarEquipos(puntuacioninicio, puntuacionsemifinal, puntuacionesfinal, nombresinicio, nombressemifinal, nombresfinal ):
        fase = dameFase()
        if fase == "inicial":
            nombresdeequipos = nombresinicio
            puntuacionesequipos = puntuacioninicio
        elif fase == "semifinal":
            nombresdeequipos = nombressemifinal
            puntuacionesequipos = puntuacionsemifinal
        else: 
            nombresdeequipos = nombresfinal
            puntuacionesequipos = puntuacionesfinal

        for i in range(0, len(nombresdeequipos)):
            print ("El equipo ", nombresdeequipos[i]," ha obtenido ", puntuacionesequipos[i]," puntos")

puntuacioninicio = []
puntuacionsemifinal = []
puntuacionesfinal = []
nombresinicio = []
nombressemifinal = []
nombresfinal = []

opcion = pintaMenu()
print(opcion)

registro = registroPuntuaciones()
print(registro)

fase = registro[0]
if fase == "inicial":
    nombresinicio = registro[1]
    puntuacioninicio = registro[2]
elif fase == "semifinal":
    nombressemifinal = registro[1]
    puntuacionsemifinal = registro[2]
else:
    nombresfinal = registro[1]
    puntuacionesfinal = registro[2]

listar = listarEquipos(puntuacioninicio, puntuacionsemifinal, puntuacionesfinal, nombresinicio, nombressemifinal, nombresfinal )
print(listar)
