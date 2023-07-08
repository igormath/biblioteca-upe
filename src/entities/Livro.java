package entities;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublic;
    private String isbn;
    private int edicao;
    private int codigo;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
