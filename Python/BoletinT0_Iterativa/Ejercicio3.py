num = int(input("Dime un número: "))
suma = 0
if num > 0:
    for i in range(1, num):
        suma += i
        print (" Estos son los números generados: ", i)
else:
    print ("Argumento inválido")
print ("La suma de los números son: ", suma)
print ("Fin del programa")