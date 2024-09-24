package appsobrecarga2;

public class Dados1 {
    
    private int a, b;
    private float c, d;
    
    public Dados1(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public Dados1(float c, float d){
        this.c = c;
        this.d = d;
    }
    
    public int getA(){
        return this.a;
    }

    public int getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float getD() {
        return d;
    }
    
}
