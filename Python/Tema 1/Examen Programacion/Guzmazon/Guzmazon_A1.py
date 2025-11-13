#Apartado 1
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