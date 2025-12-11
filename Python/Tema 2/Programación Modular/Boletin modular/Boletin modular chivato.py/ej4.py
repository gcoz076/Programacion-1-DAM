#4) Pedir número de días y usar la función tantas veces — usar matriz para almacenar
def calculaTemperaturaMedia(tmax, tmin):
    return (tmax + tmin) / 2

dias = int(input("¿Para cuántos días quieres calcular la media? "))
# matriz: cada fila [tmax, tmin, media]
datos = []

for i in range(dias):
    print(f"Dia {i+1}:")
    tmax = float(input("  Temperatura máxima: "))
    tmin = float(input("  Temperatura mínima: "))
    media = calculaTemperaturaMedia(tmax, tmin)
    datos.append([tmax, tmin, media])

print("\nResultados:")
for idx, fila in enumerate(datos, 1):
    print(f"Día {idx}: Tmáx={fila[0]}, Tmín={fila[1]}, Media={fila[2]}")
