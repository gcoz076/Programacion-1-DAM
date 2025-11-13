#Apartado 2
import random
print ("===== Menu =====")
print ("T) Pulse T para generar un nuevo tablero")
print ("J) Pulse J para jugar")
print ("E) Pulse E para salir del juego")
print ("================")
opcion = input("Elige una opción: ").lower()
salir = True

while salir:
    if opcion == "t":
        print ("Generando tablero...")
        tablero = []
        minas = 0
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
    
        print ("===== Menu =====")
    print ("T) Pulse T para generar un nuevo tablero")
    print ("J) Pulse J para jugar")
    print ("E) Pulse E para salir del juego")
    print ("================")
    opcion = input("Elige una opción: ").lower()

    if opcion == "e":
        print ("Saliendo...")
        salir = False
