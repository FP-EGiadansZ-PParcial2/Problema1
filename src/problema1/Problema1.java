/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a; //declaramos variable
        a=getAnio(); //variable asignada al metodo que pide dato
        calculaBis(a); //metodo para determinar si es bisiesto o no
    }
    public static int getAnio(){ //Pedimos el año por teclado
        int anio;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca el año a verificar");
        anio=teclado.nextInt();
        return anio;
    }
    public static void calculaBis(int anio){ //determinaremos si es bisiesto o no
        int anioCero=0;
        if (anio%100==0){ //para ver si termina en 00
            anioCero=anio;
            if (anioCero%400==0){ //de ser asi tiene que ser divisible /400
                    System.out.println("El año es bisiesto");
            }else System.out.println("El año no es bisiesto");
        
        }else if (anio%100!=0){ //si no termina en 00
            if (anio%4==0){    //solo debe ser divisible entre 4
            System.out.println("El año es bisiesto");           
        }else System.out.println("El año no es bisiesto"); 
                
    } 
    }
}




