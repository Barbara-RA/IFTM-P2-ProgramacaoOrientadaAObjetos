public class Retas {
    private double x1,y1,x2,y2;
    public static int contador=0;

    public Retas(double x1,double y1, double x2, double y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        contador++;
    }

    public double comprimento(){
        return Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
    
    }


    public String exibe(){
        return "RETA\nP1: ("+x1+","+y1+") e P2: ("+x2+","+y2+")";
    }

}
