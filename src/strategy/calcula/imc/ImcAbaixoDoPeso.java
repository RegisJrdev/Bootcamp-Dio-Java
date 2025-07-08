package strategy.calcula.imc;

public class ImcAbaixoDoPeso implements EstadoImc {
    @Override
    public boolean pertence(double Imc) {
        return Imc <= 18.5;
    }

    @Override
    public String getDescricao() {
        return "Abaixo do peso";
    }
}
