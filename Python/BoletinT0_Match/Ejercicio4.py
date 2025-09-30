Mes = int(input("Dime el numero de un mes: "))
Dia = int(input("Dime que día: "))
match Mes:
    case 3:
        if Dia <= 20:
            print ("Es Invierno")
        else:
            print ("Es Primavera")
    case 6:
        if Dia <= 20:
            print ("Es Primavera")
        else:
            print ("Es Verano")
    case 9:
        if Dia <= 20:
            print ("Es Verano")
        else:
            print ("Es Otoño")
    case 12:
        if Dia <= 20:
            print ("Es Otoño")
        else:
            print ("Es Invierno")
    case 1 | 2:
        print ("Es Invierno")
    case 4 | 5:
        print ("Es Primavera")
    case 7 | 8:
        print ("Es Verano")
    case 10 | 11:
        print ("Es Otoño")
    case _:
        print ("Ese número no pertenece a ningun mes")