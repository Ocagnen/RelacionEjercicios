/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrefuerzo;

/**
 *
 * @author Javier
 */
public class Actividad03 {

    public static void main(String[] args) {
        
        int[][] numeros = new int[3][3];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("");
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]+"\t");
            }
        }
    }

}
