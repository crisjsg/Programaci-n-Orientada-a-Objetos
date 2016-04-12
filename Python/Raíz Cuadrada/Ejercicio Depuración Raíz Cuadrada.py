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
