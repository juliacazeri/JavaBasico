import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroSecreto = 32; 
        int palpite;

        while (true){
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite > numeroSecreto){
                System.out.println("Muito alto!");
            } else if (palpite < numeroSecreto){
                System.out.println("Muito baixo!");
            } else{
                System.out.println("Acertou!");
                break;
            }
        }

        scanner.close();
    }
}