package strategy.calcula.imc;

public class CalculadoraImc {
    double calculaImc (double pesoemKg, double alturaEmMetros){
        return pesoemKg / (alturaEmMetros * alturaEmMetros);
    }
}
