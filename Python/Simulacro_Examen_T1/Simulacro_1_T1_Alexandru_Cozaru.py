alumno = input("Dime el nombre de un alumno: ")
while alumno != "exit":
    nota = int(input("Dime una nota del 1 al 100: "))
    if nota > 100:
        nota = int(input("Dime una nota del 1 al 100: "))
    else:
        if nota >= 90 and nota <= 100:
            print ("Sobresaliente")
        elif nota >=70 and nota <= 89:
            print ("Notable")
        elif nota >= 60 and nota <= 69:
            print ("Bien")
        elif nota >= 50 and nota <= 59:
            print ("Suficiente")
        else:
            print ("Suspenso")
    alumno = input("Dime el nombre de un alumno: ")