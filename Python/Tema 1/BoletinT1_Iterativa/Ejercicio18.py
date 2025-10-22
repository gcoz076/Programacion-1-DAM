num = int(input("Escribe un número: "))
resultado = num
for i in range(num-1, 0, -1):
    print (i, "*", resultado)
    resultado = resultado*i
    print (resultado)
print ("FIN")
