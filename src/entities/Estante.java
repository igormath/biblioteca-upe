package entities;

import java.util.ArrayList;
import java.util.List;

public class Estante {
    private String localizacao;

    private List<Prateleira> prateleiras = new ArrayList<>();

    public Estante(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public List<Prateleira> getPrateleiras() {
        return prateleiras;
    }

    public void addPrateleira(Prateleira prateleira) {
        prateleiras.add(prateleira);
    }
}
