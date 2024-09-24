package pack1;

import java.util.Scanner;

import javax.swing.JOptionPane;

import pack2.ContaPoupanca;

public class App {

    public static ContaPoupanca leDadosPoupanca() {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o nome:");
        String nome = s.nextLine();

        System.out.println("Informe o n° da conta:");
        String numeroConta = s.nextLine();

        System.out.println("Informe o saldo atual da conta:");
        double saldo = s.nextDouble();

        s.close();
        ContaPoupanca cP = new ContaPoupanca(nome, numeroConta, saldo);
        return cP;
    }

    public static ContaCorrente leDadosContaCorrente() {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o nome:");
        String nome = s.nextLine();

        System.out.println("Informe o n° da conta:");
        String numeroConta = s.nextLine();

        System.out.println("Informe o saldo atual da conta:");
        double saldo = s.nextDouble();

        s.close();
        ContaCorrente cC = new ContaCorrente(nome, numeroConta, saldo);
        return cC;
    }

    public static String menu() {
        String dados="";
        Scanner s = new Scanner(System.in);
        int opcao;
        int opcao2;
        do {
            opcao=Integer.parseInt(JOptionPane.showInputDialog("Qual opção deseja selecionar: 1-Conta Poupanca   2-Conta Corrente   3-SAIR"));
            switch (opcao) {
                case 1:
                System.out.println("Conta Poupanca");
                    ContaPoupanca cP = leDadosPoupanca();
                    do {
                        opcao2=Integer.parseInt(JOptionPane.showInputDialog("Conta Poupanca\nInforme qual opção deseja:   1-Depositar   2- Sacar  3- Exibir  4-VOLTAR."));
                        switch (opcao2) {
                            case 1:
                                // System.out.println("informe o valor do depósito:");
                                // double deposito = s.nextDouble();
                                double deposito=Integer.parseInt(JOptionPane.showInputDialog("informe o valor do depósito:"));
                                cP.depositar(deposito);
                                break;
                            case 2:
                                // System.out.println("informe o valor do saque:");
                                // double saque = s.nextDouble();
                                double saque=Integer.parseInt(JOptionPane.showInputDialog("informe o valor do saque:"));
                                cP.sacar(saque);
                                break;
                            case 3:
                                dados=cP.exibe();
                                System.out.println(dados);
                                break;

                            case 4:
                                break;
                        }
                    } while (opcao != 4);

                case 2:
                    System.out.println("Conta Corrente");
                    ContaCorrente cC = leDadosContaCorrente();
                    do {
                        opcao2=Integer.parseInt(JOptionPane.showInputDialog("Conta Corrente - Informe qual opção deseja:  1-Depositar 2- Sacar  3- Exibir  4-VOLTAR."));
                        switch (opcao2) {
                            case 1:
                                // System.out.println("informe o valor do depósito:");
                                // double deposito = s.nextDouble();
                                double deposito=Integer.parseInt(JOptionPane.showInputDialog("informe o valor do depósito:"));
                                cC.depositar(deposito);
                                break;
                            case 2:
                                // System.out.println("informe o valor do saque:");
                                // double saque = s.nextDouble();
                                double saque=Integer.parseInt(JOptionPane.showInputDialog("informe o valor do saque:"));
                                cC.sacar(saque);
                                break;
                            case 3:
                                dados=cC.exibe();
                                System.out.println(dados);
                                break;
                            case 4:
                                break;
                        }
                    } while (opcao != 4);
            }
        } while (opcao != 3);

        s.close();
        return dados;
    }

    public static void main(String[] args) throws Exception {
        menu();

    }
}
