package org.example;

/**
 *   java -cp .\target\classes org.example.MainV2 2 32 12
 */

public class BirthdayArgs {
    public static void main(String[] args) {

        if (args.length==0){
            System.out.println("Pon las cosas(números)");
        }
        else{
            // First argument is the number of cases
            int casos = Integer.parseInt(args[0]);
            int cont = 0;

            if (casos != args.length-1){
                System.out.println("Esta mal, hazlo otra vez");
            }
            else {
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
    }
}
