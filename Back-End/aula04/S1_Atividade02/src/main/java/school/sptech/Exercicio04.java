package school.sptech;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = leitor.nextLine().toLowerCase();

        boolean palindromo = true;

        for (int i = 0; i < palavra.length() / 2; i++) { //vai até a metade da palavra original
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                //charAt ~> pega um caractere específico (posição i) de uma string.
                /*
                palavra.charAt(i) → pega o caractere da frente
                palavra.charAt(palavra.length() - 1 - i) → pega o caractere correspondente do final
                */
                palindromo = false; // encontrou diferença
                break;
            }
        }

        if (palindromo) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }






    }
}
