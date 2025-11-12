meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
tempMedia = []
for o in range(12):
    temps = int(input("Dame las temperaturas medias de " + meses[o] + ": "))
    tempMedia.append(temps)

for i in range (12):
    print (meses[i] + ": " + ("*" * tempMedia[i]) + str(tempMedia[i]), "ºC")