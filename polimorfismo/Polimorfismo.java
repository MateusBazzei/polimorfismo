/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


/**
 *
 * @author mateus.bazzei
 */
public class Polimorfismo {
    
    public static void main(String[] args) {
        
        /*
        //polimorfismo de sobrecarga
        calculadora calc = new calculadora();
        System.out.println(calc.somar(2, 3, 4));
        */
        
        gato gato = new gato();
        cachorro cachorro = new cachorro();
        pato pato = new pato();
        
        gato.comunicar();
        cachorro.comunicar();
        pato.comunicar();
    }
    
}
