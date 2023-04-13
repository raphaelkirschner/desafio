import operadores.Soma;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double  valorA, valorB;
        Scanner entradaValor = new Scanner(System.in);

        System.out.print("Digite o primeiro valor:");
        valorA = entradaValor.nextDouble();

        System.out.print("Digite o segundo valor:");
        valorB = entradaValor.nextDouble();

        Soma soma = new Soma(valorA, valorB);

        System.out.printf("O resultado é %.1f%n.", soma.somar());

        entradaValor.close();
    }
}