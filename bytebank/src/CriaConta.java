public class CriaConta {

    public static void main (String [] args){
        Conta primeiraConta = new Conta(2164,575807);
        primeiraConta.setSaldo(200);
        System.out.println(primeiraConta.getSaldo());
        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta.getSaldo());
        primeiraConta.deposita(150);
        System.out.println(primeiraConta.getSaldo());
        boolean conseguiu = primeiraConta.saca(275);
        System.out.println(primeiraConta.getSaldo());
        System.out.println(conseguiu);
        conseguiu = primeiraConta.saca(76);
        System.out.println(primeiraConta.getSaldo());
        System.out.println(conseguiu);
        Conta maison = new Conta(3715,582254);
        maison.setSaldo(100);
        Conta jose = new Conta(5458,252545);
        jose.setSaldo(0);
        maison.transfere(75,jose);
        System.out.println(maison.getSaldo());
        System.out.println(jose.getSaldo());


    }
}
