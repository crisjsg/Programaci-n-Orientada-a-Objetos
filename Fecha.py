class Fecha():
	#Propiedades privadas

	def __init__(self, dia = "01", mes = "01", ano = "1900"): #Si pongo la "ñ" no se ve en naranja.
		self.dia = int(dia)
		self.mes = int(mes)
		self.ano = int(ano)
		self.nombreMes = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]

	#Propiedades públicas
	def setDia(self, dia):
		if self.dia range in (01, 32)
			self.dia = int(dia)
		else:
			print ("Has introducido un dia que no esta entre 01 y 31") 
	def getDia(self):
		return self.dia

	def setMes(self, mes):
		if self.mes range in (01, 13)
			self.mes = int(mes)
		else:
			print ("Has introducido un mes que no esta entre 01 y 12")
	def getMes(self):
		return self.mes

	def setAno(self, ano):
		if self.ano range in (1900, 3001)
			self.ano = int(ano)
		else:
			print ("Has introducido un año mayor a 1900 ")

	def getAno(self):
		return self.ano

	def mesLetra(self, mes):
		return self.nombreMes[mes - 1]

	def imprimirFecha(self, dia, mes, ano):
		return self.ano, "-", self.mesLetra(mes), "-", self.dia

	def getFecha(self, dia, mes, ano):
		return self.ano, self.mes, self.dia

	def incrementarFecha(self, sumarDia = "0", sumarMes = "0", sumarAno = "0"):
		self.dia = dia + sumarDia
		self.mes = mes + sumarMes
		self.ano = ano + sumarAno
		