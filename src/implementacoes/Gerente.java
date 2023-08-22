package implementacoes;

import interfaces.Trabalhador;

public class Gerente implements Trabalhador {
    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    @Override
    public void realizarTrabalho() {
        System.out.println(nome + " está gerenciando o projeto.");
    }
}