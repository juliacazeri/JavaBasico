import java.util.Scanner;

public class Exercicio08 {
    public static int contarVogais(String palavra) {
        int contador = 0;
        palavra = palavra.toLowerCase(); 
        
        for (char letra : palavra.toCharArray()) {
            if ("aeiou".indexOf(letra) != -1) { 
                contador++;
            }
        }
        
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        int quantidadeVogais = contarVogais(palavra);
        System.out.println("A palavra contém " + quantidadeVogais + " vogais.");
        
        scanner.close();
    }
    
}