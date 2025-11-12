import random

ganadas_j1 = 0
ganadas_j2 = 0
fin = 0

print("=== JUEGO DE PARES Y NONES ===")
print("El juego termina cuando ambos saquen 0 dedos")

while fin == 0:
    eleccion1 = ""
    while eleccion1 != "pares" and eleccion1 != "nones":
        eleccion1 = input("Jugador 1, elige pares o nones: ").lower()
    if eleccion1 == "pares":
        eleccion2 = "nones"
    else:
        eleccion2 = "pares"

    dedos1 = -1
    while dedos1 < 0 or dedos1 > 5:
        try:
            dedos1 = int(input("Jugador 1, elige cuántos dedos sacas (0-5): "))
        except:
            dedos1 = -1

    dedos2 = random.randint(0, 5)
    print("La máquina saca", dedos2, "dedos")

    if dedos1 == 0 and dedos2 == 0:
        fin = 1
    else:
        suma = dedos1 + dedos2
        if suma % 2 == 0:
            if eleccion1 == "pares":
                print("Gana Jugador 1 (pares)")
                ganadas_j1 = ganadas_j1 + 1
            else:
                print("Gana la máquina (pares)")
                ganadas_j2 = ganadas_j2 + 1
        else:
            if eleccion1 == "nones":
                print("Gana Jugador 1 (nones)")
                ganadas_j1 = ganadas_j1 + 1
            else:
                print("Gana la máquina (nones)")
                ganadas_j2 = ganadas_j2 + 1

print("Juego terminado")
print("Partidas ganadas por Jugador 1:", ganadas_j1)
print("Partidas ganadas por la máquina:", ganadas_j2)
