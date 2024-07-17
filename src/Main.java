
public class Main {

    public static void main(String[] args) {
        Cliente fernanda = new Cliente();
        fernanda.setNome("Fernanda");

        Conta cc = new ContaCorrente(fernanda);
        Conta poupanca = new ContaPoupanca(fernanda);

        cc.depositar(2000);
        cc.transferir(2000, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}