#Apartado 1
print ("===== Menu =====")
print ("T) Pulse T para generar un nuevo tablero")
print ("J) Pulse J para jugar")
print ("E) Pulse E para salir del juego")
print ("================")
opcion = input("Elige una opción: ").lower()
salir = False

while salir:
    if opcion == "t":
        print ("Generando tablero...")
    
    elif opcion == "j":
        print ("Jugando...")
    
    elif opcion == "e":
        print ("Saliendo...")
        salir = True
