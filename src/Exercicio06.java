public class Exercicio06 {

    public static void exibirTabuada(int numero) {

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        exibirTabuada(9); 
    }
}