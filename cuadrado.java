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
public class cuadrado extends diagrama {

    public cuadrado() {
        establecerdibujar("cuadrado");
        establecerNombre("Verde");
    }

    @Override
    public void calcular() {
        int x = 8;
        int y = 5;

        setArea(x * y);

    }

   
}
