package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveRetornarInaptoBaixaRendaParaCasaVerdeEAmarela() {
        Cliente cliente = new Cliente();
        BaixaRenda.getInstancia().addClienteInapto(cliente);

        assertEquals(false, cliente.casaVerdeEAmarela());
    }

    @Test
    void deveRetornarInaptoEmprestimoParaCasaVerdeEAmarela() {
        Cliente cliente = new Cliente();
        Emprestimo.getInstancia().addClienteInapto(cliente);

        assertEquals(false, cliente.casaVerdeEAmarela());
    }

    @Test
    void deveRetornarInaptoNomeSujoParaCasaVerdeEAmarela() {
        Cliente cliente = new Cliente();
        NomeSujo.getInstancia().addClienteInapto(cliente);

        assertEquals(false, cliente.casaVerdeEAmarela());
    }

    @Test
    void deveRetornarClienteAptoParaCasaVerdeEAmarela() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.casaVerdeEAmarela());
    }

}