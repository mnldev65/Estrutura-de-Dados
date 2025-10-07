public class FilaArray {
     private int [] dd;
     private int frente;
     private int tamanho;

     public FilaArray (int capacidade){
        if (capacidade <= 0) throw new IllegalArgumentException("capacidade deve ser maior que zero");
        this.dd = new int[capacidade];
        this.frente = 0;
        this.tamanho = 0;
     }

     public void enqueue(int valor){
        if (tamanho == dd.length){
            throw  new IllegalStateException("Fila cheia");
        }
        int indiceFim = (frente + tamanho) % dd.length;
        dd[indiceFim] = valor;
        tamanho ++;
     }

     public int dequeue() {
        if (isEmpty()){
            throw new IllegalStateException("Fila vazia");

        }
        int valor = dd[frente];
        frente = (frente + 1)% dd.length;
        tamanho--;
        return valor;
     }

     public int peek(){
        if (isEmpty()){
            throw new IllegalStateException("Fila vazia");
        }
        return dd[frente];
     }

     public boolean isEmpty() {
        return tamanho == 0;

     }

     public int size() {
        return tamanho;
     }
}
