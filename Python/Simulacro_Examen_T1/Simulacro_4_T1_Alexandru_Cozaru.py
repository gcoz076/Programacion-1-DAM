num1 = int(input("Dame un número: "))
num2 = int(input("Dame un número: "))
num3 = int(input("Dame un número: "))

while num1 != 0 and num2 != 0 and num3 != 0:
    if num1 < num2 and num2 < num3:
        print("Creciente")
    elif num1 > num2 and num2 > num3:
        print("Decreciente")
    else:
        print("Desordenado")
    num1 = int(input("Dame un número: "))
    num2 = int(input("Dame un número: "))
    num3 = int(input("Dame un número: "))
    
print("FIN")