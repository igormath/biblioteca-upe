package entities;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecaria {
    private String nome;
    private int cpf;

    private List<Estante> estantes = new ArrayList<>();

    public Bibliotecaria(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public List<Estante> getEstantes() {
        return estantes;
    }

    public void addEstante(Estante estante) {
        estantes.add(estante);
    }

    public Prateleira procurarPrateleira(String localizacao) {
        for (Estante estante : getEstantes()) {
            for (Prateleira prateleira : estante.getPrateleiras()) {
                if (prateleira.getLocalizacao().equalsIgnoreCase(localizacao)) {
                    return prateleira;
                }
            }
        }
        return null;
    }

    public void cadastrarLivro(String localizacao, String titulo, String autor, String isbn) {
        Prateleira prateleira = procurarPrateleira(localizacao);
        if (prateleira != null) {
            prateleira.addLivro(new Livro(titulo, autor, isbn));
            System.out.println("Livro cadastrado com sucesso na Prateleira " + prateleira.getLocalizacao());
        } else {
            System.out.println("Ocorreu um erro ao cadastrar o livro. Prateleira nao existente!");
        }

    }
}
