public class Pessoa {
    String nome;
    char sexo;
    int idade;

    public Pessoa(  String nome, char sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String exibe(){
        return "Cadastro:\n NOME: "+nome+"\n SEXO: "+sexo+"\nIDADE: "+idade;
    }

}
