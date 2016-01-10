

class Hora ():
	# Propiedades privadas de la clase #
	def __init__(self, hora = 00, minutos = 00, segundos = 00):
		self.hora     = int(hora)
		self.minutos  = int(minutos)
		self.segundos = int(segundos)

	# Propiedades públicas de la clase #
	def setHora(self, horas):
		self.hora     = int(hora)
		#if horas in range (0, 25):
		#	self.horas  = int(horas)
		#else:
			#self.horas = 0
	def getHora(self):
		return [hora, minutos, segundos]

	def setMinutos(self, minutos):
		self.minutos  = int(minutos)
		#if minutos in range (0, 60):
		#	self.minutos  = int(minutos)
		#else:
			#self.minutos = 0
	def getMinutos(self):
		return self.minutos

	def setSegundos(self, segundos):
		self.segundos = int(segundos)
		#if segundos in range (0, 60):
		#	self.segundos  = int(segundos)
		#else:
			#self.segundos = 0
	def getSegundos(self):
		return self.segundos

	def imprimirHora(self):
		return hora,":", minutos, ":", segundos


#tests

miHora = Hora()
print (miHora.imprimirHora())