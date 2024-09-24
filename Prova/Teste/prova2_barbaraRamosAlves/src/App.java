import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        Transacao t = new Transacao();

        realizarTransacoesCliente("Barbara", "Senha@123", t);

        realizarTransacoesCliente("Joao", "Dolar$789", t);

    }

    private static void realizarTransacoesCliente(String nomeCliente, String senhaPadrao, Transacao transacoes) {
        int tentativas = 0;
        final int MAX_TENTATIVAS = 3;

        List<String> validacao = new ArrayList<>();
        validacao.add("Barbara:" + senhaPadrao);
        validacao.add("Joao:" + senhaPadrao);

        Cliente cliente = new Cliente(nomeCliente, "456.789.101-11");
        Conta conta = new Conta(272829, cliente, 5000.0f);
        float saldoAnterior = conta.getSaldo();

        while (tentativas < MAX_TENTATIVAS) {
            tentativas++;

            String usuario = JOptionPane.showInputDialog("Entre com o usuário");
            String senha = JOptionPane.showInputDialog("Entre com a senha");

            if (validarUsuarioSenha(usuario, senha, validacao)) {
                tentativas = 0;

                redefinirSenha(validacao, usuario);

                transacoes.realizarTransacao("01/12/2023", conta, "Depósito em Dinheiro", 100.0f, Movimento.DEPOSITAR);
                transacoes.realizarTransacao("02/12/2023", conta, "Pagamento Boleto Nubank", 2028.670f, Movimento.SACAR);
                transacoes.realizarTransacao("03/12/2023", conta, "Pagamento CEMIG", 600.0f, Movimento.SACAR);
                transacoes.realizarTransacao("04/12/2023", conta, "Recebimento ref. a prestação de serviço", 1700.0f, Movimento.DEPOSITAR);
    
                try {
                    char resp = JOptionPane.showInputDialog("Deseja emitir relatório? (SIM/NAO)").charAt(0);
                    if (resp == 's' || resp == 'S') {
                        emitirRelatorio(validacao, usuario, conta, cliente, transacoes, saldoAnterior);
                        break;
                    }
                } catch (Restricao r) {
                    JOptionPane.showMessageDialog(null, r.toString(), "RESTRIÇÃO DE IDENTIFICAÇÃO", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos. Tentativa " + tentativas + " de " + MAX_TENTATIVAS, "Erro de Autenticação", JOptionPane.ERROR_MESSAGE);

                if (tentativas == MAX_TENTATIVAS) {
                    char respostaRedefinir = JOptionPane.showInputDialog("Deseja redefinir usuário e senha? (SIM/NAO)").charAt(0);

                    if (respostaRedefinir == 's' || respostaRedefinir == 'S') {
                        redefinirUsuarioSenha(validacao);
                        tentativas = 0;
                    } else {
                        JOptionPane.showMessageDialog(null, "Encerrando a aplicação.", "Encerramento", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
            }
        }
    }

    private static void emitirRelatorio(List<String> validacao, String usuario, Conta conta, Cliente cliente, Transacao transacoes, float saldoAnterior) throws Restricao {
        boolean flag = true;

        for (String s : validacao) {
            if (s.startsWith(usuario + ":")) {
                flag = false;
                String texto = "Emitindo Extrato da Conta de Número: " + conta.getNumero() +
                        "\n\nCorrentista: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() +
                        "\nSaldo Anterior: " + saldoAnterior + "\n\n";
                for (Movimento mov : transacoes.getMovimentos())
                    texto += "........................................\nData: " + mov.getData() +
                            "\nHistórico: " + mov.getHistorico() + "\nValor: " + mov.getValor() +
                            "\nOperação: " + (mov.getOperacao() == Movimento.DEPOSITAR ? "Depósito" : "Saque")
                            + "\n";
                texto += "\nSaldo Atual: " + conta.getSaldo();
                JOptionPane.showMessageDialog(null, texto, "RELATÓRIO", 1);
                break;
            }
        }

        if (flag) {
            throw new Restricao("Usuário não autorizado.");
        }
    }

    private static boolean validarUsuarioSenha(String usuario, String senha, List<String> validacao) {
        for (String s : validacao) {
            String[] partes = s.split(":");
            if (partes.length == 2 && partes[0].equals(usuario) && partes[1].equals(senha)) {
                return true;
            }
        }
        return false;
    }

    private static void redefinirUsuarioSenha(List<String> validacao) {
        String usuario = JOptionPane.showInputDialog("Entre com o novo usuário");
        String senha = JOptionPane.showInputDialog("Entre com a nova senha");

        while (!senhaValida(senha)) {
            JOptionPane.showMessageDialog(null, "A senha não atende aos requisitos. Tente novamente.", "Senha Inválida", JOptionPane.ERROR_MESSAGE);
            senha = JOptionPane.showInputDialog("Entre com a nova senha");
        }

        boolean usuarioExistente = false;
        for (int i = 0; i < validacao.size(); i++) {
            String[] partes = validacao.get(i).split(":");
            if (partes.length == 1 && partes[0].equals(usuario)) {
                validacao.set(i, usuario + ":" + senha);
                usuarioExistente = true;
                break;
            }
        }

        if (!usuarioExistente) {
            validacao.add(usuario + ":" + senha);
        }
    }

    private static void redefinirSenha(List<String> validacao, String usuario) {
        String senha = JOptionPane.showInputDialog("Deseja redefinir a senha? (SIM/NAO)").toLowerCase();

        if (senha.equals("sim") || senha.equals("s")) {
            senha = JOptionPane.showInputDialog("Entre com a nova senha");

            while (!senhaValida(senha)) {
                JOptionPane.showMessageDialog(null, "A senha não atende aos requisitos. Tente novamente.", "Senha Inválida", JOptionPane.ERROR_MESSAGE);
                senha = JOptionPane.showInputDialog("Entre com a nova senha");
            }

            for (int i = 0; i < validacao.size(); i++) {
                String[] partes = validacao.get(i).split(":");
                if (partes.length == 2 && partes[0].equals(usuario)) {
                    validacao.set(i, usuario + ":" + senha);
                    break;
                }
            }
        }
    }

    private static boolean senhaValida(String senha) {
        return senha.matches("^(?=.*[$#@])(?=.*[0-9]).{6,}$");
    }
}
