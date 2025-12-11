#8) Área y perímetro de una circunferencia
from math import pi

def calculaArea(radio):
    return (radio ** 2) * pi

def calculaPerimetro(radio):
    return 2 * pi * radio

def calculaAreaYPerimetro(radio):
    return calculaArea(radio), calculaPerimetro(radio)

r = float(input("Dame el radio de la circunferencia: "))
area, perimetro = calculaAreaYPerimetro(r)
print("Perímetro:", perimetro)
print("Área:", area)
