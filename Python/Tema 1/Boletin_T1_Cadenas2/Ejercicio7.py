nombre = input("Dame un nombre completo: ")
palabras = nombre.split()
palabrasalida = ""
for palabra in palabras:
    palabrasalida = palabrasalida + palabra[0].upper() + palabra[1:] + " "
print (palabrasalida)