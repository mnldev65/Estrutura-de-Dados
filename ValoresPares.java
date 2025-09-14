/*Crie um programa com um vetor de 10 elementos inteiros. Exibir 
em tela os valores pares*/
import java.util.Scanner;
public class ValoresPares{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int quantidade = 10;
        System.out.println("Vamos retorna somentes os valores pares!");
        int[] valores = new int[quantidade];
        
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Insira um valor inteiro: ", i + 1);
            valores[i] = ler.nextInt();
        }
        System.out.println("\nValores pares digitados: ");
        for (int i = 0; i < quantidade; i++) {
            if (valores[i] % 2 == 0) {
                System.out.printf("%d ", valores[i]);
            }
        }
    }
}