package org.example;

/**
 *   Comment
 */

public class MainV2 {
    public static void main(String[] args) {

        // First argument is the number of cases
        int casos = Integer.parseInt(args[0]);
        int cont = 0;


        while (cont < casos) {
            int numVelas = 0;

            // Each subsequent argument corresponds to the numbers for each case
            String binario = Integer.toBinaryString(Integer.parseInt(args[cont + 1]));

            char[] cadenaVelas = binario.toCharArray();

            for (int i = 0; i < cadenaVelas.length; i++) {
                if (cadenaVelas[i] == '1') {
                    numVelas++;
                }
            }

            System.out.println(numVelas);

            cont++;
        }
    }
}
