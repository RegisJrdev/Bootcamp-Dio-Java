package com.junior.calculo.imc;

public class CalculadoraImc {

    public double calculaImc(double pesoEmKg, double alturaEmMetros) {
        return pesoEmKg / (alturaEmMetros * alturaEmMetros);
    }

    public String verificaImc(double resultadoImc) {
        if (resultadoImc <= 18.5) return "Abaixo do peso";
        if (resultadoImc >= 18.6 && resultadoImc <= 24.9) return "Peso Ideal";
        if (resultadoImc >= 25 && resultadoImc <= 29.9) return "Levemente acima do peso";
        if (resultadoImc >= 30 && resultadoImc <= 34.9) return "Obesidade Grau I";
        if (resultadoImc >= 35 && resultadoImc <= 35.9 ) return "Obesidade Grau II (Severa)";
        return "Obesidade III (Mórbida)";
    }
}

