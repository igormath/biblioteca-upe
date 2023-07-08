package entities;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    private String localizacao;

    public Prateleira(String localizacao) {
        this.localizacao = localizacao;
    }

    private List<Livro> livros = new ArrayList<>();

    public String getLocalizacao() {
        return localizacao;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void addLivro(Livro livro){
        livros.add(livro);
    }

    public void listarLivros(){
        livros.forEach(livro -> System.out.println("Titulo: " + livro.getTitulo() + ", Autor: " + livro.getAutor()));
    }
}
