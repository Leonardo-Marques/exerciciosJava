package ex17;

public class Ex17 {

    public static void main(String[] args) {
        Pessoa mae = new Pessoa("mae","08098098",40);
        Pessoa pai = new Pessoa("pai", "09012901292",38);
        Pessoa filho = new Pessoa("filho","2180932",20,mae,pai);

        System.out.print("nome: "+filho.getNome()+" idade: "+filho.getIdade()
        + " mae: "+filho.getMae().getNome() + " pai: "+filho.getPai().getNome());

    }
}
