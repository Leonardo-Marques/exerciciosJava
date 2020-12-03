package ex18;

public class carroAutomatico extends carro{
    private boolean freio = false;

    public carroAutomatico(int nroRodas, int velMax, String nroChassi, String cor) {
        super(nroRodas, velMax, nroChassi, cor);
    }

    public void setFreio(boolean freio) {
        this.freio = freio;
    }

    public boolean isFreio() {
        return freio;
    }

    @Override
    public String ligar() {
        if (!freio) {
            return "freio não está ligado";
        }
        super.ligar();
        return "ok";
    }
}
