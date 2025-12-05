#6) calcularMax: pide 10 números y devuelve máximo
def calcularMax(lista):
    # asumimos lista no vacía
    maximo = lista[0]
    for x in lista:
        if x > maximo:
            maximo = x
    return maximo

nums = []
for i in range(10):
    nums.append(float(input(f"Introduce número {i+1}: ")))

print("Lista:", nums)
print("Máximo:", calcularMax(nums))
