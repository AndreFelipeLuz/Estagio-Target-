import java.util.Scanner;


public class Fibonacci {

    public static void fibonacci(Scanner input){

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        if (numero == 0 || numero == 1) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            int anterior = 0;
            int atual = 1;
            int proximo = 0;
            int efibo = 0;

            while (proximo <= numero) {
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
                if (proximo == numero) {
                    efibo = 1;
                } 
            }
            if(efibo == 1){
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            }else{
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }
        }
    }
}