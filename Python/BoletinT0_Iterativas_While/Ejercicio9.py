correcta = 0
incorrecta = 0
password = int(input("Introduzca una contraseña: "))
while password == 1234:
    incorrecta = incorrecta + password
    password = int(input("Introduzca un contraseña correcta: "))
correcta = correcta + password
print ("Contraseña válida")
password = int(input("Introduzca su contraseña: "))
while password != correcta:
    print("Contraseña Incorrecta, vuelva a introducirla")
    password = int(input("Introduzca su contraseña: "))
print ("Bienvenido")