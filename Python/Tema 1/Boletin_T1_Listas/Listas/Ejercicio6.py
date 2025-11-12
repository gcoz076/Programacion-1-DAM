numeros = []
for i in range(10):
    num = int(input("Dame un número: "))
    numeros.append(num)

maximo = numeros[0]
minimo = numeros[0]

for num in numeros:
    if num > maximo:
        maximo = num
    if num < minimo:
        minimo = num

for num in numeros:
    if num == maximo:
        print(num, "máximo")
    elif num == minimo:
        print(num, "mínimo")
    else:
        print(num)