public class Formacao {
    String nivel;
    boolean concluido;
    String instituicao;
    int ano;

    public Formacao (String nivel, boolean concluido, String instituicao, int ano){
        this.nivel= nivel;
        this.concluido = concluido;
        this.instituicao = instituicao;
        this.ano = ano;
    }


    public String exibe(){
        return "FORMAÇÃO\n NIVEL: "+nivel+"\n CONCLUIDO: "+concluido+"\nINSTITUIÇÃO: "+instituicao+"\nANO: "+ano;
    }


}
