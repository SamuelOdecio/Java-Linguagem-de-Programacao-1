/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1;

/**
 *
 * @author 07076063140
 */
public class Exercicio03 {

    public static void main(String[] args) {
        /*EXERCICIO 3*/

        int tabuada = 1;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i <= 10; i++) {
                System.out.printf("Tabuada: %d x %d = %d", tabuada, i, (tabuada * i));
                System.out.println("\n");
            }
            tabuada++;
            System.out.println("\n\n");

        }
    }
}
