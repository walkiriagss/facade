package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Requisitos {

    private List<Cliente> clienteInapto = new ArrayList<Cliente>();

    public void addClienteInapto(Cliente cliente) {
        this.clienteInapto.add(cliente);
    }

    public  boolean verificaClienteInapto(Cliente cliente){
        return  this.clienteInapto.contains(cliente);
    }
}
