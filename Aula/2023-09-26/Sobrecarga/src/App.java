import java.util.Scanner;

public class App {

    public static Dados1 leiDadosInt(Scanner s){
        
        System.out.println("***SOMA DE INTEIROS***");
        System.out.println("Informe o Valor de A");
        int a= s.nextInt();
        System.out.println("Informe o Valor de B");
        int b= s.nextInt();
        

        Dados1 informacoesInt = new Dados1(a,b);
        return informacoesInt;
    }

    public static Dados1 leiaDadosFloat(Scanner s){
        System.out.println("\n\n***SOMA DE FLOAT***");
        System.out.println("Informe o Valor de C");
        float c= s.nextFloat();
        System.out.println("Informe o Valor de D");
        float d= s.nextFloat();
        
        Dados1 informacoesFloat = new Dados1(c, d);
        return informacoesFloat;
        
    }



    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        // instanciando a classe adição
        Adicao1 somaInt = new Adicao1();

        // somando inteiros
        Dados1 dadosInt = leiDadosInt(s);
        int totalInt = somaInt.addInt(dadosInt.getA(), dadosInt.getB());
        System.out.println(somaInt.exibeInt(dadosInt.getA(), dadosInt.getB(), totalInt));

        // somando float
        Adicao1 somaFloat = new Adicao1();
        Dados1 dadosFloat = leiaDadosFloat(s);
        float totalFloat = somaFloat.addFloat(dadosFloat.getC(),dadosFloat.getD());
        System.out.println(somaFloat.exibeFloat(dadosFloat.getC(), dadosFloat.getD(), totalFloat));

        s.close();
    }
}
