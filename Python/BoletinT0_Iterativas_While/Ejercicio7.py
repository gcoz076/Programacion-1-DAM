import random
nummaq = random.randint(1, 10)
num = int(input("Dame un número: "))
while num != nummaq:
    num = int(input("Dame otro número: "))
print ("!!Lo has conseguido¡¡, el numero era: ", nummaq)