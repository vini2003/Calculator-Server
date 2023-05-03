package dev.vini2003.calculadora.rmi;

public class CalculadoraRemoteImpl implements CalculadoraRemote {

    private double valorA;
    private double valorB;

    /**
     * Construtor sem argumento.
     */
    public CalculadoraRemoteImpl() {
        this(0.0, 0.0);
    }

    /**
     * Construtor com argumento.
     *
     * @param valorA Um valor real.
     * @param valorB Um valor real.
     */
    public CalculadoraRemoteImpl(double valorA, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }

    @Override
    public double getValorA() {
        return valorA;
    }

    @Override
    public double getValorB() {
        return valorB;
    }

    @Override
    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    @Override
    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    /**
     * Realiza a adição.
     *
     * @return Um valor real.
     */
    @Override
    public double getAdicao() {
        return (getValorA() + getValorB());
    }

    /**
     * Realiza a subtração
     *
     * @return Um valor real.
     */
    @Override
    public double getSubtracao() {
        return (getValorA() - getValorB());
    }

    /**
     * Realiza o produto.
     *
     * @return Um valor real.
     */
    @Override
    public double getProduto() {
        return (getValorA() * getValorB());
    }

    /**
     * Realiza a divisão.
     *
     * @return Um valor real.
     */
    @Override
    public double getDivisao() {
        return (getValorA() / getValorB());
    }
}
