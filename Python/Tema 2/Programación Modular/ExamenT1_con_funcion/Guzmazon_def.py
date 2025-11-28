def pintamenu():

def leevalidaopcion():

    return opcion

def calculasobrante():
    print ("Sobrante...")
    Sobrante = dinero - totalactual
    print ("Esto es lo que te sobra:", Sobrante)
    return Sobrante

def eliminaproductocarrito(productos, precios):
    print ("Esta es la lista de productos:", productos)
    print ("Esta es la lista de precios:", precios)
    nomproductos = input("Introduce el nombre del producto: ")
    validacion = input("¿Seguro que quieres eliminar este producto? (S/N)").upper()
    if validacion == "S":
        pos = productos.index(nomproductos)
        productos.pop(pos)
        precios.pop(pos)
    return productos, precios

def calculaproductoscaros(precios):
    print ("Productos caros")
    caro = []
    importe = float(input("Introduce un importe "))
    for precio in precios:
        if precio > importe:
            caro.append(precio)
    print (precio)
    return caro

prodcaros = calculaproductoscaros
print (prodcaros)
