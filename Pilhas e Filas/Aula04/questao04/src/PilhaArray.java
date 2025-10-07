public class PilhaArray {
    private int[] dados;
    private int[] topo;

    public PilhaArray(int capacidade){
        if (capacidade < 0 ) throw new IllegalArgumentException("capacidade deve ser maior que zero");
        this.dados = new int[capacidade];
        this.topo = 0;
    }
    public void push(int valor){
        if (topo == dados.length){
            throw new IllegalStateException("Pilha lotada");
        }
        dados[topo++] = valor;
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha vazia");

        }
        topo--;
        return dados[topo];
    }

    public int peek() {
        if (isEmpty) {
            throw new IllegalStateException("Pilha vazia");

        }
        return dados[topo - 1];

    }

    public boolean isEmpty(){
        return topo == 0;
    }
}
