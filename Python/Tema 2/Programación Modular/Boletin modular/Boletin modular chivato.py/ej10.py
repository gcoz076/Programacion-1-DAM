#10) Convertir segundos a horas, minutos, segundos
def desglosa_segundos(total_segundos):
    horas = total_segundos // 3600
    resto = total_segundos % 3600
    minutos = resto // 60
    segundos = resto % 60
    return horas, minutos, segundos

s = int(input("Introduce tiempo en segundos: "))
h, m, s_rem = desglosa_segundos(s)
print(f"{s} segundos = {h} h, {m} m, {s_rem} s")
