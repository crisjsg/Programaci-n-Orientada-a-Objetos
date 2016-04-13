import math


def raizcuadrada(x):
    assert x >= 0
    b = x
    if b == 0:
        return b
    else:
        fin = False
        while not fin:
            if b == x / b:
                return b
            else:
                b = (1 / 2) * (x / b + b)
    assert x == b * b


def test():
    print("Introduce x")
    x = float(input('x = '))
    # raw_input devuelve un string
    print(raizcuadrada(x))


test()

'''
PARTE 2
Lo que he analizado para poder buscar el problema del código ha sido ejecutar primero el programa tal y como estaba
(habiendo puesto, eso si las precondiciones y postcondiciones que he visto necesarias) al principio dandome un error el programa.
El problema era que el input guardaba en la variable "x" el número como si fuera una string de manera que en el assert al igualarlo
a cero (un integer) saltaba la aserción. De esta manera lo que hice para buscar el origen del problema fue ir buscando como hacen en
el curso de Debugging yendo desde el final del problema hasta el principio mediante las dependencias.
'''
