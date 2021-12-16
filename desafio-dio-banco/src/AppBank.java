public class AppBank {

    public static void main(String[] args) {
        Cliente samuel = new Cliente();
        samuel.setNome("Samuel");

        Cliente junior = new Cliente();
        junior.setNome("Junior");

        Conta cc = new ContaCorrente(samuel);
        cc.depositar(100);
        cc.imprimirExtrato();

        Conta poupanca = new ContaPoupanca(junior);

        cc.transferir(100,poupanca);

        poupanca.imprimirExtrato();
        cc.imprimirExtrato();

    }
}

