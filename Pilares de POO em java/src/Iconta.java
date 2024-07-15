//todo metodo na interface é public
public interface Iconta {

     void imprimirExtrato();

     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor, Conta contaDestino);
}
