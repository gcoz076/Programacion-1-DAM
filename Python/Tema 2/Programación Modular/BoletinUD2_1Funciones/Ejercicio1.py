def ObtieneYValidaDatos():
    numero = int(input("Dame un número: "))
    while numero < 0:
        print("Tiene que ser positivo")
        numero = int(input("Dame un número: "))
    return numero

correcto = ObtieneYValidaDatos()
print (correcto )