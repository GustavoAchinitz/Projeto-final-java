public class Quadrado extends Forma{
    private double lado1;
    private double lado2;
    
    public Quadrado(double lado1, double lado2){
       // super(2);
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    @Override
    public double cm2() {
        return this.lado1 * this.lado2;
    }
    
    
}
