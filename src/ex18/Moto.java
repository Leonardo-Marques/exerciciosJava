package ex18;

public class Moto extends Automovel{
    private String cilindradas;

    public Moto(int nroRodas, int velMax, String nroChassi, String cilindradas) {
        super(nroRodas, velMax, nroChassi);
        this.cilindradas = cilindradas;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
}
