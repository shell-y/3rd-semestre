package school.sptech;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = leitor.nextLine().toLowerCase();

        Integer contador = 0;

        for(int i = 0; i < frase.length(); i++){
            char caractereAtual = frase.charAt(i);
            if ("aeiou".indexOf(caractereAtual) != -1) { //se não encontrar nenhuma vogal ele retorna -1
                contador++;
            }
        }

        System.out.println("A frase possui " + contador + " vogais.");



    }
}
