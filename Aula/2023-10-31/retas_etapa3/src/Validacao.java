public class Validacao {
    public static boolean valida(double x1,double y1,double x2, double y2){
        if((x1>=0)&(y1>=0)&(x2>=0)&(y2>=0)){
            return true;
        }else{
            return false;
        }
    }
}
