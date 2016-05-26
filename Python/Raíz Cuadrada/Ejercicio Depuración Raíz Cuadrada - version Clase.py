import math


def raizcuadrada(x):
    assert x.isdigit()

    x = abs(float(x))

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
    check(x, b)


def test():
    print("Introduce x")
    x = input('x = ')
    # raw_input devuelve un string
    print(raizcuadrada(x))

def check(x, solucion)
    x = float(x)

    desviacion = 0.000001

    assert abs(abs(x) - solucion**2) <= desviacion

test()
