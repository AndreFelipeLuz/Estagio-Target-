public class Sequencias {

    public static void sequenciacoes(){
        
        primeiraSequencia(1,1);
        System.out.println();
        segundaSequencia(2, 1, 2);
        System.out.println();
        terceiraSequencia(0, 1);
        System.out.println();
        quartaSequencia(4, 1, 12);
        System.out.println();
        quintaSequencia(6, 1);
        System.out.println();
        sextaSequencia();
    }

    private static void primeiraSequencia(int soma,int sequencia){
        System.out.println("Letra A");
        System.out.println("O primeiro numero da sequencia é: " + soma);
        while (sequencia < 5) {
            soma = soma+2;

            sequencia++;
            System.out.println("O "+sequencia + "° numero da sequencia é " + soma);
        }
    }

    private static void segundaSequencia(int soma,int sequencia,int numero){
        System.out.println("Letra B");
        System.out.println("O primeiro numero da sequencia é: " + soma);
        while (sequencia < 7) {
            soma = soma*numero;

            sequencia++;
            System.out.println("O "+sequencia + "° numero da sequencia é " + soma);
            }
        }

    private static void terceiraSequencia(int soma,int sequencia) {
        System.out.println("Letra C");
        System.out.println("O primeiro numero da sequencia é: " + 0);
        while (sequencia < 8) {
            soma = sequencia*sequencia;

            sequencia++;
            System.out.println("O "+sequencia + "° numero da sequencia é " + soma);
        }
    }    

    private static void quartaSequencia(int soma,int sequencia,int numero){
        System.out.println("Letra D");
        soma = 4;
        numero = 12;
        sequencia = 1;
        System.out.println("O primeiro numero da sequencia é: " + soma);
        while (sequencia < 5) {
            System.out.println("Letra D");

            soma = numero+ soma;
            numero = numero+8;

            sequencia++;
            System.out.println("O "+sequencia + "° numero da sequencia é " + soma);
        }
    }

    private static void quintaSequencia(int numero,int sequencia){
        int anterior = 0;
        int atual = 1;
        int proximo = 0;
        System.out.println("Letra E");

        System.out.println("O Primeiro numero da sequencia é " + atual);
        while (sequencia <= numero) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            sequencia ++;
            System.out.println("O "+sequencia + "° numero da sequencia é " + atual);
        }
    }

    private static void sextaSequencia(){
        
        System.out.println("O Primeiro numero da sequencia é 2");
        System.out.println("O 2° numero da sequencia é 10");
        System.out.println("O 3° numero da sequencia é 12");
        System.out.println("O 4° numero da sequencia é 16");
        System.out.println("O 5° numero da sequencia é 17");
        System.out.println("O 6° numero da sequencia é 18");
        System.out.println("O 7° numero da sequencia é 19");
        System.out.println("O 8° numero da sequencia é 200");

        System.out.println("Explicação: Todos começão com a letra D");
    }
}





