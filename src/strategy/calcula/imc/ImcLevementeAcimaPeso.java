package strategy.calcula.imc;

public class ImcLevementeAcimaPeso implements EstadoImc {
    @Override
    public boolean pertence(double imc) {
        return imc >= 18.6 && imc <= 24.9;
    }

    @Override
    public String getDescricao() {
        return "Levemente acima do peso";
    }
}
