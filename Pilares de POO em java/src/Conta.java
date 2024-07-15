
//Classe pai
// deixar a classe abstract ninguem pode instanciar
public abstract class Conta implements Iconta{
    //constante classe  final
    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++ ;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        // saldo = saldo - valor

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        // saldo = saldo + valor

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        // saque de x para depositar no y
        this.sacar(valor);// chamar
        contaDestino.depositar(valor);

    }
    protected void imprimirInfoComuns() {
        System.out.println(String.format("Agencia:  %d", this.agencia));
        System.out.println(String.format("conta:  %d", this.numero));
        System.out.println(String.format("Saldo:  %.2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
