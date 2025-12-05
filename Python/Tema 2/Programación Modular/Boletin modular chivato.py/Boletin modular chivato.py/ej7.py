#7) calcularMaxMin: devuelve máximo y mínimo
def calcularMaxMin(lista):
    maximo = lista[0]
    minimo = lista[0]
    for x in lista:
        if x > maximo:
            maximo = x
        if x < minimo:
            minimo = x
    return maximo, minimo

nums = []
for i in range(10):
    nums.append(float(input(f"Introduce número {i+1}: ")))

maxi, mini = calcularMaxMin(nums)
print("Máximo:", maxi, "Mínimo:", mini)
