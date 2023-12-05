public class Conta {
    private double saldo = 0;

    public static void main(String[] args) {
        // Lógica para testar a classe Conta (pode criar objetos Conta e chamar métodos aqui)
    }

    public void setSaldo(double vSaldo) {
        saldo = vSaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double vValor) {
        if (vValor > saldo)
            System.out.println("Saldo insuficiente");
        else