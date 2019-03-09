class Conta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia,int numero){
        total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    void deposita(double valor){
        this.saldo+=valor;
    }

    boolean saca(double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            return true;
        }else{
            return false;
        }
    }

    double transfere(double valor, Conta destino){
        this.saca(valor);
        destino.deposita(valor);
        return this.saldo;
    }

    double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}