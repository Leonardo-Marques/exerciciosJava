package ex18;

public class Ex18 {

    public static void main(String[] args) {
        carro a = new carro(4,200,"312124324","amarelo");
        carroAutomatico b = new carroAutomatico(4,100,"32932","Preto");
        guincho c = new guincho(6,80,"221093812309");
        MotoPartidaPedal d = new MotoPartidaPedal(2,200,"213123","500",false);
        System.out.println(b.ligar());
        b.setFreio(true);
        System.out.println(b.ligar());

        System.out.println(d.ligar());
        d.setAceleradorPuxado(true);
        System.out.println(d.ligar());

        c.setCarro(a);
        c.setMoto(d);
        System.out.println(c.getCarro().getNroChassi());
        System.out.println(c.getMoto().getNroChassi());
    }
}
