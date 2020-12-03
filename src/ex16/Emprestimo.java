package ex16;

import ex16.Livro;
import ex16.Pessoa;

public class Emprestimo {
   private Livro livro;
   private Pessoa pessoa;
   private String data;

    public Emprestimo(Livro livro, Pessoa pessoa, String data) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
