import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do saque: ");
        int valor = scanner.nextInt();
        
        int[] notas = {100, 50, 20, 10, 5, 2, 1}; 
        int quantidade;

        System.out.println("\nSaída Esperada:");
        for (int nota : notas){
            quantidade = valor / nota; 
            if (quantidade > 0){ 
                System.out.println("Notas de " + nota + ": " + quantidade);
                valor %= nota; 
        }
        scanner.close();
        }
    }
}