package entities;

import java.util.ArrayList;
import java.util.List;

public class Estante {
    private String localizacao;

    public Estante(String localizacao) {
        this.localizacao = localizacao;
    }

    private List<Prateleira> prateleiras = new ArrayList<>();

    public String getLocalizacao() {
        return localizacao;
    }

    public List<Prateleira> getPrateleiras() {
        return prateleiras;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void addPrateleira(Prateleira prateleira){
        prateleiras.add(prateleira);
    }

    public void listarPrateleiras(){
        prateleiras.forEach(prateleira -> System.out.println("Localizacao: " + prateleira.getLocalizacao()));
    }
}
