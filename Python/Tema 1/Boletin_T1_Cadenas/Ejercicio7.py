numero = input("Escribe un número: ")
num = int(input("¿Cuántos dígitos quieres quitar por delante?: "))
longitud = len(numero)
resultado = ""
for i in range(num, longitud):
    resultado = resultado + numero[i]
if resultado == "":
    resultado = "0"
print(resultado)