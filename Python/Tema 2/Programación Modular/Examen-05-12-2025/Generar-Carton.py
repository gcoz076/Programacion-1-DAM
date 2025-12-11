import random
def getListaSinRepetidos():
    for i in range(1, 6):
        if i == 1:
            columna1 = []
            for n in range(10):
                if len(columna1) < 5:
                    numeros1 = random.randint(1,15)
                    if numeros1 not in columna1:
                        columna1.append(numeros1)
        elif i == 2:
            columna2 = []
            for n in range(10):
                if len(columna2) < 5:
                    numeros2 = random.randint(16,30)
                    if numeros2 not in columna2:
                        columna2.append(numeros2)
        elif i == 3:
            columna3 = []
            for n in range(10):
                if len(columna3) < 4:
                    numeros3 = random.randint(31, 45)
                    if numeros3 not in columna3:
                        columna3.append(numeros3)
            columna3.insert(2, "--")
        elif i == 4:
            columna4 = []
            for n in range(10):
                if len(columna4) < 5:
                    numeros4 = random.randint(46, 60)
                    if numeros4 not in columna4:
                        columna4.append(numeros4)
        elif i == 5:
            columna5 = []
            for n in range(10):
                if len(columna5) < 5:
                    numeros5 = random.randint(61, 75)
                    if numeros5 not in columna5:
                        columna5.append(numeros5)
    return columna1, columna2, columna3, columna4, columna5

def generaCarton(matriz):
    columna1 = matriz[0]
    columna2 = matriz[0]
    columna3 = matriz[0]
    columna4 = matriz[0]
    columna5 = matriz[0]
    carton = [
        [columna1[0], columna2[0], columna3[0], columna4[0], columna5[0]]
        [columna1[1], columna2[1], columna3[1], columna4[1], columna5[1]]
        [columna1[2], columna2[2], columna3[2], columna4[2], columna5[2]]
        [columna1[3], columna2[3], columna3[3], columna4[3], columna5[3]]
        [columna1[4], columna2[4], columna3[4], columna4[4], columna5[4]]
    ]
    carton.append(columna1)
    carton.append(columna2)
    carton.append(columna3)
    carton.append(columna4)
    carton.append(columna5)
    return carton


listas = getListaSinRepetidos()
print (listas)
Carton = generaCarton(listas)
print (Carton)

assert len(listas) == 5
assert len(Carton) == 5