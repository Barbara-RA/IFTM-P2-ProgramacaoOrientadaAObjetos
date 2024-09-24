public class FichaPessoal {
    private String nome;
    private int idade;
    private static int quantidade;

    public FichaPessoal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int q) {
       quantidade = q;
    }


}
