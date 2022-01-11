package facade;

public class ClienteFacade {
    public static boolean verificarPendenciasFinanciamento(Cliente cliente) {
       if(Emprestimo.getInstancia().verificaClienteInapto(cliente)){
           return false;
       }
        if(BaixaRenda.getInstancia().verificaClienteInapto(cliente)){
            return false;
        }
        if(NomeSujo.getInstancia().verificaClienteInapto(cliente)){
            return false;
        }
        return true;
    }
}
