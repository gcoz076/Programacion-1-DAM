from random import randint

def tirar_dado():
    dado = randint(1, 6)
    return dado

def juego_pase_ingles():
    historial = []
    saldo = 0
    opcion = ""
    while opcion != "3":
        print("")
        print("1. Apostar")
        print("2. Mostrar historial")
        print("3. Retirarse")
        opcion = input("Elige una opción: ")
        if opcion == "1":
            valor_apostado = int(input("Introduce el número al que apuestas (2-12): "))
            cantidad = float(input("Introduce la cantidad apostada: "))
            dado1 = tirar_dado()
            dado2 = tirar_dado()
            suma = dado1 + dado2
            print("Ha salido", dado1, "+", dado2, "=", suma)
            if suma == valor_apostado:
                ganancia = cantidad
                print("Has ganado", ganancia, "€")
            else:
                ganancia = -cantidad
                print("Has perdido", cantidad, "€")
            saldo = saldo + ganancia
            historial.append([valor_apostado, suma, ganancia])
        elif opcion == "2":
            print("--- HISTORIAL ---")
            if len(historial) == 0:
                print("No hay jugadas registradas.")
            else:
                indice = 0
                while indice < len(historial):
                    jugada = historial[indice]
                    numero = indice + 1
                    valor_apostado = jugada[0]
                    suma = jugada[1]
                    ganancia = jugada[2]
                    if ganancia >= 0:
                        print("En la", numero, "º jugada apostó al valor", valor_apostado, "y sumó", suma, ", ganando", ganancia, "€")
                    else:
                        print("En la", numero, "º jugada apostó al valor", valor_apostado, "y sumó", suma, ", perdiendo", -ganancia, "€")
                    indice = indice + 1
        elif opcion == "3":
            print("Te retiras con un saldo neto de:", saldo, "€")
        else:
            print("Opción no válida.")
    return saldo

resultado = juego_pase_ingles()
print("Saldo final:", resultado)