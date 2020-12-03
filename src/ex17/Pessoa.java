package ex17;

public class Pessoa {
    private String nome;
    private String doc;
    private int idade;
    private Pessoa mae;
    private Pessoa pai;

    public Pessoa(String nome, String doc, int idade) {
        this.nome = nome;
        this.doc = doc;
        this.idade = idade;
    }

    public Pessoa(String nome, String doc, int idade, Pessoa mae, Pessoa pai) {
        this.nome = nome;
        this.doc = doc;
        this.idade = idade;
        this.mae = mae;
        this.pai = pai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
}
