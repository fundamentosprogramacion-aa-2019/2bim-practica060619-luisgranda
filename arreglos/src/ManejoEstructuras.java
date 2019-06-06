
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Granda
 */
public class ManejoEstructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int [] valores = new int [4];
        valores [3] = 10;
        System.out.print(valores [3]);
        //valores [4] = 25;
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
        for (int i = 0; i < valores.length; i++){
            System.out.printf("Ingrese el vaor para la posicion: %d :",
                    i);
            valores[i] = entrada.nextInt();
        }
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
    }
}
