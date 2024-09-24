package org.example;


/**
 * The first number in the input indicates how many test cases are to be processed.
 * It is followed by a line for each test case, with two numbers between 1 and 1,000,000.
 * The first one indicates the number of steps and the second one indicates how many steps
 * can be climbed at a time.
 */

public class EjClimbArgs {
    public static void main(String[] args) {

        if (args.length==0){
            System.out.println("Pon argumentos");
        }
        else{
            int cont=0;
            int nextArg=0;
            int casos = Integer.parseInt(args[0]);

            while (cont < casos && nextArg+1 < args.length){
                int pasosFinales=0;

                int pasosIniciales = Integer.parseInt(args[nextArg+1]);
                int saltos = Integer.parseInt(args[nextArg+2]);

                if (pasosIniciales>=1 && pasosIniciales<=1000000 && saltos>=1 && saltos<=1000000){
                    pasosFinales=pasosIniciales/saltos;

                    if (pasosIniciales%saltos!=0){
                        pasosFinales++;
                    }

                    System.out.println(pasosFinales);
                    cont++;
                    nextArg+=2;
                }
                else{
                    System.out.println("Error, los numeros deben estar entre 1 y 1,000,000");
                    break;
                }
            }
        }
    }
}