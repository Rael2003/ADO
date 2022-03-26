/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ados;

/**
 *
 * @author rael.spaixao1
 */
public class Ado03 {
    public static void main(String[] args){
        
    }
    
    public static void Loja(float Valor){
        if(Valor < 300.00){
            System.out.println("Desconto de 15% = " + Valor * 0.15);
            Valor = (float) (Valor * 0.85);
        }else{
            System.out.println("Desconto de 20% = " + Valor * 0.2);
            Valor = (float) (Valor * 0.8);
        }
        
        System.out.println("Valor total = " + Valor );
    }
    
    public static void Triangulo(float Valor1,float Valor2,float Valor3){
        if(Valor1 == 0 || Valor2 == 0 || Valor3 == 0){
            return;
        }
        
        if(Valor1 == Valor2 && Valor1 == Valor3){
            System.out.println("Triangulo equilatero");
        }else if(Valor1 == Valor2 || Valor1 == Valor3 || Valor2 == Valor3){
            System.out.println("Triangulo isóceles");
        }else{
            System.out.println("Triangulo escaleno");
        }
    }
    
    public static void Ano(int ano){
        if(ano < 1000 || ano > 9999){
            return;
        }else if(ano % 400 == 0){
            System.out.println("É um ano bissexto");
        }else{
            System.out.println("Não é");
        }
    }

}
