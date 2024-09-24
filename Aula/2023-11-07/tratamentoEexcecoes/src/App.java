import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static final String senha="senha123";
    public static void main(String[] args) throws InputMismatchException {
        Scanner s = new Scanner(System.in);
        String confirmaSenha;
        boolean siga = true;
        do {
        try {
            System.out.println("informe a senha: ");
            confirmaSenha=s.nextLine();
            verificasenha(confirmaSenha, siga);
          } catch (InputMismatchException e) {
            System.out.println("Informe a senha novamente");
        }
        } while (siga);

        s.close();
    }

   

    public static void verificasenha(String confirmaSenha,boolean siga){
        if (senha.equals(confirmaSenha)) {
                System.out.println("Senha válida");
                siga = false;
            } else {
                System.err.println("Senha válida");
            }
    }

}
