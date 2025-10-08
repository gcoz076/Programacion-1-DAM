resultado = 0
num1 = int(input("Dame un número: "))
num2 = int(input("Dame otro número: "))
while num1 != 0 or num2 != 0:
    resultado = resultado + num1
    resultado = resultado + num2
    print (resultado)
    num1 = int(input("Dame un número: "))
    num2 = int(input("Dame otro número: "))
print ("FIN")