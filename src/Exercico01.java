public class Exercico01{
    
    public static void main(String[] args) {
        
        int[] numeros = {5, 5, 5, 5, 5};
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println("A soma dos números é de: " + soma);

    }
}