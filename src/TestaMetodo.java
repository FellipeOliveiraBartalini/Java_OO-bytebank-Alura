public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 50;
        conta.deposita(100);

        System.out.println(conta.saldo);
    }
}
