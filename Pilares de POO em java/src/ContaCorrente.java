

//classe filha recebe heranças da classe pai Conta
// via "Extends ...."
public class ContaCorrente extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta corrente ===");
        super.imprimirInfoComuns();
    }
}
