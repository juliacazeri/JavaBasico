public class Exercicio02 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contadorPares = 0;
        
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }
     
        System.out.println("Quantidade de números pares: " + contadorPares);
    }
}