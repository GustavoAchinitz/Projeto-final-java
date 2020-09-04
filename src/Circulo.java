import java.lang.Math;
public class Circulo extends Forma{
    private double raio;
    
    public Circulo(double raio){
        //super(1);
        this.raio = raio;
    }
    
    @Override
    public double cm2() {
      
        return Math.PI * Math.pow(this.raio, 2);
    
    }    
}
