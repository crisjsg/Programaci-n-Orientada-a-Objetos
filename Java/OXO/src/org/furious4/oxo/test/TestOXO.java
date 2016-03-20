package org.furious4.oxo.test;

import static org.junit.Assert.*;

import org.furious4.oxo.logica.OXO;
import org.furious4.oxo.logica.OXO.*;
import org.junit.Test;
import org.junit.BeforeClass;


public class TestOXO {
	
	Fichas tablero[][] = new Fichas[3][3];
	
	@BeforeClass
	/*public static void setUpBeforeClass(){
		Fichas tablero[][] = new Fichas[3][3];
	}*/
	
	
	@Test
	public static void DadaUnaFichaCuandoFichaFueraDeFilaEntoncesDevuelvoFalse(){
		assertFalse(OXO.ponerFicha(4, 1));
		assertFalse(OXO.ponerFicha(1, 4));
	}

	
	@Test
	public void DadoUnTableroCuandoLoIncicializoEntoncesTodosLosValoresSonNull(){
		OXO.inicializarTablero(this.tablero);
		for(int i = 0; i < this.tablero.length; i++){
			for(int j = 0; j < this.tablero.length; j++){
				assertNull(this.tablero[i][j]);
			}
		}
	}

}	
