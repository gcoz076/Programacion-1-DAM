continuar = input("¿Desea registrar un nuevo incidente? S (para Sí) o N (para No): ").upper()
total_incidentes = 0
incidentes_leves = 0
incidentes_graves = 0
incidentes_eso = 0
incidentes_post = 0

while continuar == "S":
    nivel = ""
    while nivel != "E" and nivel != "P":
        nivel = input("¿En qué nivel ha ocurrido? E (para ESO) o P (para Post-Obligatoria): ").upper()
    tipo = ""
    while tipo != "L" and tipo != "G":
        tipo = input("¿Qué tipo de incidente ha ocurrido? L (para Leves) o G (para Graves): ").upper()
    total_incidentes = total_incidentes + 1
    if tipo == "L":
        incidentes_leves = incidentes_leves + 1
    else:
        incidentes_graves = incidentes_graves + 1
    if nivel == "E":
        incidentes_eso = incidentes_eso + 1
    else:
        incidentes_post = incidentes_post + 1
    continuar = input("¿Desea registrar un nuevo incidente? S (para Sí) o N (para No): ").upper()

print("Incidentes registrados")
if total_incidentes > 0:
    porcentaje_eso = (incidentes_eso * 100) / total_incidentes
    porcentaje_post = (incidentes_post * 100) / total_incidentes
    mensaje = "Se han producido " + str(total_incidentes) + " incidentes en el centro: " + str(incidentes_leves) + " de ellos Leves y " + str(incidentes_graves) + " Graves, siendo el " + str(int(porcentaje_eso)) + "% en ESO y el " + str(int(porcentaje_post)) + "% en Post-Obligatoria."
    print(mensaje)

print("\n" + "="*60 + "\n")

num1 = 1
num2 = 1

while not (num1 == 0 and num2 == 0):
    num1 = int(input("Introduzca el primer número: "))
    num2 = int(input("Introduzca el segundo número: "))

    if num1 < num2:
        impares = []
        for i in range(num1, num2 + 1):
            if i % 2 != 0:
                impares.append(str(i))

        print("=" * 50)
        mensaje_impares = "Impares que existen entre [" + str(num1) + " - " + str(num2) + "]: "

        cadena_impares = ""
        for j in range(len(impares)):
            if j == 0:
                cadena_impares = impares[j]
            else:
                cadena_impares = cadena_impares + ", " + impares[j]

        if len(impares) > 0:
            mensaje_impares = mensaje_impares + cadena_impares
        print(mensaje_impares)
        print("En total existen " + str(len(impares)) + " números impares en el rango.")
        print("=" * 50)

print("\n" + "="*60 + "\n")

num1 = 1
num2 = 1

while not (num1 == 0 and num2 == 0):
    num1 = int(input("Introduzca el primer número: "))
    num2 = int(input("Introduzca el segundo número: "))

    if num1 < num2:
        tipo_rango = ""
        while tipo_rango != "A" and tipo_rango != "C":
            tipo_rango = input("¿Rango Abierto (A) o Cerrado (C)? ").upper()

        impares = []
        if tipo_rango == "A":
            for i in range(num1 + 1, num2):
                if i % 2 != 0:
                    impares.append(str(i))
        else:
            for i in range(num1, num2 + 1):
                if i % 2 != 0:
                    impares.append(str(i))

        print("=" * 50)
        mensaje_impares = "Impares que existen entre [" + str(num1) + " - " + str(num2) + "]: "

        cadena_impares = ""
        for j in range(len(impares)):
            if j == 0:
                cadena_impares = impares[j]
            else:
                cadena_impares = cadena_impares + ", " + impares[j]

        if len(impares) > 0:
            mensaje_impares = mensaje_impares + cadena_impares
        print(mensaje_impares)
        print("En total existen " + str(len(impares)) + " números impares en el rango.")
        print("=" * 50)