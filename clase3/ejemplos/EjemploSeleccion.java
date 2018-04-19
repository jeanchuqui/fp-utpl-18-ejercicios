/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
    Crear un programa que permita ingresar una calificacion por teclado
    Si la calificacion ingrsada es mayor o igual a 5 y la calificacion es menor
    A 10, se debe presentar un mensaje que diga usted esta en supletorio
    De lo contrario se presenta un mensaje con el valor de la calificacion dividido
    Para dos.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploSeleccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        String apellido;
        double calification;
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su calificacion: ");
        calification = entrada.nextDouble();
        //python se usa "and"
        if (calification >= 5 && calification < 10) {
            System.out.println("Usted esta en supletorio");
        } else {
            //System.out.printf("%d", calification/2);
            double resultado = calification / 2;
            System.out.printf("%f", resultado);
        }
    }
}
