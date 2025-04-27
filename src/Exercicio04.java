import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        
        double media = soma / notas.length;
        String situacao = media >= 7.0 ? "Aprovado" : "Reprovado";
        
        System.out.printf("\nMédia: %.2f\n", media);
        System.out.println("Situação: " + situacao);
        
        scanner.close();
    }
}