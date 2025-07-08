package strategy.calcula.imc;

public class ImcPesoIdeal implements EstadoImc {
    @Override
    public boolean pertence(double Imc) {
        return Imc  >= 18.6 && Imc<= 24.9;
    };

    @Override
    public String getDescricao() {
        return "Peso Ideal";
    };
}
