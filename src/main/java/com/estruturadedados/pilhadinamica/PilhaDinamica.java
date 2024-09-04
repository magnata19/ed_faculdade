package com.estruturadedados.pilhadinamica;

public class PilhaDinamica {

    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.print();
        System.out.println(pilha.top());
        pilha.pop();
        System.out.println(pilha.isEmpty());
    }

    private No topo;

    //Construtor para iniciar a Pilha no estado vazia (sem nós, portanto, nula)
    public PilhaDinamica() {
        this.topo = null;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void push(Object x) {
        No novo = new No();
        novo.setDado(x);
        novo.setProx(topo);
        topo = novo;
    }

    public Object top () {
        if (!isEmpty()) {
            return topo.getDado();
        }
        return null;
    }

    public Object pop() {
        if (!isEmpty()) {
            Object topoAtual = topo.getDado();//Captura quem está no topo
            topo = topo.getProx();//O topo será o próximo
            return topoAtual;//Retorna a resposta
        }
        return null;
    }

    public void print() {
        if(!isEmpty()) {
            String resp = " ";
            No aux;
            aux = topo;
            while (aux != null) {
                resp = aux.getDado() + ", " + resp;
                aux = aux.getProx();
            }
            System.out.println("P:[" + resp + "]");
        } else {
            System.out.println("Pilha vazia!");
        }
    }
}
