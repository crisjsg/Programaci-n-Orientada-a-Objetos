class Camarero(Persona):
	def __init__(self, horasTrabajadasJornada = 0, tasa = 0):
		#Atributos

		self.horasTrabajadasJornada = horasTrabajadasJornada
		self.tasa = tasa
		
		#Métodos

	def setHorasTrabajadasJornada(self, horasTrabajadasJornada):
		self.horasTrabajadasJornada = horasTrabajadasJornada

	def getHorasTrabajadasJornada(self, horasTrabajadasJornada):
		return self.horasTrabajadasJornada