package ex18;

public class Automovel {
    private int nroRodas;
    private int velMax;
    private String nroChassi;
    private boolean ligado = false;

    public Automovel(int nroRodas, int velMax, String nroChassi) {
        this.nroRodas = nroRodas;
        this.velMax = velMax;
        this.nroChassi = nroChassi;
    }

    public String ligar(){
        ligado = true;
        return "ok";
    }

    public int getNroRodas() {
        return nroRodas;
    }

    public void setNroRodas(int nroRodas) {
        this.nroRodas = nroRodas;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public String getNroChassi() {
        return nroChassi;
    }

    public void setNroChassi(String nroChassi) {
        this.nroChassi = nroChassi;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
