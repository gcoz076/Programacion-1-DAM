historialcrediticionegativo = (input("Indica si el historial crediticio es negativo: (si/no) "))
DuracionEmpleo = int(input("Cuantos días llevas laburados en su empleo: "))
SueldoAnual = int(input("Indique su sueldo anual: "))
Solicitud = int(input("¿Cuanto dinero solicita?: "))

if historialcrediticionegativo == "si":
    historialcrediticionegativo = True
else:
    historialcrediticionegativo = False

if Solicitud > 1/100 * SueldoAnual  or DuracionEmpleo < 730 or historialcrediticionegativo:
    print ("Tiene riesgo")
else:
    print ("No hay rieso de otorgarle el prestamo")
print ("Fin")