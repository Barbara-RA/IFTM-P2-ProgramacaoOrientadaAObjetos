public class JogadorDeFutrbol {
    private String nome;
    public String posicao;
    public int anoNascimento;
    public String nacionalidade;
    public double altura;
    public double peso;

    public JogadorDeFutrbol (String nome, String posicao, int anoNascimento, String nacionalidade, double altura, double peso){
        this.nome = nome;
        this.posicao = posicao;
        this.anoNascimento = anoNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public int calculeIdade(){
        int idade = 2023-anoNascimento;
        return idade;
    }

    public String exibe(){
        return "Nome: "+nome+"\nData de Nascimento: "+anoNascimento+"\nAltura: "+altura+"\nPeso: "+peso+"\nNacionalidade: "+nacionalidade+"\nPosição: "+posicao;
    }

    public String getNome() {
        return nome;
    }

  
    

}


