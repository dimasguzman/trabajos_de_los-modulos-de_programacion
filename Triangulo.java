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
public class Triangulo extends diagrama {

    public Triangulo() {
        establecerdibujar("Triangulo");
        establecerNombre("Rosado");
    }

    @Override
    public void calcular() {
        int a = 15;
        int b = 2;

        setArea((b * a )/2);

    }

}
