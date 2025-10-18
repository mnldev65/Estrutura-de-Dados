package questao02;

public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        lista.inserirNoInicio(10);
        lista.inserirNoFinal(20);
        lista.inserirNoFinal(30);
        lista.inserirNaPosicao(1, 15);
        lista.exibir();

        lista.removerNoInicio();
        lista.exibir();

        lista.removerNoFinal();
        lista.exibir();

        lista.removerNaPosicao(0);
        lista.exibir();

        System.out.println("Tamanho da lista: " + lista.tamanho());
    }
}