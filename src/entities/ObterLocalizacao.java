package entities;

import java.util.List;

public class ObterLocalizacao {
    public void obterLocalizacao(String isbn, List<Estante> estantes) {
        for (Estante estante : estantes) {
            for (Prateleira prateleira : estante.getPrateleiras()) {
                for (Livro livro : prateleira.getLivros()) {
                    if (livro.getIsbn().equalsIgnoreCase(isbn)){
                        System.out.println("Livro encontrado!");
                        System.out.println("Estante: " + estante.getLocalizacao() + " Prateleira: " + prateleira.getLocalizacao());
                    }
                }
            }
        }
    }
}
