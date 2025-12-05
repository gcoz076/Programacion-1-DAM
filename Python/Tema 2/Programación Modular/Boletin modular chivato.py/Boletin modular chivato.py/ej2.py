#2) ¿Alguno es múltiplo del otro? (función esMultiplo)
def esMultiplo(a, b):
    # devuelve True si a es múltiplo de b (si b != 0)
    if b == 0:
        return False
    return a % b == 0

# uso
x = int(input("Introduce el primer entero: "))
y = int(input("Introduce el segundo entero: "))

if esMultiplo(x, y):
    print(f"{x} es múltiplo de {y}")
elif esMultiplo(y, x):
    print(f"{y} es múltiplo de {x}")
else:
    print("Ninguno es múltiplo del otro.")
