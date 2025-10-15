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
