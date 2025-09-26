edad = int(input("Introduce tu edad: "))
ciudadano = (input("¿Eres ciudadano? (si/no): "))

if ciudadano == "si":
    ciudadano = True
else:
    ciudadano = False

if edad >= 18 and ciudadano:
    elegible = +1
    print ("Eres apto para votar")
else:
    print ("No eres apto para votar")