def estaOrdenadaAsc(lista):
    i = 0
    n = len(lista)
    ordenada = True
    while i < n - 1 and ordenada:
        if lista[i] > lista[i + 1]:
            ordenada = False
        i += 1
    return ordenada

orden = estaOrdenadaAsc([1,2,3,5])
print (orden)

orden = estaOrdenadaAsc([1,8,3,4])
print (orden)