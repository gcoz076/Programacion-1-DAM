import random
num1 = random.randint(0, 10)
num2 = random.randint(0, 10)
print ("Suma: ", num1, "+", num2)
resultado = num1 + num2
suma = int(input("Introduzca el resultado a continuación: "))
while suma != resultado:
    suma = int(input("Introduzca el resultado correcto: "))
print ("¡¡Correcto!! el resultado de la suma es: ", suma)