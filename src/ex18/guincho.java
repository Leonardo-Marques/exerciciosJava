package ex18;

public class guincho extends Automovel{
    private carro carro;
    private Moto moto;

    public guincho(int nroRodas, int velMax, String nroChassi) {
        super(nroRodas, velMax, nroChassi);
    }

    public carro getCarro() {
        return carro;
    }

    public void setCarro(ex18.carro carro) {
        this.carro = carro;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }
}
