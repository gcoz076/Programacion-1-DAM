Dia = input("Escribe un día: ").upper()
match Dia:
    case "LUNES":
        print ("==========================")
        print ("--------->LUNES<---------")
        print ("==========================")
        print (   "(8:00 - 9:00) -> ENT")
        print (  "(9:00 - 10:00) -> BD")
        print ( "(10:00 - 11:00) -> BD")
        print ("--------->RECREO<---------")
        print (" (11:30 - 12:30) -> IPE I")
        print (" (12:30 - 13:30) -> SOST")
        print (" (13:30 - 14:30) -> DIGIT")
        print ("==========================")

    case "MARTES":
        print ("==========================")
        print ("--------->MARTES<---------")
        print ("==========================")
        print ("   (8:00 - 9:00) -> PROG")
        print ("  (9:00 - 10:00) -> PROG")
        print (" (10:00 - 11:00) -> LMSGI")
        print ("--------->RECREO<---------")
        print (" (11:30 - 12:30) -> LMSGI")
        print (" (12:30 - 13:30) -> LMSGI")
        print (" (13:30 - 14:30) -> IPE I")
        print ("==========================")
    case "SABADO" | "DOMINGO":
        print ("Día de estudio y reflexión")
    case _:
        print ("El valor es incorrecto")