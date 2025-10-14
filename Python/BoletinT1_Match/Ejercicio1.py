Dia = input("Escribe un día: ")
match Dia:
    case "LUNES" | "Lunes" | "lunes":
        print ("--------->LUNES<---------")
        print ("(8:00 - 9:00) -> FOL")
        print ("(9:00 - 10:00) -> EDE")
        print ("(10:00 - 11:00) -> PROG")
    case "SABADO" | "Sabado" | "sabado" | "DOMINGO" | "Domingo" | "domingo":
        print ("Día de estudio y reflexión")
    case _:
        print ("El valor es incorrecto")