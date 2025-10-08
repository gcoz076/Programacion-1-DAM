cantidad = float(input("Cantidad que deseas retirar: "))
saldo = float(input("Cantidad de saldo en la cuenta: "))
if cantidad < saldo:
    print ("Es correcto, puede retirar su dinero.")
    SaldoFinal = saldo - cantidad
    print ("Su saldo tras el retiro es: ", SaldoFinal)
else:
    print ("No hay saldo suficiente.")
print ("Fin")