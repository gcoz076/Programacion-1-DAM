clientes = []
opcion = ""

while opcion != "G":
    print("==========================================================")
    print("A) Añadir cliente")
    print("V) Validar emails almacenados")
    print("C) Contar clientes de un dominio")
    print("M) Mostrar los % de clientes premium y normales.")
    print("G) Salir")
    print("==========================================================")
    opcion = input("Elige una opción: ").upper()

    if opcion == "A":
        tipo = ""
        while tipo != "S" and tipo != "N":
            tipo = input("¿Es cliente premium? (S/N): ").upper()
        email = input("Introduce el correo electrónico: ")
        clientes.append((email, tipo))

    elif opcion == "V":
        incorrectos = []
        for email, tipo in clientes:
            if "@" not in email:
                incorrectos.append(email)
            else:
                parte_despues = email.split("@")[1]
                if "." not in parte_despues:
                    incorrectos.append(email)

        print("Emails incorrectos:")
        print(len(incorrectos))
        for e in incorrectos:
            print(e)

    elif opcion == "C":
        dominio = input("Introduce el dominio a buscar: ")
        contador = 0
        for email, tipo in clientes:
            partes = email.split("@")
            if len(partes) > 1:
                servidor = partes[1].split(".")[0]
                if servidor == dominio:
                    contador = contador + 1
        print("Clientes con dominio " + dominio + ":")
        print(contador)

    elif opcion == "M":
        opcion = opcion