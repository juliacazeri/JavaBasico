import java.util.Random;
import java.util.Scanner;


public class Exercicio10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Escolha (par ou ímpar): ");
        String escolha = scanner.next().toLowerCase();

        System.out.print("Digite um número: ");
        int numeroUsuario = scanner.nextInt();

        int numeroComputador = random.nextInt(10) + 1;
        System.out.println("\nComputador escolheu: " + numeroComputador);

        int soma = numeroUsuario + numeroComputador;
        boolean ehPar = soma % 2 == 0;

        System.out.println("Soma: " + soma + " -> " + (ehPar ? "Par" : "Ímpar"));

        if ((escolha.equals("par") && ehPar) || (escolha.equals("ímpar") && !ehPar)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }

        scanner.close();
    }
 }