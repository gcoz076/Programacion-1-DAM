Dia = int(input("Dime un Día: "))
Mes = int(input("Dime un Mes: "))
while Dia <= 31 and Mes <=12:
    hemisferio = input("Dime un Hemisferio (Norte/Sur): ").upper()
    if hemisferio == "NORTE":
        match Mes:
            case 9:
                if Dia >= 23:
                    print ("Es Otoño")
            case 12:
                if Dia >= 21:
                    print ("Es Invierno")
            case 3:
                if Dia >= 21:
                    print ("Es Primavera")
            case 6:
                if Dia >= 21:
                    print ("Es Verano")
            case 10 | 11:
                print ("Es Otoño")
            case 1 | 2:
                print ("Es Invierno")
            case 4 | 5:
                print ("Es Primavera")
            case 7 | 8:
                print ("Es Verano")
            case _:
                print ("Ese número no pertenece a ningun mes")
    if hemisferio == "SUR":
        match Mes:
            case 9:
                if Dia >= 23:
                    print ("Es Otoño")
            case 12:
                if Dia >= 21:
                    print ("Es Invierno")
            case 3:
                if Dia >= 21:
                    print ("Es Primavera")
            case 6:
                if Dia >= 21:
                    print ("Es Verano")
            case 10 | 11:
                print ("Es Otoño")
            case 1 | 2:
                print ("Es Invierno")
            case 4 | 5:
                print ("Es Primavera")
            case 7 | 8:
                print ("Es Verano")
            case _:
                print ("Ese número no pertenece a ningun mes")
    Dia = int(input("Dime un Día: "))
    Mes = int(input("Dime un Mes: "))
print ("FIN")