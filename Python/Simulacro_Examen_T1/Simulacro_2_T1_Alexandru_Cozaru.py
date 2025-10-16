<<<<<<< HEAD
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
=======
continuar = True
while continuar:
    dia = int(input("Dime un día del mes: "))
    mes = int(input("Dime un mes del año: "))
    if dia > 31 or mes > 12:
        continuar =False
    else: 
        hemisferio = str(input("Dime un hemisferio (Norte/Sur): ")).upper()
        while hemisferio != "NORTE" or hemisferio != "SUR":
            print ("Eso no es un hemisferio")
        if hemisferio == "NORTE":
            if (mes == 9 and dia >= 23) or mes == 10 or mes == 11 or (mes == 12 and dia < 21):
                estacion = "Otoño"
            elif (mes == 12 and dia >= 21) or mes == 1 or mes == 2 or (mes == 3 and dia < 21):
                estacion = "Invierno"
            elif (mes == 3 and dia >= 21) or mes == 4 or mes == 5 or (mes == 6 and dia < 21):
                estacion = "Primavera"
            else:
                estacion = "Verano"
        else:
            if (mes == 9 and dia >= 23) or mes == 10 or mes == 11 or (mes == 12 and dia < 21):
                estacion = "Primavera"
            elif (mes == 12 and dia >= 21) or mes == 1 or mes == 2 or (mes == 3 and dia < 21):
                estacion = "Verano"
            elif (mes == 3 and dia >= 21) or mes == 4 or mes == 5 or (mes == 6 and dia < 21):
                estacion = "Otoño"
            else:
                estacion = "Invierno"
print ("La estación es: ", estacion)
>>>>>>> 177ff0154889bfaef252813c9a23d3f236f8dbab
