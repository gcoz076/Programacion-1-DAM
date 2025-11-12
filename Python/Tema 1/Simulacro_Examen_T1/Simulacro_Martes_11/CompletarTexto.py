listapalabras = []
letra = input("Dame una letra: ").lower()
while len(letra) != 1:
    letra = input("Dame solo una letra: ")
palabras = ""
while not palabras == "stop":
    palabras = input("Introduce palabras, escribe stop si no deseas guardar más palabras: ").lower()
    listapalabras.append(palabras)
listapalabras.remove("stop")
print ("La letra introducida es: ", letra)
print (" La lista de palabras es: ", listapalabras, "Y el número de palabras es: ", len(listapalabras))

print ("---Menu---")
print ("Introduzca E si desea devolver la lista de palabras que comienzan por la letra.")
print ("Introduzca C si desea devolver la lista de palabras que contienen  la letra. ")
print ("Introduzca S para terminar el programa.")
opcion = input("Dime que Opción eliges: ").lower()

while opcion != "s":

    if opcion == "e":
        Resultado = []
        for palabras in listapalabras:
            if palabras[0] == letra:
                Resultado.append(palabras)
        print("Esta es la lista de palabras que comienzan con la letra ", letra, ":", Resultado)

    elif opcion == "c":
        Resultado = []
        for palabras in listapalabras:
            if letra in palabras:
                Resultado.append(palabras)
        print("Esta es la lista de palabras que contienen la letra ", letra, ":", Resultado)

    elif opcion == "l":
        listaordenada = []
        while len(listapalabras) > 0:
            palabra_corta = listapalabras[0]
            for palabra in listapalabras:
                if len(palabra) < len(palabra_corta):
                    palabra_corta = palabra
            listaordenada.append(palabra_corta)
            listapalabras.remove(palabra_corta)
        
        print("Palabras ordenadas por longitud:", listaordenada)
        listapalabras = listaordenada[:]


    print ("---Menu---")
    print ("Introduzca E si desea devolver la lista de palabras que comienzan por la letra.")
    print ("Introduzca C si desea devolver la lista de palabras que contienen  la letra. ")
    print ("Introduzca S para terminar el programa.")
    opcion = input("Dime que Opción eliges: ").lower()