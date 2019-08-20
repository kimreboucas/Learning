package com.example.learning;

public class Operacoes {

    private float a; //atributos com variáveis do tipo float "a" e "b"
    private float b;

    public Operacoes(float a, float b) { //construtor recebe 2 valores e esses valores recebe dois atributos e os guarda
        this.a = a;
        this.b = b;
    }

    //a classe operações possui 4 métodos
    public float soma() {
        return a + b;
    }

    public float subtracao() {
        return a - b;
    }

    public float multiplicacao() {
        return a * b;
    }

    public float divisao() {
        return a / b;
    }
}