Num = int(input("Escribe un número: "))
if Num <= 0:
    Num = int(input("Introduce otro número: "))
    for num in range(1, Num):
        print (num)
else:
    for i in range(1, Num):
        print (i)
print ("FIN") 
