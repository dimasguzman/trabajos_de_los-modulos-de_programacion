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
public class diagrama {

    private String nombre;
    private double Area;
    private String forma;

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerdibujar(String forma) {
        this.forma = forma;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public void calcular() {

    }

    public void dibujar() {

    }

    public void imprimir() {

        System.out.println("forma:" + forma);
        System.out.println("color de la firgura: " + nombre);
        System.out.println("area:" + Area);

    }

}
