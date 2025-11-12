numero = input("Escribe un número: ")
n = int(input("¿Cuántos dígitos quieres quitar por detrás?: "))
longitud = len(numero)
nueva_longitud = longitud - n
resultado = ""
for i in range(nueva_longitud):
    resultado = resultado + numero[i]
if resultado == "":
    resultado = "0"
print(resultado)