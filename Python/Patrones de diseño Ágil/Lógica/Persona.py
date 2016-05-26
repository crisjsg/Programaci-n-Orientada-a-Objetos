class Persona():
	
	def __init__(self, nombre = "test"):

		self.nombre = str(nombre)

	def setNombre(self, nombre):
		self.nombre = nombre

	def getNombre(self):
		return self.nombre

	