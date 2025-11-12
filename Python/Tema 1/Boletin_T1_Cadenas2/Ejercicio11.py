cadena = input("Dame un número entero: ")
salida = ""
contador = 0
for i in range(len(cadena)-3, 0, -3):
    print(cadena[i:i+3])
    salida = "." + cadena[i:i+3] + salida
    contador = contador + 3
principio = cadena[0: len(cadena)-contador]
cadena = principio + salida
print (salida)
print (contador)