#Apartado 4
import random
print ("===== Menu =====")
print ("T) Pulse T para generar un nuevo tablero")
print ("J) Pulse J para jugar")
print ("E) Pulse E para salir del juego")
print ("================")
opcion = input("Elige una opción: ").lower()
tablero = []
minas = 0
posicion = ""
posjugador = ""
puntuacion = 0
numintentos = 0
salir = True

while salir:
    if opcion == "t":
        print ("Generando tablero...")
        for i in range(8):
            posicion = random.randint(0,1)
            if posicion == 0:
                posicion = ""
                tablero.append(posicion)
            elif posicion == 1:
                posicion = "X"
                tablero.append(posicion)
        for posicion in tablero:
            if posicion == "X":
                minas = minas +1
        print ("¡¡Tablero generado!!")
        print ("El numero de minas es", minas )
        print (tablero)

    elif opcion == "j":
        print ("Jugando...")
        if len(tablero) < 8:
            print ("Debes generar antes un tablero")
        else:
            numintentos = int(input("Introduce el número de intentos que quieres tener: "))
            posjugador = int(input("Introduce una posición (0-7): "))
            while posjugador >= 8:
                posjugador = int(input("Introduce una posición correcta entre los valores 0 y 7: "))
            while minas != 0 and numintentos != 0:
                posjugador = (tablero[posjugador])
                if posjugador == "X":
                    puntuacion = puntuacion + 1
                    minas = minas - 1
                    numintentos = numintentos - 1
                    print("¡¡Mina!! +1 punto. [Puntuacion:", puntuacion, "| Minas restantes", minas)
                elif posjugador == "":
                    puntuacion = puntuacion - 1
                    numintentos = numintentos -1
                    print("Agua... -1 punto.[Puntuacion:", puntuacion, "| Minas restantes", minas)
                posjugador = int(input("Introduce una posición (0-7): "))
            if minas == 0:
                print ("¡¡Has encontrado todas las minas!! Tu puntuación final es:", puntuacion)
            elif numintentos == 0:
                print ("No te quedan mas intentos...")

    print ("===== Menu =====")
    print ("T) Pulse T para generar un nuevo tablero")
    print ("J) Pulse J para jugar")
    print ("E) Pulse E para salir del juego")
    print ("================")
    opcion = input("Elige una opción: ").lower()

    if opcion == "e":
        print ("Saliendo...")
        salir = False