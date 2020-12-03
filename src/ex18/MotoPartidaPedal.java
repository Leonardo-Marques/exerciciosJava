package ex18;

public class MotoPartidaPedal extends Moto{
    private boolean aceleradorPuxado = true;

    public MotoPartidaPedal(int nroRodas, int velMax, String nroChassi, String cilindradas, boolean aceleradorPuxado) {
        super(nroRodas, velMax, nroChassi, cilindradas);
        this.aceleradorPuxado = aceleradorPuxado;
    }

    @Override
    public String ligar() {
        if (aceleradorPuxado) {
            super.ligar();
            return "ok";
        }
        return "Moto precisa estar com acelerador puxado para ligar";
    }

    public boolean isAceleradorPuxado() {
        return aceleradorPuxado;
    }

    public void setAceleradorPuxado(boolean aceleradorPuxado) {
        this.aceleradorPuxado = aceleradorPuxado;
    }
}
