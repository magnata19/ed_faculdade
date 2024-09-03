package com.estruturadedados;

public class PilhaEstatica {

    public static void main(String[] args) {
        PilhaEstatica pilha = new PilhaEstatica();
        pilha.push(24);
        pilha.push(25);
        pilha.push(26);
        pilha.print();
        pilha.top();
    }

    private int top; //define o topo da pilha
    private int max; //define o tamanho maximo da pilha
    private Object[] tamanho;

    public PilhaEstatica () {
        top = -1;
        max = 30;
        tamanho = new Object[max];
    }

    //metodo que verifica se a pilha esta vazia
    public boolean isEmpty() {
        return top == -1;
    }

    //metodo que verifica se a pilha esta cheia
    public boolean isFull() {
        return max == 30 - 1;
    }

    //metodo que adiciona um elemento a pilha
    public void push(Object x) {
        if(!isFull()) {
            top++;
            tamanho[top] = x;
        } else {
            System.out.println("Pilha Cheia!");
        }
    }

    //metodo para exibir o conteudo da pilha
    public void print() {
        if(!isEmpty()) {
            String message = "";
            for(int i = 0; i <= top; i++) {
                System.out.println("{Obj: "+tamanho[i] + "}");
            }
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    //metodo para retornar o topo da pilha e removê-lo
    public Object pop() {
        if(!isEmpty()) {
            return tamanho[top--];
        } else {
            return null;
        }
    }

    //metodo para retornar o topo da pilha
    public void top() {
        if(!isEmpty()) {
            System.out.println("Top: " + tamanho[top]);
        } else {
            System.out.println("Pilha vazia!");
        }
    }

}
