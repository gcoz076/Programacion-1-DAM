nombres = ["gow", "mh", "fifa"]
puntuaciones = [9, 6, 4]
generos = ["RPG", "RPG", "deporte"]
salir = False

while salir == False:
    print("")
    print("--- Menú ---")
    print("R. Registrar juegos")
    print("E. Mostrar todos los juegos")
    print("P. Mejor Puntuación")
    print("D. Detalle juegos")
    print("G. lista por Genero")
    print("S. Salir")
    opcion = input("Elige una opción: ")
    opcion = opcion.upper()
    if opcion == "R":
        num_juegos = int(input("¿Cuántos juegos quieres registrar? "))
        i = 0
        while i < num_juegos:
            print("")
            print("--- Juego " + str(i + 1) + " ---")
            nombre = input("Nombre del juego: ")
            puntuacion = int(input("Puntuación (1-10): "))
            genero = input("Género: ")
            
            nombres.append(nombre)
            puntuaciones.append(puntuacion)
            generos.append(genero)
            
            i = i + 1
        print("Juegos registrados correctamente")
    elif opcion == "E":
        if len(nombres) == 0:
            print("No hay juegos registrados.")
        else:
            print("")
            print("Tu lista de juegos PSP:")
            i = 0
            while i < len(nombres):
                print(str(i + 1) + ". " + nombres[i] + " | Puntuación: " + str(puntuaciones[i]) + " | Género: " + generos[i])
                i = i + 1
    elif opcion == "P":
        maximo = 0
        for puntuacion in puntuaciones:
            if puntuacion > maximo:
                maximo = puntuacion
        psmax = puntuaciones.index(maximo)
        print("Este es tu juego mejor puntuado:")
        print(nombres[psmax] + " | Puntuación: " + str(puntuaciones[psmax]) + " | Género: " + generos[psmax])
    elif opcion == "D":
        nombre = input("Dime el nombre de un juego: ")
        if nombre in nombres:
            posicion = nombres.index(nombre)
            print((nombres[posicion]) + " | Puntuación: " + str(puntuaciones[posicion]) + " | Género: " + generos[posicion])
        else:
            print ("El juego no está en la lista")
    elif opcion == "G":
        genero = input("Dime un genero: ")
        if genero in generos:
            posicion = generos.index(genero)
            print((nombres[posicion]) + " | Puntuación: " + str(puntuaciones[posicion]) + " | Género: " + generos[posicion])
        else:
            print ("El juego no está en la lista")
    elif opcion == "S":
        print("Hasta la próxima")
        salir = True
    else:
        print("Opción no válida. Intenta de nuevo.")