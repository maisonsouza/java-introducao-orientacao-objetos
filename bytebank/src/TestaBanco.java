public class TestaBanco {

    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo");
        paulo.setCpf("98225723287-87");
        paulo.setProfissao("Segurança");
        Conta contaDoPaulo = new Conta(2164,575807);
        contaDoPaulo.setSaldo(100);
        contaDoPaulo.setTitular(paulo);
        System.out.println(contaDoPaulo.getTitular().getNome());
        Conta contaDaMonica = new Conta(2154,352689);
        contaDaMonica.setTitular(new Cliente());
        contaDaMonica.getTitular().setNome("Monica");
        System.out.println(contaDaMonica.getTitular().getNome());

    }
}
