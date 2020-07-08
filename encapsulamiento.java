package com.mycompany.encapsulamient;

import helpers.ciudadano;

/**
 *
 * @author Dimas
 */
public class encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ciudadano ciudadano = new Ciudadano( "años experiencia dos" );
    
        ciudadano.getnombre("Dimas Guzman");
         System.out.println(ciudadano.getnombre);
                
        ciudadano.imprimirañosexperiencia();
        
        ciudadano.setedad(21);
        
        System.out.println(ciudadano.setedad);
        
        
        
    }
  
    
}
