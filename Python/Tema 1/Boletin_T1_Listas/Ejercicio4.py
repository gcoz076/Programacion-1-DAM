lista = []
for i in range (5):
    num = int(input("Dime un número: "))
    lista.append(num)
print (lista)

listainv = []
for o in range (len(lista), 0, -1):
    listainv.append(o)
print (lista)