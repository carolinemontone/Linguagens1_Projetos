// Adriana Padilla 15.00792-8
//Caroline Montone 15.00091-5
package atividade1;

public class Atividade1 {

    public static void main(String[] args) {
        Conta c1, c2, c3, c4;
        c1 = new Conta("Amilton", "Dias", "111.111.111-11", 1000, 1, 1.08, 0.32,
                45, 1, 250);
        c2 = new Conta("Henrique", "Diniz", "222.222.222-22", 3000, 2, 1.08, 0.32, 50, 2, 1000);
        c3 = new Conta("Leonardo", "Nomo", "333.333.333-33", 200, 3, 1.08, 0.32, 32, 3, 12000);
        c4 = new Conta("Alberto", "Roberto", "444.444.444-44", 1800, 1, 1.08, 0.32, 34, 4, 0);

        c2.transferirPara(c1, 700);
        c2.transferirPara(c3, 2000);
        c2.exibirSaldo();
        c1.exibirSaldo();
        c3.exibirSaldo();

        c1.sacar(1800);
        c1.transferirPara(c4, 200);
        c1.exibirSaldo();
        c4.exibirSaldo();

        c3.transferirPara(c4, 10000);
        c3.transferirPara(c2, 1000);
        c2.exibirSaldo();
        c4.exibirSaldo();
        c3.exibirSaldo();

        c3.depositar(22000);

        c1.exibirTodasInformacoesDaConta();
        c2.exibirTodasInformacoesDaConta();
        c3.exibirTodasInformacoesDaConta();
        c4.exibirTodasInformacoesDaConta();

    }

}
