package aplicacao;

import java.util.ArrayList;
import java.util.List;

import interfaces.Trabalhador;
import implementacoes.*;

public class Program {
	public static void main(String[] args) {
        Engenheiro engenheiro1 = new Engenheiro("Alice");
        Gerente gerente1 = new Gerente("Bob");

        List<Trabalhador> trabalhadoresDoProjeto = new ArrayList<>();
        trabalhadoresDoProjeto.add(engenheiro1);
        trabalhadoresDoProjeto.add(gerente1);

        Projeto projeto = new Projeto(trabalhadoresDoProjeto);
        projeto.iniciarProjeto();
    }
}
