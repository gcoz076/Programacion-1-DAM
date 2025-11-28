def estaOrdenada(lista, ascendente=True):
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

def es_entero(s):
    if not s:
        return False
    if s[0] in '+-':
        s = s[1:]
    return s.isdigit()

def cargar_lista():
    lista = []
    while True:
        entrada = input("Introduce un número entero (o algo que no sea número para terminar): ")
        if es_entero(entrada):
            lista.append(int(entrada))
        else:
            break
    return lista

if __name__ == "__main__":
    numeros = cargar_lista()
    print("Lista introducida:", numeros)
    if estaOrdenada(numeros, ascendente=True):
        print("La lista está ordenada ascendentemente.")
    else:
        print("La lista NO está ordenada ascendentemente.")