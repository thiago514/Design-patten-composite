package implementacoes;

import interfaces.Trabalhador;

public class Engenheiro implements Trabalhador {
    private String nome;

    public Engenheiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void realizarTrabalho() {
        System.out.println(nome + " está trabalhando em tarefas de engenharia.");
    }
}