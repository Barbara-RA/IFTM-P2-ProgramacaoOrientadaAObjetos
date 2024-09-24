import java.util.List;

public class Validacao {
    public boolean validaSenha(String senha, List<String> senhasAutorizadas) {
        return senhasAutorizadas.contains(senha);
    }
}