package questao02;

class ListaDupla {
    private No inicio;
    private No fim;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserirNoInicio(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
    }

    public void inserirNoFinal(int valor) {
        No novo = new No(valor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void inserirNaPosicao(int pos, int valor) {
        if (pos <= 0) {
            inserirNoInicio(valor);
            return;
        }

        No novo = new No(valor);
        No temp = inicio;
        int contador = 0;

        while (temp != null && contador < pos - 1) {
            temp = temp.proximo;
            contador++;
        }

        if (temp == null || temp.proximo == null) {
            inserirNoFinal(valor);
        } else {
            novo.proximo = temp.proximo;
            novo.anterior = temp;
            temp.proximo.anterior = novo;
            temp.proximo = novo;
        }
    }

    public void removerNoInicio() {
        if (inicio == null) return;

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
    }

    public void removerNoFinal() {
        if (fim == null) return;

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
    }

    public void removerNaPosicao(int pos) {
        if (inicio == null) return;

        if (pos == 0) {
            removerNoInicio();
            return;
        }

        No temp = inicio;
        int contador = 0;

        while (temp != null && contador < pos) {
            temp = temp.proximo;
            contador++;
        }

        if (temp == null) return;

        if (temp == fim) {
            removerNoFinal();
        } else {
            temp.anterior.proximo = temp.proximo;
            temp.proximo.anterior = temp.anterior;
        }
    }

    public int tamanho() {
        int cont = 0;
        No temp = inicio;
        while (temp != null) {
            cont++;
            temp = temp.proximo;
        }
        return cont;
    }

    public void exibir() {
        No temp = inicio;
        if (temp == null) {
            System.out.println("Lista vazia!");
            return;
        }
        System.out.print("Lista: ");
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.proximo;
        }
        System.out.println();
    }
}