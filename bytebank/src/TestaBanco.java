public class TestaBanco {

    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo";
        paulo.cpf = "98225723287-87";
        paulo.profissao = "Segurança";
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.setSaldo(100);
        contaDoPaulo.setTitular(paulo);
        System.out.println(contaDoPaulo.getTitular().nome);
        Conta contaDaMonica = new Conta();
        contaDaMonica.setTitular(new Cliente());
        contaDaMonica.getTitular().nome = "Monica";
        System.out.println(contaDaMonica.getTitular().nome);

    }
}
