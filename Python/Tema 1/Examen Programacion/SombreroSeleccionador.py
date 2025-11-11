import random

totalalumnos = 0
gryffindor = 0
slytherin = 0
hufflepuff = 0
ravenclaw = 0
Continuar = True

print("==========================")
print("  SOMBRERO SELECCIONADOR  ")
print("==========================")

while Continuar:
    print("1. Seleccionar casa para un alumno")
    print("2. Mostrar Estadísticas")
    print("Elige una opción. Si quieres salir del programa, escribe la opción 1 y el nombre del personaje innombrable")
    
    eleccion = int(input("¿Qué opción eliges?: "))
    
    while eleccion > 2 or eleccion < 1:
        eleccion = int(input("Opción incorrecta. ¿Qué opción eliges?: "))
    
    if eleccion == 1:
        nombre = input("Dime tu nombre: ")
        
        if nombre == "Voldemort":
            print("Apparition, transpórtame a otro sitio")
            Continuar = False
        
        casa = random.randint(1, 4)
        print("El sombrero dice que", nombre, "pertenece a la casa", 
                ["Gryffindor","Slytherin","Hufflepuff","Ravenclaw"][casa-1])
        
        totalalumnos += 1
        if casa == 1:
            gryffindor += 1
        elif casa == 2:
            slytherin += 1
        elif casa == 3:
            hufflepuff += 1
        elif casa == 4:
            ravenclaw += 1
            
    elif eleccion == 2:
        if totalalumnos == 0:
            print("No hay alumnos aún.")
        else:
            print("Total de alumnos:", totalalumnos)
            print("Gryffindor:", gryffindor)
            print("Slytherin:", slytherin)
            print("Hufflepuff:", hufflepuff)
            print("Ravenclaw:", ravenclaw)
