package ex16;

public class Pessoa {
    private String nome;
    private String doc;

    public Pessoa(String nome, String doc) {
        this.nome = nome;
        this.doc = doc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getNome() {
        return nome;
    }

    public String getDoc() {
        return doc;
    }
}
