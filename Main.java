import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Questão 1");
            Soma.somar();
            System.out.println();
            System.out.println("Questão 2:");
            //Fibonacci.fibonacci(input);
            System.out.println();
            System.out.println("Questão 3");
            Sequencias.sequenciacoes();
            System.out.println();
            System.out.println("Questão 4:");
            System.out.println("Ligue um dos interruptores e espere um pouco." +
            "\nDesligue e ligue um segundo interruptor. Vá até a sala. A lâmpada desligada e quente corresponde ao primeiro interruptor,"+
            "\nA lâmpada acesa é o segundo e se a lâmpada estiver apagada e fria é o terceiro.\n");
            System.out.println("Questão 5");
            Reverter.strRevertida("romA");

        }catch (Exception e) {
            System.err.println("Error: " + e);        }
        
    }
}

