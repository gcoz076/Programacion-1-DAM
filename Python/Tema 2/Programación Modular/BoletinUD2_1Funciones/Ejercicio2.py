def esMultiplo(numero1, numero2):
    esMultiplo = numero1 % numero2 == 0
    return esMultiplo

numero1 = int(input("Dame el primer número: "))
numero2 = int(input("Dame el segundo número: "))
loes= esMultiplo(numero1, numero2)
if loes:
    print ("Son multiplos")
else:
    print ("No son multiplos")
