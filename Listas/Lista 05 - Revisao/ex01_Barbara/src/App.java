import javax.swing.JOptionPane;
import java.util.ArrayList;

public class App {

    public class App {
        public static void main(String[] args) throws Exception {
            // exibir saldo Anterior;
            float saldoAnterior = 1000.0f;
            System.out.println("Saldo Anterior: " + saldoAnterior);

            // criar arraylist de validação nome e senha
            ArrayList<String> validacao = new ArrayList<>();
            validacao.add("usuario1:senha1");
            validacao.add("usuario2:senha2");

            // criar objeto conta
            Conta conta = new Conta();

            // menu de login
            do {
                int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação:\n0 - Sacar\n1 - Depositar\n2 - Exibir Movimentações\n3 - Sair"));

                switch (operacao) {
                    case 0:
                        // Sacar
                        float valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do saque:"));
                        conta.sacar(valorSaque);
                        break;
                    case 1:
                        // Depositar
                        float valorDeposito = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do depósito:"));
                        conta.depositar(valorDeposito);
                        break;
                    case 2:
                        // Exibir Movimentações
                        conta.exibirMovimentacoes();
                        break;
                    case 3:
                        // Sair
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } while (true);
        }
    }
}
