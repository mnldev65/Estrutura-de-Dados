/*Crie um programa que armazene as notas de 10 alunos 
recebidas pelo usuário. O programa deve retornar a maior nota 
em tela. */
import java.util.Scanner;
public class MaiorNota{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int quantidade = 10;

        String[] nomes = new String[quantidade];
        double[] notas = new double[quantidade];
        System.out.println("Vamos ver quem tirou a maior nota!");

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("\nDigite seu nome: ", i + 1);
            nomes[i] = ler.nextLine();

            System.out.printf("Insira sua nota: ", i + 1);
            notas[i] = ler.nextDouble();
            ler.nextLine();
        }

        double maiorNota = notas[0];
        String alunoMaior = nomes[0];

        for (int i = 1; i < quantidade; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
                alunoMaior = nomes[i];
            }
        }

        System.out.printf("A maior nota é %.2f e foi obtida por %s.%n", maiorNota, alunoMaior);
    }
}
