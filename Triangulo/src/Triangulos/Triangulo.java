/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulos;

/**
 *
 * @author Junior Mendes
 */
public class Triangulo {
    public String Classificar(double a, double b, double c){
        if((a == b) && (b == c) && (c == a)){
           return "O Triangulo é equilátero";
        }else if((a == b) && (c != a)){
            return "O Triangulo é isósceles";
        }else if((a != b) && (c != a)){
            if((a<b+c) || (b<a+c) || (c<a+b)){
               return "O Triangulo é escaleno";
            }
        }
        return "Não forma um triangulo";
    }
}
