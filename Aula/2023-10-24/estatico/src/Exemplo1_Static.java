import javax.swing.JOptionPane;

public class Exemplo1_Static {

    public static void exibe(FichaPessoal ficha) {
        System.out.println("Nome: " + ficha.getNome());
        System.out.println("Idade: " + ficha.getIdade());
    }


    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog("Informe o seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:"));
        FichaPessoal pessoa1= new FichaPessoal(nome, idade);
        exibe(pessoa1);
        
    }
}
