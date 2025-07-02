package com.junior.calculo.imc;

import java.util.Scanner;

public class MainImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraImc calculadora = new CalculadoraImc();

        System.out.println("Digite seu peso em KG: ");
        double pesoInformado = scanner.nextDouble();

        System.out.println("Informe sua altura em metros: ");
        double alturaInformada = scanner.nextDouble();

        double resultadoImc = calculadora.calculaImc(pesoInformado, alturaInformada);

        var message = calculadora.verificaImc(resultadoImc);

        System.out.println(message);
        }
}
