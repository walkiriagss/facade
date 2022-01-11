package facade;

public class BaixaRenda extends Requisitos {

    private  static BaixaRenda baixaRenda = new BaixaRenda();

    private BaixaRenda() {};

    public static BaixaRenda getInstancia(){
        return  baixaRenda;
    }
}
