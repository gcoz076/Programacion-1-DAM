Temperatura = float(input("Introduce la temperatura del ambiente:"))
if Temperatura > 26:
    print ("Encendiendo aire acondicionado")
    Temperatura = float(input("Introduce nuevamente la temperatura del ambiente:"))
    if Temperatura < 23:
        print ("Apagando el aire acondicionado")
elif Temperatura < 16:
        print("Encendiendo la calefacción")
else:
    print ("No encender nada")
print ("Registro: " + str(Temperatura))