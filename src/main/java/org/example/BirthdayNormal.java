package org.example;
import java.util.Scanner;


/**
*   Comment
*/

public class BirthdayNormal {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of cases: ");

        int cont=0;
        int casos = reader.nextInt();


        while (cont<casos){
            int numVelas=0;

            System.out.println("Enter a number: ");
            String binario = Integer.toBinaryString(reader.nextInt());

            char[] cadenaVelas=binario.toCharArray();


            for (int i = 0; i < cadenaVelas.length; i++){

                if(cadenaVelas[i] == '1'){
                    numVelas++;
                }

            }

            System.out.println(numVelas);

            cont++;

        }
        
        reader.close();
    }
}