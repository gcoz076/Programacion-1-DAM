dia = int(input("Dime un día: "))
mes = int(input("Dime un mes: "))
ano = int(input("Dime el año: "))

mespar = 0
mesinpar = 0
febrero = 28

if 1 <= mes <= 12:
    for i in range(1, mes):
        if i % 2 == 1:
            mespar += 31
        else:
            if i == 2:
                continue
            else:
                mesinpar += 30

    if mes > 2:
        total = mespar + mesinpar + febrero + dia
    else:
        if mes == 1:
            total = dia
        else:
            total = 31 + dia
    print("Llevamos", total, "días del año", ano)
else:
    print("FIN")