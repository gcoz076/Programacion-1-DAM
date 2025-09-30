print ("Esta es la tabla de la casa rural")
print ("========================================")
print (" --Habitación--  --Camas--   --Planta--")
print ("========================================")
print ("  --1.Azul--       --2--     --Primera--")
print ("  --2.Roja--       --1--     --Primera--")
print ("  --3.Verde--      --3--     --Segunda--")
print ("  --4.Rosa--       --2--     --Segunda--")
print ("  --5.Gris--       --1--     --Tercera--")
print ("========================================")
NumHab = int(input("Dime el número de habitación: "))
match NumHab:
    case 1:
        print ("2 camas --- Primera planta")
    case 2:
        print ("1 cama --- Primera planta")
    case 3:
        print ("3 camas --- Segunda planta")
    case 4:
        print ("2 camas --- Segunda planta")
    case 5:
        print ("2 camas --- Tercera planta")
    case _:
        print ("Esa habitación no existe")