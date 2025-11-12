hola = "Hola Mundo"
hola = hola.find("Mundo") #A partir de que caracter empieza la palabra
print (hola)

adios = "Adios Mundo"
adios = adios.find("Hola") #Aparece -1 por que la palabra no está en la cadena
print (adios)

txt = "Hola Mundo"
txt = txt.replace("l", "pizza") #Reemplaza todas las l por pizza
print (txt)

lista = "Bienvenidos,a,la,clase,de,programación"
lista = lista.split(",") #Hace una lista con las palabras separadas por el caracter que indiquemos
print (lista)
