/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo02;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingerese su nombre: ");
        String nombre = entrada.nextLine();
        
         Scanner entrada2 = new Scanner (System.in);
        System.out.println("Ingerese su apellido: ");
        String apellido = entrada2.nextLine();
        
         Scanner entrada3 = new Scanner (System.in);
        System.out.println("Ingerese su ciudad de nacimiento: ");
        String ciudad = entrada3.nextLine();
        
         Scanner entrada4 = new Scanner (System.in);
        System.out.println("Ingerese su país de origen: ");
        String pais = entrada4.nextLine();
        
         Scanner entrada5 = new Scanner (System.in);
        System.out.println("Ingerese su año de nacimiento: ");
        String año = entrada5.nextLine();
        
        System.out.printf("Datos del usuario:\n%s\n%s\n%s\n%s\n%s\n", 
                nombre,
                apellido,
                ciudad,
                pais,
                año); 
               
    }
  
}
