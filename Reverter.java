public class Reverter {
    public static void strRevertida(String str){
        String revertido="";
        int numero = str.length();
        int contador = 0;

        while (contador < numero) {
            revertido = revertido+str.charAt(numero-contador-1);
            contador++;
        }
        System.out.println("A palavra: " + str);
        System.out.println("Revertida fica como: " + revertido);
    }
}
