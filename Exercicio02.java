
package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1;


public class Exercicio02 {

    public static void main(String[] args) {
        /*EXERCICIO 2*/

        int num1 = 9;
        int num2 = 15;
        int num3 = 3;

        if (num1 > num2) {
            System.out.println("Numero 1 é o Maior");
        } else if (num2 > num1 || num2 > num3) {
            System.out.println("Numero 2 é o Maior");
        } else {
            System.out.println("Numero 3 é o Maior");
        }
    }
}
