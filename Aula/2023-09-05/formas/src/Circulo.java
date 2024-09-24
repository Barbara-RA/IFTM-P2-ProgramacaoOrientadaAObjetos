public class Circulo {
    double raio, xc, yc;

    public Circulo (double raio, double xc, double yc){
        this.raio= raio;
        this.xc= xc;
        this.yc=yc;
    }

    public double area(){
        return Math.PI * Math.pow(raio,2);
    }

    public double comprimento(){
        return 2 * raio * Math.PI;
    }

    public String exibe(){
        return "**Circulo** \\n" + //
                "Centro do círculo: ("+xc+", "+yc+")\n"+"Raio: "+raio;
    }


}
