cadena = input("Dame la cadena: ")
letra1 = ""
letra2 = ""
salir = False
while not salir == True:
    letra1 = input("Dame un caracter: ")
    letra2 = input("Dame otro caracter: ")

    if len(letra1) == 1 and len(letra2) == 1:
        print (cadena.replace(letra1, letra2))
        salir = True
    else:
        print("Los caracteres son incorrectos")