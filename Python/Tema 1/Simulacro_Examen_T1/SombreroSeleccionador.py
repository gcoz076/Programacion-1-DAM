import random
totalalumnos = 0
gryffindor = 0
slytherin = 0
hufflepuff = 0
ravenclaw = 0
print ("==========================")
print ("  SOMBRERO SELECCIONADOR  ")
print ("==========================")
print ("1. Seleccionar casa para un alumno")
print ("2. Mostrar Estadísticas")
print (" Elige una opción. Si quieres salir del programa, escribe la opción 1 y el nombre del personaje innombrable")
eleccion = int(input("¿Que opción eliges?: "))
casa = random.randint(1,4)
while eleccion > 2:
    eleccion = int(input("¿Que opción eliges?: "))
while eleccion == 1 or eleccion == 2:
    if eleccion == 1:
        print ("Ejecutando y seleccionando casa")
        nombre = input("Dime tu nombre: ")
        if nombre != "Voldemort":
            print ("Apparition, transpórtame a otro sitio")
            break
        else:
            print ("== 1.- Griffindor ==")
            print ("== 2.- Slytherin ==")
            print ("== 3.- Hufflepuff ==")
            print ("== 4.- Ravenclaw ==")
            print ("El sombrero dice que", nombre, "pertenece a la", casa)
            if casa == 1:
                totalalumnos = totalalumnos +1
                gryffindor = gryffindor +1
            elif casa == 2:
                totalalumnos = totalalumnos +1
                slytherin = slytherin +1
            elif casa == 3:
                totalalumnos = totalalumnos +1
                hufflepuff = hufflepuff +1
            elif casa == 4:
                totalalumnos = totalalumnos +1
                ravenclaw = ravenclaw +1
    elif eleccion == 2 and totalalumnos > 0:
        print ("Ejecutando y mostrar estadísticas")
        print ("Total de alumnos: ", totalalumnos)
        print ("Gryffindor: ", gryffindor)
        print ("Slytherin:  ", slytherin)
        print ("Hufflepuff: ", hufflepuff)
        print ("Ravenclaw:  ", ravenclaw)
    eleccion = int(input("¿Que opción eliges?: "))
if eleccion > 2:
    print ("Elección incorrecta")

