numero = input("Escribe un número: ")
numero_volteado = ""
for digito in numero:
    numero_volteado = digito + numero_volteado
print("El número volteado es:", numero_volteado)