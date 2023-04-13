package operadores;

public class Soma {
    double valorA, valorB;
    public Soma(double valorA, double valorB)
    {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public double somar()
    {
        return this.valorA + this.valorB;
    }
}
