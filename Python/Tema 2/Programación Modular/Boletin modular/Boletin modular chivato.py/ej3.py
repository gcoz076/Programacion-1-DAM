#3) Función calculaTemperaturaMedia y pedir máximas/mínimas por día (una vez)
def calculaTemperaturaMedia(tmax, tmin):
    return (tmax + tmin) / 2

# uso para un día
tmax = float(input("Temperatura máxima del día: "))
tmin = float(input("Temperatura mínima del día: "))
media = calculaTemperaturaMedia(tmax, tmin)
print("Temperatura media:", media)
