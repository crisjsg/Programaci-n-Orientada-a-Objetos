from Hora import *

class TarjetaPrepago():
	def __init__(self, numeroTelefono, nif, saldo):
	#Propiedades privadas

		self.numeroTelefono = ""
		self.nif            = ""
		self.saldo          = ""
		self.consumo        = 0
		#self.consumo        = Hora()

	#Propiedades públicas

	#Sets y Gets

	def setNumeroTelefono(self, numeroTelefono):
		self.numeroTelefono = numeroTelefono
	def getNumeroTelefono(self):
		return self.numeroTelefono

	def setNif(self, nif):
		self.nif = nif
	def getNif(self):
		return self.nif

	def setSaldo(self, saldo):
		self.saldo = saldo
	def getSaldo(self):
		return self.saldo
	 #Consumo se refiere al tiempo de llamada
	def setConsumo(self, consumo):
		self.consumo = consumo
	def getConsumo(self):
		return self.consumo

	#Otras Propiedades

	def ingresarSaldo(self, cantidad):
		self.saldo = saldo + cantidad
	def enviarMensaje(self, numeroMensajes):
		self.saldo = (saldo - (numeroMensajes * 9))
	def realizarLlamada(self, segundosHablados):
		self.saldo = (saldo - (15 + 1 * segundosHablados)
		#self.consumo = consumo + segundosHablados
	def consultarTarjeta(self):
		print ("Numero: ", getNumeroTelefono(), "NIF: ", getNumeroTelefono(), "Saldo: ", getSaldo(), "Consumo: ", getConsumo())

#Casos Test
if __name__ == '__main__':
		#Test de comrpobación de recogida datos

		miTelefono = TarjetaPrepago()

		miTelefono.numeroTelefono("971206026")
		miTelefono.nif("43181554C")
		miTelefono.saldo("10")
		miTelefono.consumo(60)

		print (consultarTarjeta())
