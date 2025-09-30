DiaSemana = input("Dame una opción (L/M/X/J/V/S/D): ")
match DiaSemana:
    case "L" | "l" | "M" | "m" | "X" | "x" | "J" | "j" | "V" | "v":
        print ("Tienes que estar en el instituto")
    case "S" | "s" | "D" | "d":
        print ("Puedes estar en casa")
    case _:
        print ("No válido")