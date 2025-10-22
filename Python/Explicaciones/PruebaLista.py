diaSemana = ["Lunes", "Martes", "Miércoles"]
diaFinSemana = ["Sabado", "Domingo"]
print (diaSemana[1]) #Lectura por posición


diaSemana.append("Viernes") #Agrego al final
diaSemana.insert(3,"Jueves") #Agrego en la posición que quiera
diaSemana = diaSemana + diaFinSemana

diaSemana.pop(6) #Borrado por posición
print(len(diaSemana)) #Tamaño de la lista
diaSemana.remove("Martes") #Borrado por valor
print (diaSemana)

if "Lunes" in diaSemana: #Para comprobar si un valor está o no en la lista
    print("Está")
    print (diaSemana.index("Lunes")) #Devuelve en que posición esta el valor.
else: 
    print("No está")

for valorlista in diaSemana:
    print (valorlista)

for i in range (len(diaSemana)):
    print (diaSemana[i])