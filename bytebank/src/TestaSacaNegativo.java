public class TestaSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta(2164,575807);
        conta.deposita(100);
        System.out.println(conta.getSaldo());
        conta.setSaldo(-5);
        System.out.println(conta.getSaldo());
    }
}
