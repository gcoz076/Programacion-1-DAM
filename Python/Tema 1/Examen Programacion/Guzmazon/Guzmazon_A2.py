#Apartado 2
dinero = float(input("Introduce el dinero máximo que te quieres gastar en la compra: "))
nomproductos = ""
productos = []
precios = []
totalactual = 0
while totalactual < dinero:
    nomproductos = input("Introduce el nombre del producto: ")
    productos.append(nomproductos)
    precioprod = float(input("Introduce el precio de dicho producto: "))
    precios.append(precioprod)
    totalactual = totalactual + precioprod
productos.remove(nomproductos)
precios.remove(precioprod)
totalactual = totalactual - precioprod
print ("Importe máximo a gastar:", dinero)
print ("Productos:", productos)
print ("Precios:", precios)
print ("Coste total de la cesta:", totalactual)

print ("===== Menu =====")
print ("Pulse la opcion S para calcular el dinero sobrante")
print ("Pulse la opcion R para eliminar un producto y su precio de la lista")
print ("Pulsa la opcion C para devolver la lista de productos cuyo precio es maás alto que un importe")
print ("================")
opcion = input("Introduce una opcion: ").lower()
while opcion != "s" or opcion != "r" or opcion != "c":
    opcion = input("Introduce una opcion correcta: ").lower()
while opcion == "s" or opcion == "r" or opcion == "c":
    if opcion == "s":
        print ("Sobrante...")
    
    if opcion == "R":
        print ("Remove")

    if opcion == "C":
        print ("Productos caros")