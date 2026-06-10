import io.github.lucaslorran.javachallenge.modelos.ModeloCarro;

public class Principal {

    public static void main (String [] args){

        ModeloCarro bmw = new ModeloCarro();

        bmw.setModelo("Sedan");
        bmw.definirPrecos(150, 39000, 35000);
        bmw.exibirInfo();
    }
}
