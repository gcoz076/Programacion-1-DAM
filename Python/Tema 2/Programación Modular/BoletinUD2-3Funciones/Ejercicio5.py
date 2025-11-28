def estaOrdenada(lista, ascendente):
    ordenada = True
    if len(lista) > 1:
        i = 0
        while i < len(lista) - 1 and ordenada:
            if ascendente:
                if lista[i] > lista[i + 1]:
                    ordenada = False
            else:
                if lista[i] < lista[i + 1]:
                    ordenada = False
            i += 1
    return ordenada
ascendente = True
ord = estaOrdenada([1, 2, 3, 7, 5])
print (ord)