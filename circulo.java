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
public class circulo extends diagrama {

    public circulo() {

        establecerdibujar("circulo");
        establecerNombre("negro");
    }

    @Override
    public void calcular() {

        double pi = 3.14;
        double radio = 3;

        setArea(pi * (radio * radio));

    }
}
