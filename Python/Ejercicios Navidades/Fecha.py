class Fecha():
        #Propiedades privadas

	def __init__(self, dia = "1", mes = "1", ano = "1900"): #Si pongo la "ñ" no se ve en naranja.
		self.dia = int(dia)
		self.mes = int(mes)
		self.ano = int(ano)
		self.nombreMes = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]

        #Propiedades públicas
                def setDia(self, dia):
                        if self.dia in range (1, 32):
                                self.dia = int(dia)
                        else:
                                self.dia = 1
            #print ("Has introducido un dia que no esta entre 01 y 31")   

	def getDia(self):
		return self.dia

	def setMes(self, mes):
		if self.mes in range (1, 13):
			self.mes = int(mes)
        else:
        	self.mes = 1
            #print ("Has introducido un mes que no esta entre 01 y 12")
	def getMes(self):
		return self.mes

	def setAno(self, ano):
		if self.ano in range (1900, 3001):
			self.ano = int(ano)
        else:
        	self.ano = 1900
            #print ("Has introducido un año mayor a 1900 ")

	def getAno(self):
		return self.ano

	def mesLetra(self, mes):
		return self.nombreMes[mes - 1]

	def imprimirFecha(self, dia, mes, ano):
		return self.getAno(), "-", self.mesLetra(self.getMes), "-", self.getDia

	def getFecha(self):
		print (self.getAno(), self.getMes(), self.getDia())

	def incrementarFecha(self, sumarDia = "0", sumarMes = "0", sumarAno = "0"):
		self.setDia = self.getDia + sumarDia
		self.setMes = self.getMes + sumarMes
		self.setAno = self.getAno + sumarAno

#Casos test

if __name__ == '__main__':
	
	fechaNacimiento = Fecha()
	fechaNacimiento.setAno(1995)
	fechaNacimiento.setMes(14)
	fechaNacimiento.setDia(3)
	fechaNacimiento.getFecha()
		
