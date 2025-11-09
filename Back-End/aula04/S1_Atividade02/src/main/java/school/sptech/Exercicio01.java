package school.sptech;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        Integer nroPrimo = leitor.nextInt();

        Integer testarPrimos = 0;

        for(int i=1; i <= nroPrimo; i++){
            if(nroPrimo % i == 0){
                testarPrimos++;
            }
        }
        if (testarPrimos != 2) {
            System.out.println("O número não é primo.");
        }else{
            System.out.println("O número é primo.");
        }


    }

}
