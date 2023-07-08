package application;

import entities.*;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ObterLocalizacao obterLocalizacao = new ObterLocalizacao();

        System.out.println("Digite o nome da bibliotecaria: ");
        String nomeBibliotecaria = sc.nextLine();
        System.out.println("Digite o CPF da bibliotecaria: ");
        int cpf = sc.nextInt();

        Bibliotecaria bibliotecaria = new Bibliotecaria(nomeBibliotecaria, cpf);

        System.out.println("Adicione uma ou mais estantes: ");
        int op = 1;
        do{
            System.out.println("Localizacao: ");
            String localizacao = sc.next();
            bibliotecaria.addEstante(new Estante(localizacao));
            System.out.println("Continuar? (0 para sair)");
            op = sc.nextInt();
        }while(op!=0);

        System.out.println("Adicione uma ou mais prateleiras: ");
        op = 1;
        do{
            System.out.println("Digite a localizacao da estante associada: ");
            String localizacaoEstante = sc.next();
            Estante estante = null;
            for (Estante bibliotecariaEstante : bibliotecaria.getEstantes()) {
                if (bibliotecariaEstante.getLocalizacao().equalsIgnoreCase(localizacaoEstante)){
                    estante = bibliotecariaEstante;
                    System.out.println("Estante encontrada! " + bibliotecariaEstante.getLocalizacao());
                    System.out.println("Digite a localizacao da prateleira: ");
                    String localizacaoPrateleira = sc.next();
                    estante.addPrateleira(new Prateleira(localizacaoPrateleira));
                }
            }

            if (estante == null){
                System.out.println("Estante nao encontrada!");
            }

            System.out.println("Digite 0 para sair: ");
            op = sc.nextInt();
        }while (op!=0);

        System.out.println();
        for (Estante estante : bibliotecaria.getEstantes()) {
            System.out.println("Estante: " + estante.getLocalizacao());
            List<Prateleira> prateleiras = estante.getPrateleiras();
            prateleiras.forEach(prateleira -> System.out.println("Prateleira: " + prateleira.getLocalizacao()));
        };
        System.out.println();

        System.out.println("Digite o titulo do livro: ");
        sc.next();
        String nomeLivro = sc.nextLine();
        System.out.println("Digite o autor do livro: ");
        String autor = sc.nextLine();
        System.out.println("Digite o ISBN do livro: ");
        String isbn = sc.nextLine();

        System.out.println("Digite a localizacao da prateleira para guardar o livro: ");
        String localizacaoLivro = sc.next();
        bibliotecaria.cadastrarLivro(localizacaoLivro, nomeLivro, autor, isbn);

        System.out.println("Digite o ISBN para localizar o livro: ");
        obterLocalizacao.obterLocalizacao(sc.next(), bibliotecaria.getEstantes());
        sc.close();
    }

}
