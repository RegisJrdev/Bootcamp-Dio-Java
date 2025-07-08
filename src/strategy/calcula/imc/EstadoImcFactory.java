package strategy.calcula.imc;

public class EstadoImcFactory {
    private EstadoImc[] estados = {
            new ImcAbaixoDoPeso(),
            new ImcPesoIdeal(),
            new ImcLevementeAcimaPeso()
    };

    public EstadoImc getEstado(double imc) {
        for (EstadoImc estado : estados) {
            if (estado.pertence(imc)){
                return estado;
            }
        }
        return null;
    }
}