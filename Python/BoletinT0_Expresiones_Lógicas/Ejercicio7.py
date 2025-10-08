DiasLaburados = int(input("¿Cuantos días laburados llevas? "))
if DiasLaburados > 365:
    print ("Tienes derecho a los 30 días de vacaciones pagadas")
else:
    Diasrestantes = 365 - DiasLaburados
    print ("No tienes derecho a las vacaciones pagadas todavía, te quedan"
           , Diasrestantes, "días para las vacaciones")
print ("Final de la encuesta")