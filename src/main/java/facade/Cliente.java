package facade;

public class Cliente {

    public boolean FinanciamentocasaVerdeEAmarela(){
        return ClienteFacade.verificarPendenciasFinanciamento(this);
    }
}

