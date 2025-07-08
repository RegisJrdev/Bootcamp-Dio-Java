package strategy.calcula.imc;

public class Main {
    public static void main(String[] args) {
        CalculadoraImc calculadora = new CalculadoraImc();
        EstadoImcFactory factory = new EstadoImcFactory();

        double imcCalculado = calculadora.calculaImc(67, 1.67);
        EstadoImc estado = factory.getEstado(imcCalculado);
        System.out.println(imcCalculado);
        System.out.println(estado.getDescricao());
    }
}

//EstadoImc estado = EstadoImcFactory.getEstado(imc);
