package Aula04;

public class App {
    public static void main(String[] args) {
        PilhaArray p = new PilhaArray(5);

        p.push(10);
        p.push(20);
        p.push(30);

        System.out.println("Topo (peek): " + p.peek());

        while(p.isEmpty()){
            System.out.println("Pop" + p.pop());
        }
    }
}
