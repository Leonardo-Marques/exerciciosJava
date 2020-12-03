package ex19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.add("fulano","0921809120931");
        agenda.add("ciclano", "210921092910");

        ArrayList<Contato> a = agenda.getAll();
        for (Contato contato:a) {
            System.out.println(contato.getNome());
        }

        System.out.println(agenda.get("fulano"));
        agenda.delete("fulano");


        for (Contato contato:a) {
            System.out.println(contato.getNome());
        }

    }
}
