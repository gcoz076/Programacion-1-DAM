ventas = [
    ["Portatil", 150, 799.99, 4.5],
    ["Smartphone", 250, 599.99, 4.3],
    ["Auriculares", 400, 49.99, 4.0],
    ["Tablet", 120, 299.99, 3.9],
    ["Monitor", 180, 199.99, 4.3],
    ["Smartwatch", 220, 149.99, 4.1],
    ["Teclado mecánico", 300, 89.99, 4.4],
    ["Ratón gaming", 350, 59.99, 4.0],
    ["Cámara digital", 90, 999.99, 4.6],
    ["Consola", 200, 399.99, 4.7]
]

def getProducto(ventas, producto):
    productoFinal = []
    fila = 0
    terminar = False
    while fila < len(ventas) and not terminar:
        objeto = ventas[fila]
        if objeto[0] == producto:
            productoFinal= objeto
            terminar = True
        else:
            fila = fila + 1
    return productoFinal

def calcular_ingresos(ventas, producto):
    ingreso = 0
    filaProducto = getProducto(ventas, producto)
    if len(filaProducto) > 0:
        ingreso = filaProducto[1]*filaProducto[2] 
    return ingreso

def producto_destacado(ventas, producto):
    valoracion = getProducto(ventas, producto)
    Destacado = False
    if len(valoracion) > 0:
        if valoracion[3] >= 4.2:
            Destacado = True
        else:
            Destacado = False
    return Destacado

def getProductosDestacados2(ventas):
    lista = []
    for elemento in ventas:
        if producto_destacado(ventas, elemento[0]):
            lista.append(elemento)
    return lista

def tienemayoringreso(producto, producto2):
    UnoMasQueDos = True
    producto = calcular_ingresos(ventas, producto)
    producto2 = calcular_ingresos(ventas, producto2)
    if producto > producto2:
        UnoMasQueDos = True
    else:
        UnoMasQueDos = False
    return UnoMasQueDos
calculo = calcular_ingresos(ventas, "Consola")
print (calculo)

calculo = calcular_ingresos(ventas, "Tomate")
print (calculo)

Valoraciones = producto_destacado(ventas, "Consola")
print (Valoraciones)

Valoraciones = producto_destacado(ventas, "Tomate")
print (Valoraciones)

prodlista = getProductosDestacados2(ventas)
print (prodlista)

MayorIngreso = tienemayoringreso("Tablet", "Consola")
print (MayorIngreso)