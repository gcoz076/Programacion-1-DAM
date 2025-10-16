grupo1 = input("Dime un grupo sanguineo: ").upper()
grupo2 = input("Dime otro grupo sanguineo: ").upper()
match grupo1:
    case "A":
        if grupo2 == "A":
            print ("Son compatibles, A dona y recibe de A")
        elif grupo2 == "B":
            print ("No son compatibles")
        elif grupo2 == "AB":
            print ("Son compatibles, A dona a AB")
        elif grupo2 == "0":
            print ("Son compatibles, A rebibe de 0")
    case "B":
        if grupo2 == "A":
            print ("No son compatibles")
        elif grupo2 == "B":
            print ("Son compatibles, B dona y recibe de B")
        elif grupo2 == "AB":
            print ("Son compatibles, B dona a AB")
        elif grupo2 == "0":
            print ("Son compatibles, B recibe de 0")
    case "AB":
        if grupo2 == "A":
            print ("Son compatibles, AB Recibe de A")
        elif grupo2 == "B":
            print ("Son compatibles, AB recibe de B")
        elif grupo2 == "AB":
            print ("Son Compatibles, AB dona y recibe de AB")
        elif grupo2 == "0":
            print ("Son compatibles, AB recibe de 0")
    case "0":
        if grupo2 == "A":
            print ("Son compatibles, 0 dona a A")
        elif grupo2 == "B":
            print ("Son compatibles, 0 dona a B")
        elif grupo2 == "AB":
            print ("Son compatibles, 0 dona a AB")
        elif grupo2 == "0":
            print ("Son compatibles, 0 dona y recibe de 0")
print ("FIN")