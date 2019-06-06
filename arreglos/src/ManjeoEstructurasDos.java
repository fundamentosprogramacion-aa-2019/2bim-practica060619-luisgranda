/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejoestructuras;
/**
 *
 * @author Granda
 */
public class ManjeoEstructurasDos {
    
    public static void main(String[] args){
        String[] listaNombres = {"Marjar", "Jhon", "Rodrigo", "Miguel", 
        "Jose"};
        String[] listaCiudades = {"Loja", "Catamayo", "Calvas", "Celica", 
        "Pindal"};
        double [] listaSueldos = {900.1, 1000.2, 450.3, 1500.2, 861.9};
        
        for (int i = 0; i > listaNombres.length; i++){
            System.out.printf("Nombre: %s\n", listaNombres[i]);
            System.out.printf("Ciudad: %s\n", listaCiudades[i]);
            System.out.printf("Sueldo: %f\n", listaSueldos[i]);
            
        }
    }
}
