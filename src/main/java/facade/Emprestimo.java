package facade;

public class Emprestimo extends Requisitos{

    private  static Emprestimo emprestimo = new Emprestimo();

    private Emprestimo() {};

    public static Emprestimo getInstancia(){
        return  emprestimo;
    }
}
