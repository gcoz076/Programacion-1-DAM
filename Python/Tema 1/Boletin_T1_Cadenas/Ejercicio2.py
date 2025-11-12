numero = input("Introduce un número entero: ")
if numero[0] == '-':
    print(len(numero) - 1)
else:
    print(len(numero))