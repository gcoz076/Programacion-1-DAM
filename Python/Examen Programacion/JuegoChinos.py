# Juego clásico de los chinos.
# Falta el último apartado, no se me ocurre como hacerlo.
import random
humanowin = 0
maquinawin = 0
partidas = 0
humano = int(input("¿Cuántas piedras quieres mostrar(0 a 5)? "))
maquina = random.randint(0, 5)
while humano != maquina:
    while humano > 5 or humano < 0:
        print ("Valor invalido")
        humano = int(input("¿Cuántas piedras quieres mostrar(0 a 5)? "))
    suma = humano + maquina
    apuesta = input("¿Cual es tu apuesta? ").upper()
    apuesta = True
    print ("La suma de las piedras es: ", suma)
    match apuesta:
        case "P":
            if suma == 0 or suma == 2 or suma == 4 or suma == 6 or suma == 8 or suma == 10:
                apuesta = True
                print ("El numero es par, has ganado")
            else:
                apuesta = False
                print ("El número es impar, has perdido")
        case _:
            if suma == 1 or suma == 3 or suma == 5 or suma == 7 or suma == 9:
                apuesta = True
                print ("Es impar, has ganado")
            else:
                apuesta = False
                print("Es par, has perdido")
    partidas = partidas +1
    if apuesta == True:
        humanowin = humanowin +1
    elif apuesta == False:
        maquinawin = maquinawin +1
    humano = int(input("¿Cuántas piedras quieres mostrar(0 a 5)? "))
    maquina = random.randint(0, 5)
print ("Has ganado", humanowin, "rondas")
print ("La máquina a ganado", maquinawin, "rondas")
print ("Has jugado", partidas, "partidas")
print ("FIN")