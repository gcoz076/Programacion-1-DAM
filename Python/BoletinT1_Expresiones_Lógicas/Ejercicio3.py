Vip = (input("¿Eres vip?: (si/no) " ))
Gastado = float(input("¿Cuanto has gastado en la tienda?: "))

if Vip == "si":
    Vip = True
else:
    Vip = False

if Gastado >= 100 or Vip:
    print ("Eres apto para recibir el descuento")
else:
    print ("No eres apto para el descuento")
print ("Fin de encuesta")