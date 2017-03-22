// Adriana Padilla 15.00792-8
//Caroline Montone 15.00091-5
package atividade1;

public class Conta {

    private int agencia;
    private int cc;
    private Dinheiro saldo;
    private double limite;
    private Cliente titular;

    public Conta(String nome, String sobrenome, String cpf, double valor, int moeda, double taxaEuroDolar, double taxaRealDolar, int agencia,
            int cc, double limite) {
        this.titular = new Cliente(nome, sobrenome, cpf);
        this.saldo = new Dinheiro(valor, moeda, taxaEuroDolar, taxaRealDolar);
        this.agencia = agencia;
        this.cc = cc;
        this.limite = limite;

    }

    boolean sacar(double valor) {
        double n = 0;
        n = this.saldo.getValor() - valor;
        if (n < this.limite) {
            System.out.println("Você não tem limite para essa operação.");
            return false;
        } else {
            this.saldo.setValor(n);
            System.out.println("Operação realizada!");
            return true;
        }
    }

    void depositar(double valor) {
        double n;
        if (valor > 0) {
            n = this.saldo.getValor() + valor;
            this.saldo.setValor(n);
            System.out.println("Operação realizada!");
        } else {
            System.out.println("Operação errada, utilize a função a sacar. Utilize valor maior que 0.");
        }
    }

    boolean transferirPara(Conta x, double valor) {
        if (this.sacar(valor)) {
            x.depositar(valor);
            System.out.println("Transferencia realizada");
            return true;
        } else {
            System.out.println("Transferencia não realizada");
            return false;
        }
    }

    void alterarNome(String nome) {
        this.titular.setNome(nome);
    }

    void alterarSobrenome(String sobrenome) {
        this.titular.setSobrenome(sobrenome);
    }

    void alterarCpf(String cpf) {
        this.titular.setNome(cpf);
    }

    void alterarMoedaCorrenteDaConta(int moeda) {
        this.saldo.setMoeda(moeda);
    }

    void exibirSaldo() {
        System.out.println("Saldo = " + this.saldo);
        String moeda = "TA";
        switch (this.saldo.getMoeda()) {
            case 1:
                moeda = "Real";
            case 2:
                moeda = "Dólar";
            case 3:
                moeda = "Euro";
        }
        System.out.println("Moeda: " + moeda);
        System.out.println("Taxa Euro Dolar: " + this.saldo.getTaxaEuroDolar());
        System.out.println("Taxa Real Dolar: " + this.saldo.getTaxaRealDolar());

    }

    void exibirTitular() {
        System.out.println("Nome completo:" + this.titular.getNome() + " "
                + this.titular.getSobrenome());
        System.out.println("CPF: " + this.titular.getCpf());
    }

    void exibirTodasInformacoesDaConta() {

    }

}
