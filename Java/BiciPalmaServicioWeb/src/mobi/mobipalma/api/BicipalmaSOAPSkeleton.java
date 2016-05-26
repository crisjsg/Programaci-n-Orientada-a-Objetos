/**
 * BicipalmaSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mobi.mobipalma.api;
import java.util.ArrayList;
import mobi.mobipalma.api.Anclajes;
import mobi.mobipalma.api.Bicicleta;

public class BicipalmaSOAPSkeleton implements mobi.mobipalma.api.Bicipalma_PortType, org.apache.axis.wsdl.Skeleton {
	/**
     * Auto generated method signature
     * 
                                 * @param estadoEstacionRequest 
         * @return estadoEstacionResponse 
     */
    
             public mobi.mobipalma.api.EstadoEstacionResponse estadoEstacion
              (
              mobi.mobipalma.api.EstadoEstacionRequest estadoEstacionRequest
              )
        {
            
                 //TODO : fill this with the necessary business logic
                 // throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#estadoEstacion");
                 	 
                 	 
                 	 
                 	 ArrayList<Estacion> estaciones = new ArrayList<>();
                 	                     	 
                 	 Estacion estacion01 = new Estacion();
                 	 estacion01.setId("1");
                 	 estacion01.setDireccion("Manacor 50");
                 	 estacion01.setNumeroAnclajes(5);
                 	 estaciones.add(estacion01);
                 	 
                 	 Estacion estacion02 = new Estacion();
                 	 estacion02.setId("2");
                	 estacion02.setDireccion("Jacint Verdaguer");
                	 estacion02.setNumeroAnclajes(10);
                	 estaciones.add(estacion02);         	 
                 	 
                 	 Estacion estacion03 = new Estacion();
                 	 estacion03.setId("3");
                 	 estacion03.setDireccion("Plaza España");
               	     estacion03.setNumeroAnclajes(20);
               	     estaciones.add(estacion03);
                 	 
                 	 // Anclajes es un array de objetos bicicleta
                 	 
                 	 // El objeto bicicleta contiene una propiedad de clase String
                 	 
                 	 String[] bicicletas = {"250", "null", "270", "null", "290"};   
                 	 
                 	 for(Estacion estacion: estaciones ){
                 		 	 Anclajes anclaje = new Anclajes();
	                     	 for( String bicicleta: bicicletas ){
	                     		 Bicicleta bici = new Bicicleta();
	                     		 bici.setBicicleta(bicicleta);
	                     		 anclaje.addBicicleta(bici);              		 
	                     	 }
	                     	 estacion.setAnclajes(anclaje);
                 	 }
                 	 
                 	 EstadoEstacionResponse respuesta = new EstadoEstacionResponse();
                 	 
                 	 String idEstacion = estadoEstacionRequest.getIdEstacion();
                 	 
                 	 for(int i = 0; i < estaciones.size(); i++){
                 		 if( idEstacion.contentEquals( estaciones.get(i).getId() ) ){
                 			respuesta.setEstacion(estaciones.get(i));
                 			break;
                 		 }                   		 
                 	 }
                 	 
                 	 return respuesta;
    }
 
}