#9) Login con máximo 3 intentos
def Login(usuario, contrasena):
    return usuario == "usuario1" and contrasena == "asdasd"

intentos = 0
max_intentos = 3
logeado = False

while intentos < max_intentos and not logeado:
    u = input("Usuario: ")
    p = input("Contraseña: ")
    if Login(u, p):
        logeado = True
    else:
        intentos += 1
        print(f"Fallo. Intentos usados: {intentos}/{max_intentos}")

if logeado:
    print("Login correcto. Bienvenido.")
else:
    print("Se han agotado los intentos.")
