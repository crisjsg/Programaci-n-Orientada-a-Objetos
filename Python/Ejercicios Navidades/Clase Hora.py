

class Hora ():

# Propiedades privadas de la clase #
    def __init__(self, hora=0, minutos = 0, segundos = 0):
        self.hora = int(hora)
        self.minutos = int(minutos)
        self.segundos = int(segundos)

	# Propiedades públicas de la clase #
    def setHora(self, hora):
        #self.hora     = int(hora)
        if hora in range(0, 25):
            self.hora= int(hora)
        else:
            self.hora = 0

    def getHora(self):
        return [self.hora, self.minutos, self.segundos]

    def setMinutos(self, minutos):
        #self.minutos  = int(minutos)
        if minutos in range(0, 60):
            self.minutos  = int(minutos)
        else:
            self.minutos = 0
            b
    def getMinutos(self):
        return self.minutos

    def setSegundos(self, segundos):
        #self.segundos = int(segundos)
        if segundos in range (0, 60):
            self.segundos  = int(segundos)
        else:
            self.segundos = 0

    def getSegundos(self):
        return self.segundos

    def imprimirHora(self):
        return (self.hora, ":", self.minutos, ":", self.segundos)

# tests

miHora = Hora()
miHora.setHora(20)
# miHora.setHora( 20, 15, 44 )
miHora.setMinutos(13)
miHora.setSegundos(35)

print(miHora.getHora())
print(miHora.getMinutos(), "minutos")
print(miHora.getSegundos(), "segundos")
