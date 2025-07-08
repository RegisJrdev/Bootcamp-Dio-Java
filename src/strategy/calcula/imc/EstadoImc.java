package strategy.calcula.imc;

public interface EstadoImc {
    boolean pertence(double Imc);
    String getDescricao();
}
