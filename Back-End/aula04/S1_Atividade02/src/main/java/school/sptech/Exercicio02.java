package school.sptech;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        Integer numero = leitor.nextInt();

        Integer soma = 0;

        while(numero > 0){
            soma += numero % 10; //pegar o resto da divisão por 10, que é o último dígito
            numero /= 10; //retira o último digito
        }

        System.out.println("A soma dos dígitos é " + soma);
    }
}
