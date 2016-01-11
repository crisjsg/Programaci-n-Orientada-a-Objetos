# Importaciones de otros programas #
#from dni import *#

# Clases #
class CuentaCorriente ():
    #def __init__(self):
    def __init__(self, nombre = "Eustaquio", apellidos = "apellido", direccion = "calle", telefono = "971000000", nif = "00000000T", saldo = "0€"):
    	self.nombre    = nombre
    	self.apellidos = apellidos
    	self.direccion = direccion
    	self.telefono  = telefono
    	self.nif       = nif
    	self.saldo     = saldo

		#Propiedades públicas de la Cuenta Corriente #

		#Sets y Gets de las Propiedades privadas#
    def setNombre (self, nombre):
        self.nombre = nombre
    def getNombre (self):
        return self.nombre

    def setApellidos (self, apellidos):
        self.apellidos = apellidos
    def getApellidos (self):
        return self.apellidos

    def setDireccion (self, direccion):
        self.direccion = direccion
    def getDireccion (self):
        return self.direccion

    def setTelefono (self, telefono):
        self.telefono = telefono
    def getTelefono (self):
        return self.telefono

    def setNif (self, nif):
        self.nif = nif
    def getNif (self):
        return self.nif

    def setSaldo(self, saldo):
        self.saldo = saldo
    def getSaldo(self):
        return self.saldo

	#Métodos para manejar el dinero#

    def retirarDinero(self, retirar):
        self.setSaldo( self.getSaldo() - retirar )
    def ingresarDinero(self, ingresar):
        self.setSaldo (self.getSaldo() + ingresar )
        
	#Metodos para consultar la Cuenta#

    def consultarCuenta(self):
        print ("Nombre: ", self.getNombre())
        print ("Apellido: ", self.getApellidos())
        print ("Dirección: ", self.getDireccion())
        print ("Telefono: ", self.getTelefono())
        print ("Nif: ", self.getNif())
        print ("Saldo: ", self.getSaldo(), "€")

    def saldoNegativo(self):
        if self.getSaldo() < 0:
            return "La cuenta está en números rojos."
        else:
            return "La cuenta no está en números rojos."

#Casos Test#

if __name__ == '__main__':
        
        cuenta = CuentaCorriente()
        
        cuenta.setNombre("Cristian")
        cuenta.setApellidos("Sanchez")
        cuenta.setDireccion("Pepe")
        cuenta.setTelefono("902202122")
        cuenta.setNif("43181554C")
        cuenta.setSaldo(1000)

        #print ("Nombre:", cuenta.getNombre())
        print (cuenta.consultarCuenta())

        
        """testInforPersonal = [(cuenta.getNombre(),'Crisian'),
                        (cuenta.getApellidos(),'Sanchez'),
                        (cuenta.getDireccion(),'Pepe'),
                        (cuenta.getNif(),'43181554C'),
                        (cuenta.getTelefono(),'902202122')]

        for caso in testInforPersonal:
            if testInforPersonal[0][0] == testInforPersonal[0][1]:
                print(caso, 'OK')
            else:
                print(caso, 'FAIL')"""
        

    #test numeros rojos
    
        cuenta.setSaldo(-10)
        print (cuenta.saldoNegativo())
        cuenta.setSaldo(10)
        print (cuenta.saldoNegativo())

    #test manejo de dinero

        cuenta.setSaldo(510)
        cuenta.retirarDinero(500)
        if cuenta.getSaldo() == 10:
            print (cuenta.getSaldo(), "OK")
        else:
            print ("FAIL")
        cuenta.setSaldo(0)
        cuenta.ingresarDinero(20)
        if cuenta.getSaldo() == 20:
            print (cuenta.getSaldo(), "OK")
        else:
            print ("FAIL")

