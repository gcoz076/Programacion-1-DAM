texto = "La inyección de SQL es un tipo de ciberataque encubierto en el cual un hacker inserta código propio en un sitio web con el fin de quebrantar las medidas de seguridad y acceder a datos protegidos. Una vez dentro, puede controlar la base de datos del sitio web y secuestrar la información de los usuarios. Le explicamos cómo funcionan los ataques de inyección de SQL, cómo combatirlos y cómo una herramienta antivirus potente lo puede proteger contra las consecuencias."""

lista =texto.split(".")
#print(lista)
print(len(lista))

listapalabra=texto.split(" ")
#print(listapalabra)
print(len(listapalabra))

for frase in lista:
    listapalabrafrase = frase.split(" ")
    print(len(listapalabrafrase))