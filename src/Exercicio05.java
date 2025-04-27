import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}