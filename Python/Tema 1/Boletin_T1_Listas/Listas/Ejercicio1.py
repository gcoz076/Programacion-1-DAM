Animales = ["perro", "gato", "zorro", "caballo", "cerdo"]
animal = str(input("Dame el nombre de un animal: ")).lower()
while animal != "exit":
    if animal in Animales:
        print ("Esta")
        print (Animales.index(animal))
    else:
        print ("No está")
    animal = str(input("Dame el nombre de un animal: ")).lower()
print (Animales[0:len(Animales)])
print ("Fin")