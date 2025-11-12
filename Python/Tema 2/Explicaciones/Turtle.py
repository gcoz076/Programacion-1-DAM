import turtle
def pintalinea(color, largo, posX, posY, PrimeraVez):
    turtle.color(color)
    turtle.forward(largo)
    turtle.speed(5)

    turtle.pendown()
    if PrimeraVez:
        turtle.goto(posX, posY)
def pintacuadrado(color, longitud, X, Y):
    turtle.goto(X, Y)
    for i in range(4):
        turtle.color(color)
        turtle.forward(longitud)
        turtle.right(90)   

pintacuadrado("red", 100, 0, 0)
pintacuadrado("blue", 100, 50, 50)
pintacuadrado("green", 100, -50, -50)

turtle.hideturtle()
turtle.done()