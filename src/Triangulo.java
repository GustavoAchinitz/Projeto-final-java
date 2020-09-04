public class Triangulo extends Forma{
    private double lado;
   
    
    public Triangulo(double lado){
       // super(2);
        this.lado = lado;
       
    }

    @Override
    public double cm2() {
        return ((this.lado *Math.sqrt(3) ) / 4);
    }
    
}
