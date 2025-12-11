import random
ganancias=0
perdidas=0
listatotal=[]

def dados():
    dado1 = random.randint(1,6)
    dado2 = random.randint(1,6)
    print(dado1)
    return dado1 + dado2

def apuesta(listatotal, ganancias, perdidas):
    apuestalista = []
    apuestadinero = int(input("Cuantos euros quieres apostar: "))
    apuestanum = int(input("Por qué número quieres apostar: "))

    resultado = dados()

    apuestalista.append(apuestanum)
    apuestalista.append(resultado)
    apuestalista.append(apuestadinero)

    if resultado == apuestanum:
        apuestalista.append("gana")
        print("Ha ganado")
        print(f"Los dados sacaron {resultado}")
        ganancias += apuestadinero
    else:
        apuestalista.append("pierde")
        print("Ha perdido")
        print(f"Los dados sacaron {resultado}")
        perdidas += apuestadinero

    listatotal.append(apuestalista)
    return listatotal, ganancias, perdidas

def historial(listatotal):
    c1=0
    for i in listatotal:
        c1+=1
        print(f"La apuesta numero {c1} se aposto al {i[0]} salio el resultado {i[1]} y se {i[3]} un total de {i[2]} euros")

def cartera(ganancias, perdidas):
    return ganancias - perdidas

opcion=" "
while opcion != "S":
    print("A) Apostar")
    print("H) Historial")
    print("C) Saldo de la cartera")
    print("S) Salir")
    opcion = input("Elige una opción: ").upper()

    if opcion == "A":
        listatotal, ganancias, perdidas = apuesta(listatotal, ganancias, perdidas)

    elif opcion == "H":
        historial(listatotal)

    elif opcion == "C":
        print("Saldo actual:", cartera(ganancias, perdidas))

    elif opcion == "S":
        print("Saliendo...")

    else:
        print("Opción inválida.")


