public class CriaConta {

    public static void main (String [] args){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta.saldo);
        primeiraConta.deposita(150);
        System.out.println(primeiraConta.saldo);
        boolean conseguiu = primeiraConta.saca(275);
        System.out.println(primeiraConta.saldo);
        System.out.println(conseguiu);
        conseguiu = primeiraConta.saca(76);
        System.out.println(primeiraConta.saldo);
        System.out.println(conseguiu);


    }
}
