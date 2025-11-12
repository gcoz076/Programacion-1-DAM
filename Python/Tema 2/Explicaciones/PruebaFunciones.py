#Definición funcion compruebaSiPar recibe un numero y devuelve un booleano (True o False)
def CompruebaSiEsPar(numero):
    return numero %2 == 0

num = int(input("Dame un número. "))
esPar = CompruebaSiEsPar(num)
print (num, esPar)
esPar = CompruebaSiEsPar(32)
print("32", esPar)


