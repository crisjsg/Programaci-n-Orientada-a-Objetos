

class TablaAsignacion():

  def __init__(self):
    self.tablaLetraDNI = ['T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E']

  def getLetra(self, modulo):
    return self.tablaLetraDNI[modulo]

  def mostrarTabla(self):
    return self.tablaLetraDNI

  def getPosicion(self, letra):
    return self.tablaLetraDNI.index(letra)

​

class DNI ():
  def __init__ (self, dni = '00000000T'):
    self.tablaAsignacionLetra = TablaAsignacion()
    self.dni = dni
    self.numerosDni = int(dni[ :8])
    self.letraDni = dni[8:]
    self.sano = False

  def getModulo(self):
    modulo = self.numerosDni % len(self.tablaAsignacionLetra.tablaLetraDNI)
    return modulo

​

​

​

if __name__ == '__main__':

# ////////////////////////////////////////test obtener posicionLetra//////////////////////////////////////////

testTabla=(['T',0],['R',1],['W',2])
listaLetras = TablaLetraDNI()
def checkGetPosicionLetra(self, testTabla):
  for test in testTabla:
    if self.getPosicionLetra(test[0])==test[1]:
      print('OK')
    else:
      return ('ERROR')

#/////////////////////////////////////////test obtener modulo/////////////////////////////////////////////////

dni = DNI('43228543c')

if dni.getModulo() == 43228543%23:
  print('OK')
else:
  print('Fail!')

​

#//////////////////////////////////////////test obtener letra//////////////////////////////////////////////////
ricardoDNI = DNI(43228543)
listaLetras = TablaLetraDNI()

if listaLetras.getLetra(ricardoDNI.getModulo())== 'C':
  print('ok')
else:
  print('fail!')

