#Pedir un número hasta que sea positivo
def obtieneYValidaDatosDeEntrada():
    n = float(input("Introduce un número (debe ser positivo): "))
    while n <= 0:
        print("No es positivo. Intenta otra vez.")
        n = float(input("Introduce un número (debe ser positivo): "))
    return n

# uso
num = obtieneYValidaDatosDeEntrada()
print("Número válido:", num)