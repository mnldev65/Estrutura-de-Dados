public class App {
    public static void main(String[] args) throws Exception {
        FilaArray fila = new FilaArray(5);

        fila.enqueue(50);
        fila.enqueue(60);
        fila.enqueue(70);

        System.out.println("Primeiro (peek): " + fila.peek());

        while (fila.isEmpty()){
            System.out.println("Dequeue: " + fila.dequeue());
        }
    }
}
