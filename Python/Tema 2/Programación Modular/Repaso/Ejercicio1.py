def pedir_numeros():
    n1 = int(input("Introduce el primer número: "))
    n2 = int(input("Introduce el segundo número: "))
    while n2 >= len(str(n1)):
        print("El segundo número debe ser menor que las cifras del primero")
        n1 = int(input("Introduce el primer número: "))
        n2 = int(input("Introduce el segundo número: "))
    return n1, n2

def sumar_digitos(n1, n2):
    digitos = str(n1)
    suma = 0
    for i in range(n2):
        suma = suma + int(digitos[i])
    return suma

def main():
    n1 = pedir_numeros()
    n2 = pedir_numeros()
    resultado = sumar_digitos(n1, n2)
    print("La suma es", resultado)

main()
