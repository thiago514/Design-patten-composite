package aplicacao;

import java.util.List;

import interfaces.Trabalhador;

public class Projeto {
    private List<Trabalhador> trabalhadores;

    public Projeto(List<Trabalhador> trabalhadores) {
        this.trabalhadores = trabalhadores;
    }

    public void iniciarProjeto() {
        for (Trabalhador trabalhador : trabalhadores) {
            trabalhador.realizarTrabalho();
        }
    }
}
