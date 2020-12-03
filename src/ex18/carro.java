package ex18;

public class carro extends Automovel{
    private String cor;
    public carro(int nroRodas, int velMax, String nroChassi, String cor) {
        super(nroRodas, velMax, nroChassi);
        this.cor=cor;
    }
}
