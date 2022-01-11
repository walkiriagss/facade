package facade;

public class Cliente {

    public boolean casaVerdeEAmarela(){
        return ClienteFacade.verificarPendenciasFinanciamento(this);
    }
}

