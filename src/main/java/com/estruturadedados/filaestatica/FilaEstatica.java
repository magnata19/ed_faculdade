package com.estruturadedados.filaestatica;

public class FilaEstatica {
    public static void main(String[] args) {
        FilaEstatica fila = new FilaEstatica();
        System.out.println(fila.isEmpty());
        System.out.println(fila.isFull());
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.print();
        System.out.println(fila.dequeue());
        fila.print();

    }

    private int total;		//Total de Elementos
    private int comeco;	//Comeco da Fila
    private int fim;		//Final da Fila
    private Object memo[];	//Vetor para armazenar os elementos
    private int MAX;		//Tamanho máximo da Fila Estática

    public FilaEstatica () {
        MAX = 15;
        memo = new Object[MAX];
        total = 0;
        comeco = 0;
        fim = 0;
    }

    //verifica se a fila está vazia
    public boolean isEmpty() {
        return total == 0;
    }

    //verifica se a fila esta cheia
    public boolean isFull(){
        return total == MAX;
    }

    //Insere um elemento na fila
    public void enqueue(Object x) {
        if(!isFull()) {
            memo[fim++] = x;
            fim %= MAX;
            total++;
        }
    }

    //remove um elemento da fila
    public Object dequeue() {
        if(!isEmpty()) {
            Object resp;
            resp = memo[comeco++];
            comeco %= MAX;
            return resp;
        }
            return null;
    }

    //metodo que imprime uma fila
    public void print() {
        if(!isEmpty()) {
            String saida = "";
            int cont = comeco;
            for(int i = 0; i < total; i++) {
                saida += memo[cont].toString() + ", ";
                cont++;
                cont %= MAX;
            }
            System.out.println("F:["+saida +"]");
        } else {
            System.out.println("Fila vazia!");
        }
    }
}
