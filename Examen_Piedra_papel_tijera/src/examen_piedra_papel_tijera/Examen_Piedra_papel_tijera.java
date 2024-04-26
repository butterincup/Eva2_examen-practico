/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_piedra_papel_tijera;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen_Piedra_papel_tijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc=new Scanner (System.in);
        System.out.println("Juego de piedra papel o tijera");
        
       int alto, eleccion, compu; 
       int piedra=1,papel=2,tijera=3;
       String elec, com;
       
        do{
        System.out.print("ingrece 7 para detener de lo contrario seleccione otro numeo");
            System.out.println("");
        alto=sc.nextInt(); 
        
        System.out.println("Elija 1= piedra, 2= papel, 3 = tijera"); 
        eleccion=sc.nextInt();
        if ((0<eleccion) &&(eleccion<4)){
       
            if ((0<=Math.random())&&(Math.random()<0.4)){
                compu= 1;
                
                        System.out.println("La computqadora elijio piedra");
            if ((0.4<=Math.random())&&(Math.random()<0.7))
                compu= 2;
                                    System.out.println("La computqadora elijio papel");

            } else
                compu=3;
                                    System.out.println("La computqadora elijio tijeras");

            
                
            if ((eleccion==1)&&(compu==3))
                System.out.println("Ganaste");
            else if ((eleccion==2)&&(compu==1))
                System.out.println("Ganaste");
            else if ((eleccion==3)&&(compu==2))
                System.out.println("Ganaste");
                
            else if ((eleccion==2)&&(compu==3))
                System.out.println("perdiste");
            else if ((eleccion==1)&&(compu==2))
                System.out.println("perdiste");
            else if ((eleccion==3)&&(compu==1))
                System.out.println("perdiste");
                 else
            System.out.println("empate");
            }
        
        
            else
                System.out.println("ingrece un numero valido ");
        
                        
                    
                
    }while(alto!=7);
        System.out.println("Gracis por jugar");
            }

            }