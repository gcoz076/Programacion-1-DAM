#11) Menú: convertir a segundos (S), minutos (M), horas (H) o salir (-1)
def a_segundos(h=0, m=0, s=0):
    return h*3600 + m*60 + s

def a_minutos(h=0, m=0, s=0):
    total_seg = a_segundos(h, m, s)
    return total_seg / 60

def a_horas(h=0, m=0, s=0):
    total_seg = a_segundos(h, m, s)
    return total_seg / 3600

while True:
    print("\nElige: (S)egundos, (M)inutos, (H)oras, (-1) Salir")
    opcion = input("Opción: ").strip().upper()
    if opcion == "-1":
        print("Saliendo.")
        break
    if opcion in ("S", "M", "H"):
        h = int(input("Horas: "))
        m = int(input("Minutos: "))
        s = int(input("Segundos: "))
        if opcion == "S":
            print("Total segundos:", a_segundos(h,m,s))
        elif opcion == "M":
            print("Total minutos:", a_minutos(h,m,s))
        else:
            print("Total horas:", a_horas(h,m,s))
    else:
        print("Opción no válida.")
