package org.example;
import java.util.Scanner;


/**
 * The first number in the input indicates how many test cases are to be processed.
 * It is followed by a line for each test case, with two numbers between 1 and 1,000,000.
 * The first one indicates the number of steps and the second one indicates how many steps
 * can be climbed at a time.
 */

public class EjClimb {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of cases: ");

        int cont=0;
        int casos = reader.nextInt();

        while (cont<casos){
            int pasosFinales=0;

            System.out.println("Enter pasos y saltos: ");
            int pasosIniciales = reader.nextInt();
            int saltos = reader.nextInt();

            if (pasosIniciales>=1 && pasosIniciales<=1000000 && saltos>=1 && saltos<=1000000){
                pasosFinales=pasosIniciales/saltos;

                if (pasosIniciales%saltos!=0){
                    pasosFinales++;
                }

                System.out.println(pasosFinales);
                cont++;
            }
            else{
                System.out.println("Error, los numeros deben estar entre 1 y 1,000,000");
            }
        }

        reader.close();
    }
}