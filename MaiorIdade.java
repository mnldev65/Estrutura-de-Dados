/*Criar um vetor com 10 idades e exibir em tela as idades maiores 
que 18 anos*/
import java.util.Scanner;
public class MaiorIdade{
    public static void main(String[] args) {
        Scanner analise = new Scanner(System.in);
        final int quantidade = 5;
        String[] nomes = new String[quantidade];
        int[] idades = new int[quantidade];

        System.out.println("Vamos exibir somente quem é maior de idade!");
        for (int i = 0; i < idades.length; i++) {
            System.out.printf("Digite seu nome: ", i + 1);
            nomes[i] = analise.nextLine();

            System.out.printf("Digite sua idade: ", i + 1);
            idades[i] = analise.nextInt();
            analise.nextLine();
        }

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 18) {
                System.out.printf("%s  %d anos\n", nomes[i], idades[i]);
            }
        }
    }
}