edad = int(input("Dame la edad de un alumno: "))
while edad != 0:
    if edad >= 18:
        print ("Cumples los requisitos de edad")
    else:
        print ("No cumples los requisitos de edad")
    edad = int(input("Dame la edad de un alumno: "))
print ("Fin")