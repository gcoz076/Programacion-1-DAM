Mes = (input("Dime el numero de un mes: "))
match Mes:
    case 1 | 2 | 3:
        print ("Es Invierno")
    case 4 | 5 | 6:
        print ("Es Primavera")
    case 7 | 8 | 9:
        print ("Es Verano")
    case 10 | 11 | 12:
        print ("Es Otoño")
    case _:
        print ("Ese núero no pertenece a ningun mes")
