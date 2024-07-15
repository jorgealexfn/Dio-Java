

//classe filha recebe heranças da classe pai Conta
// via "Extends ...."
public class ContaPoupanca extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.println("==== extrato Conta poupança ===");
        super.imprimirInfoComuns();
    }

}
