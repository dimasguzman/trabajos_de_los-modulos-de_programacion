/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formas;

import helpers.Triangulo;
import helpers.cuadrado;
import helpers.linea;
import helpers.circulo;

/**
 *
 * @author Dimas
 */
public class formas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo cl = new Triangulo();
        Cuadrado cd=new Cuadrado();
        Linea ln=new Linea();
        Circulo cr=new Circulo();

        System.out.println();
        cl.calcular();
        cl.imprimir();
        cl.getArea();
        System.out.println();
        cd.calcular();
        cd.imprimir();
        cd.getArea();
        System.out.println();
        ln.calcular();
        ln.imprimir();
        System.out.println();
        cr.calcular();
        cr.imprimir();
        cr.getArea();
    }

}
