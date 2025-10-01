import random
print ("==========================")
print ("=======¡¡RECUERDA!!=======")
print ("======= 0. Piedra  =======")
print ("======= 1. Papel   =======")
print ("======= 2. Tijera  =======")
print ("==========================")
Humano = int(input("¿Cual es tu elección?"))
Maquina = random.randint(0,2)
print ("Esta es la elección de la maquina: ", Maquina)
match Humano:
    case 0: 
        if Maquina == 1:
            print ("La máquina gana")
        elif Maquina == 2:
            print ("¡¡Has ganado!!")
        else:
            print ("Empate")
    case 1:
        if Maquina == 0:
            print ("¡¡Has ganado!!")
        elif Maquina == 2:
            print ("La máquina gana")
        else:
            print ("Empate")
    case 2:
        if Maquina == 0:
            print ("La máquina gana")
        elif Maquina == 1:
            print ("¡¡Has ganado!!")
        else:
            print ("Empate")
    case _:
        print ("Elección no valida")
    