/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstraccion;

import helpers.Costa_Rica;
import helpers.El_Salvador;
import helpers.Estados_Unidos;
import helpers.Honduras;

/**
 *
 * @author Dimas
 */
public class abstracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Costa_Rica ic = new Costa_Rica();
        El_Salvador ip = new El_Salvador();
        Estados_Unidos id = new Estados_Unidos();
        Honduras ia = new Honduras();
        
        
System.out.println( ic.getpaises());
System.out.println( ip.getpaises());
System.out.println( id.getpaises());
System.out.println( ia.getpaises());


    }

}
