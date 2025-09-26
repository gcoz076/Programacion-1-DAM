credito = int(input("Escriba a continuación su puntuaje de crédito: "))
ingreso = int(input("Indique a continuación el ingreso anual"))
if credito >= 700 and ingreso >= 60000:
    print ("Es apto para el préstamo hipotecario")
else:
    print ("No es apto para el préstamo")
print ("Fin de la encuesta")