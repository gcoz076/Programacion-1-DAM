#5) ConvertirEspaciado: espacio adicional tras cada letra
def ConvertirEspaciado(texto):
    resultado = ""
    for ch in texto:
        resultado += ch + " "
    return resultado

# uso
entrada = input("Escribe un texto: ")
print("Convertido:", ConvertirEspaciado(entrada))
