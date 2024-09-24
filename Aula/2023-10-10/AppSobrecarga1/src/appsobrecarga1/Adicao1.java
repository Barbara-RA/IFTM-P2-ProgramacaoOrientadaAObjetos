package appsobrecarga1;

public class Adicao1 {
    
    public Adicao1(){
    }
    
    public  int addInt(int a, int b){
        return a+b;
    }
    
    public  float addFloat(float c, float d){
        return c+d;
    }
    
    public  String exibeInt(int a, int b, int soma){
        return "A soma de "+a+" e "+b+" vale: "+soma;
    }
    
    public  String exibeFloat(float c, float d, float soma){
        return "A soma de "+c+" e "+d+" vale: "+soma;
    }   
}
