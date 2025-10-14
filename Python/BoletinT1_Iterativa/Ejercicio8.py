mult = 0
numero = int(input("Dame un número: "))
print ("=== Tabla del ", numero, "===")
for mult in range(1, 11):
    resultado = numero * mult
    print (mult, "*", numero, "=", resultado)
print ("Fin de la tabla")