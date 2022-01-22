package br.com.tin.model;

import java.io.Serializable;


public class Fatorial implements Serializable {

    private int fator;
    private int resultado;

    public int getFator() {
        return fator;

    }

    public void setFator(int fator) {
        this.fator = fator;
    }

    public int getResultado() {
        return resultado;

    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
