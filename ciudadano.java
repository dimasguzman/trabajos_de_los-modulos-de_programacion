/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Dimas
 */
public class ciudadano {
    
    
    public String nombre;
    private String añosexperiencia;
    private int edad;
    
    public void getnombre(String nombre){
        this.nombre=nombre;
    }
    
    
    public ciudadano( String añosexperiencia ){
        this.añosexperiencia=añosexperiencia;
       }
    
    
    public void imprimirañosexperiencia(){
        System.out.println(añosexperiencia );
    }
    
    public void setedad(int edad){
        this.edad=edad;
        
    }
    public int edad(){
        return edad;
    }
}