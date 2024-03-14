package com.mycompany.intervalo1020;

import java.util.Scanner;

public class Intervalo1020 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantos setores quer conhecer:");
        int x = teclado.nextInt();
        System.out.println("setor?"); 
        
        for (int i=1; i<=x; i++) {
               
            int y = teclado.nextInt();
        
            if (y >= 10 && y <=20){
                System.out.println("dentro do setor " + y);
           
            } else {
                System.out.println("fora do setor " + y);
                }
                                    
            }
        }
    }
   

    
