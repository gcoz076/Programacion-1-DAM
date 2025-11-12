opcion = ""
tipos = []
diametros = []
alturas = []
edades = []

print("=== REGISTRO DE ÁRBOLES DEL BOSQUE ===")

while opcion != "e":
    print("MENÚ PRINCIPAL:")
    print("a) Introducir número de árboles y sus datos")
    print("b) Mostrar resumen de los datos guardados")
    print("c) Mostrar el árbol con mayor altura")
    print("e) Salir del programa")

    opcion = input("Elija una opción: ")

    if opcion == "a":
        cantidad = int(input("¿Cuántos árboles va a introducir?: "))
        i = 0
        while i < cantidad:
            print("Árbol número", i + 1)
            tipo = input("Tipo del árbol (A o B): ")
            diametro = float(input("Diámetro del tronco (cm): "))
            altura = float(input("Altura (m): "))

            tipos.append(tipo)
            diametros.append(diametro)
            alturas.append(altura)

            if tipo == "B":
                edad = int(input("Edad del árbol (años): "))
                edades.append(edad)
            else:
                edades.append(0)

            i = i + 1

    if opcion == "b":
        if len(tipos) == 0:
            print("No hay datos guardados.")
        else:
            print("=== RESUMEN DE DATOS INTRODUCIDOS ===")
            i = 0
            while i < len(tipos):
                if tipos[i] == "A":
                    print("Tipo:", tipos[i], "Diámetro:", diametros[i], "Altura:", alturas[i])
                else:
                    print("Tipo:", tipos[i], "Diámetro:", diametros[i], "Altura:", alturas[i], "Edad:", edades[i])
                i = i + 1

    if opcion == "c":
        if len(alturas) == 0:
            print("No hay árboles registrados.")
        else:
            i = 1
            pos_max = 0
            max_altura = alturas[0]
            while i < len(alturas):
                if alturas[i] > max_altura:
                    max_altura = alturas[i]
                    pos_max = i
                i = i + 1
            print("=== ÁRBOL CON MAYOR ALTURA ===")
            print("Tipo:", tipos[pos_max], "Altura:", alturas[pos_max], "Diámetro:", diametros[pos_max])

print("Programa finalizado.")
