/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        String apellido;
        int calificacion;
       
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese su calificacion: ");
        calificacion = entrada.nextInt();
        
        if (calificacion >= 90) {
            System.out.printf("Usted está aprobado (excelente) con %d\n", calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("Usted está aprobado (muy buena) con %d\n", calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("Usted está aprobado (regular) con %d\n", calificacion);

                } else {
                    System.out.printf("Usted está reprobado con %d\n", calificacion);
                }
            }
        }
    }
}
