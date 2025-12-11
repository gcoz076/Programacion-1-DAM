def redondear(valor):
    valor_original = valor
    resultado = ""
    tipo = type(valor)
    if tipo == str:
        puntos = 0
        valido = True
        for caracter in valor:
            if caracter == ".":
                puntos = puntos + 1
            elif caracter not in "0123456789":
                valido = False
        if puntos > 1 or not valido:
            resultado = "== ERROR: El valor contiene caracteres no válidos =="
        else:
            print("== El numero pasa de cadena '" + valor + "' a decimal ==")
            valor = float(valor)
            tipo = float
    if tipo == int:
        resultado_num = str(valor) + ".00"
        print("== El numero Añade de " + str(valor_original) + " a " + resultado_num + " ==")
        resultado = resultado_num
    if tipo == float:
        texto = str(valor)
        partes = texto.split(".")
        parte_entera = partes[0]
        parte_decimal = partes[1]
        if int(parte_decimal) == 0:
            resultado_num = parte_entera + ".00"
            print("== El numero Añade de " + texto + " a " + resultado_num + " ==")
            resultado = resultado_num
        else:
            d1 = int(parte_decimal[0])
            d2 = int(parte_decimal[1])
            if len(parte_decimal) > 2:
                d3 = int(parte_decimal[2])
            else:
                d3 = 0
            if d3 >= 5:
                d2 = d2 + 1
                if d2 == 10:
                    d2 = 0
                    d1 = d1 + 1
                    if d1 == 10:
                        parte_entera = str(int(parte_entera) + 1)
                        d1 = 0
                print("== El numero Incrementa de " + texto + " a " + parte_entera + "." + str(d1) + str(d2) + " ==")
            else:
                print("== El numero Mantiene de " + texto + " a " + parte_entera + "." + str(d1) + str(d2) + " ==")
            resultado = parte_entera + "." + str(d1) + str(d2)
    return resultado

print(redondear(1.449))
print(redondear("0.374"))
print(redondear(5))
print(redondear(0.375))