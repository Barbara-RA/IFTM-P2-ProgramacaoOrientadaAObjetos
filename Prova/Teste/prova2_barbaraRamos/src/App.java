import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        String usuario, senha;
        char resp;
        boolean flag = true;

        List<String> validacao = new ArrayList<>();
        validacao.add("william:123");

        // Initialize a transaction
        Transacao t = new Transacao();

        // Initialize a client and respective account
        Cliente cliente = new Cliente("william", "06525625661");
        Conta conta = new Conta(123456, cliente, 5000.0f);
        float saldoAnterior = conta.getSaldo();

        // Example transactions
        t.realizarTransacao("18/07/2023", conta, "Depósito Dinheiro", 300.0f, Movimento.DEPOSITAR);
        t.realizarTransacao("18/07/2023", conta, "Pagamento Conta de Luz", 875.670f, Movimento.SACAR);
        t.realizarTransacao("18/07/2023", conta, "Pagamento Conta de Telefone", 120.0f, Movimento.SACAR);
        t.realizarTransacao("19/07/2023", conta, "Recebimento de PIX", 500.0f, Movimento.DEPOSITAR);
        t.realizarTransacao("19/07/2023", conta, "Recebimento de PIX", 200.0f, Movimento.DEPOSITAR);
        t.realizarTransacao("21/07/2023", conta, "Pagamento Cartão de crédito", 3222.03f, Movimento.SACAR);
        t.realizarTransacao("23/07/2023", conta,"Pagamento Supermercado SUPER MAXI",343.87f, Movimento.SACAR);

        try {
            resp = JOptionPane.showInputDialog("Deseja emitir relatório? (SIM/NAO)").charAt(0);
            if (resp == 's' || resp == 'S') {
                usuario = JOptionPane.showInputDialog("Entre com o usuário");
                senha = JOptionPane.showInputDialog("Entre com a senha");
                for (String s : validacao)
                    if (s.compareTo(usuario + ":" + senha) == 0) {
                        flag = false;
                        String texto = "Emitindo Extrato da Conta de Número: " + conta.getNumero() +
                                "\n\nCorrentista: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() +
                                "\nSaldo Anterior: " + saldoAnterior + "\n\n";
                        for (Movimento mov : t.getMovimentos())
                            texto += "........................................\nData: " + mov.getData() +
                                    "\nHistórico: " + mov.getHistorico() + "\nValor: " + mov.getValor() +
                                    "\nOperação: " + (mov.getOperacao() == Movimento.DEPOSITAR ? "Depósito" : "Saque")
                                    + "\n";
                        texto += "\nSaldo Atual: " + conta.getSaldo();
                        JOptionPane.showMessageDialog(null, texto, "RELATÓRIO", 1);
                        break;
                    }
                if (flag)
                    throw new Restricao("Usuário não autorizado a ver o relatório");
            }
        } catch (Restricao r) {
            JOptionPane.showMessageDialog(null, r.toString(), "RESTRIÇÃO DE IDENTIFICAÇÃO", JOptionPane.ERROR_MESSAGE);
        }
    }
}