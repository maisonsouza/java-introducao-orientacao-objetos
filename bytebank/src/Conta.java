class Conta{
    double saldo;
    int agencia;
    int numero;
    String titular;

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

}