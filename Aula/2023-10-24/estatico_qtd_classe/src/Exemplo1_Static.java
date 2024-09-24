import javax.swing.JOptionPane;

public class Exemplo1_Static {

    public static void exibe(FichaPessoal ficha) {
        System.out.println("Nome: " + ficha.getNome());
        System.out.println("Idade: " + ficha.getIdade());
    }


    public static void main(String[] args) throws Exception {
        String nome1 = JOptionPane.showInputDialog("Informe o seu nome:");
        int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:"));
        FichaPessoal pessoa1= new FichaPessoal(nome1, idade1);
        FichaPessoal.setQuantidade(FichaPessoal.getQuantidade() + 1);
        exibe(pessoa1);
        

        String nome2 = JOptionPane.showInputDialog("Informe o seu nome:");
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:"));
        FichaPessoal pessoa2= new FichaPessoal(nome2, idade2);
        FichaPessoal.setQuantidade(FichaPessoal.getQuantidade()+1);
        exibe(pessoa2);

        System.out.println("Quantidade de pessoas: " + FichaPessoal.getQuantidade());
        
    }
}
