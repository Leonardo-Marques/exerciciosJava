package ex19;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Agenda {
    private ArrayList<Contato> lista = new ArrayList<Contato>();

    public Agenda() {
    }

    public void add(String nome, String numero){
        Contato x = new Contato(nome,numero);
        lista.add(x);
    }
    public void delete(String nome){
        lista.remove(lista.stream()
                    .filter(contato -> contato.getNome().equals(nome))
                    .findFirst()
                    .get());
    }

    public String get(String nome){
        return lista.stream()
                    .filter(e-> e.getNome().equals(nome))
                    .findFirst()
                    .get().getNumero();
    }
    public ArrayList getAll(){
        return lista;
    }
}
