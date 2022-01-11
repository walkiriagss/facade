package facade;

public class NomeSujo extends Requisitos{

    private  static NomeSujo nomeSujo = new NomeSujo();

    private NomeSujo() {};

    public static NomeSujo getInstancia(){
        return  nomeSujo;
    }
}
