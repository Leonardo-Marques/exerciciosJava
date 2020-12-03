package ex16;

public class Ex16 {

    public static void main(String[] args) {
        Livro a = new Livro("A cabana","121231");
        Pessoa fulano = new Pessoa("fulano", "81203798");
        Emprestimo um = new Emprestimo(a,fulano,"10/10/2020");

        System.out.print("exemplo emprestimo: livro "+um.getLivro().getTitulo()+" para "+um.getPessoa().getNome() + " data: "+um.getData());
    }
}
