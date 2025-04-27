import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++){
            System.out.printf("Digite o %dº número: ", i + 1);
            int numero = scanner.nextInt();

            if (numero > maior){
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
}