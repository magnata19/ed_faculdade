package com.estruturadedados.pilhadinamica;

public class No {

    private Object dado;
    private No prox;

    public Object getDado() {
        return dado;
    }

    public void setDado(Object dado) {
        this.dado = dado;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "Nó atual -> " + dado + ", proximo Nó -> " + prox;
    }

}
