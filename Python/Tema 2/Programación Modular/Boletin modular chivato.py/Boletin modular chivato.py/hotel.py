
matriz=[[22, 20, 19, 21],
        [18, 25, 23, 22],
        [19, 21, 20, 24],
        [17, 23, 22, 19],
        [24, 23, 27, 26]]
medialist=[]
columlist=[]
columlistespecial=[]
def tempmedia (matriz, medialist):

    for i in matriz:
        media=0
        for a in i:
            media+=a
        media=media//4
        medialist.append(media)
    return medialist
def mediahotel(medialist):
    media=0
    for i in medialist:
        media+=i
    mediatotal=media//5
    return mediatotal

def calculaMediaColumna0(matriz,columlist):
    media=0
    for i in matriz:
        media+=i[0]
    columlist=media//5
    return columlist
def calculaMediaColumnaDeterminada(matriz,columlistespecial):
    media=0
    columna=int(input("Que habitacion quieres calcular la media"))
    for i in matriz:
        media+=i[columna]
    columlistespecial=media//5
    print(columlistespecial)

print(tempmedia (matriz, medialist))
print(mediahotel(medialist))
print(calculaMediaColumna0(matriz,columlist))
calculaMediaColumnaDeterminada(matriz,columlistespecial)
