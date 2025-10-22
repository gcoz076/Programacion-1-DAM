num = int(input("Dime un número: "))
suma = 0
if num > 0:
    for i in range(1, num +1):
        suma = suma + i
        print (" Estos son los números generados: ", i)
    print ("La suma de los números son: ", suma)
else:
    print ("Argumento inválido")
print ("Fin del programa")