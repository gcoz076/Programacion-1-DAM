opcion = (input("Dame una opción (A/B/C): "))
if (opcion == "A"):
    print ("alta")
elif (opcion == "B"):
    print ("baja")
elif (opcion == "C"):
    print ("cambio")
else:
    print ("No válido")



opcion2 = input("Dame otra opción (D/E/F): ")
match opcion2:
    case "D" | "d":
        print ("Derecha")
    case "E" | "e":
        print ("Estructura")
    case "F" | "f":
        print ("Formula")
    case _:
        print ("No válido")