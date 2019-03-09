public class TestaBanco {

    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo";
        paulo.cpf = "98225723287-87";
        paulo.profissao = "Segurança";
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
        Conta contaDaMonica = new Conta();
        contaDaMonica.titular = new Cliente();
        contaDaMonica.titular.nome = "Monica";
        System.out.println(contaDaMonica.titular.nome);

    }
}
