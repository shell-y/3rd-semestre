package school.sptech;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de N:");
        Integer numero = leitor.nextInt();

        Integer a = 0, b = 1;
        System.out.println("Os " + numero + " primeiros números da sequência de Fibonacci são:");

        for (int i = 0; i < numero; i++) {
            System.out.print(a + " ");
            int varTemporaria = a + b;
            a = b;
            b = varTemporaria;
        }
    }
}
