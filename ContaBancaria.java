public class ContaBancaria {

    // Atributos
    private String numeroConta;
    private String titular;
    private double saldo;
    private String agencia;

    // Construtor
    public ContaBancaria(String numeroConta, String titular,
                         double saldo, String agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    // Getters e Setters
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    // Métodos
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Transferência de R$ " + valor + " realizada.");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

}
    
}
