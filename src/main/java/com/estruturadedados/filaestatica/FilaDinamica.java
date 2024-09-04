package com.estruturadedados.filaestatica;

public class FilaDinamica {

    public static void main(String[] args) {
        FilaDinamica fila = new FilaDinamica();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.print();
        fila.dequeue();
        fila.print();
    }

    private No comeco;
    private No fim;
    private int total;

    public FilaDinamica() {
        this.comeco = null;
        this.fim = null;
        this.total = 0;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    //metodo para adicionar um elemento a fila
    public void enqueue(Object x) {
        No novo = new No();
        novo.setDado(x);
        novo.setProx(null);
        if(isEmpty()) {
            comeco = novo;
            fim = comeco;
        } else {
            fim.setProx(novo);
            fim = novo;
        }
        total++;
    }

    public Object dequeue () {
        Object resp = null;
        if(!isEmpty()) {
            resp = comeco.getDado();
            comeco = comeco.getProx();
            total--;
            return resp;
        }
        return resp;
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            No aux;
            String saida = "";
            aux = comeco;
            while (aux != null) {
                saida += aux.getDado().toString() + ", ";
                aux = aux.getProx();
            }
            System.out.println("F: ["+saida+"]");
        }
    }
}
