package Ejercicio2;

public class Cuadrado extends FiguraGeometrica{

    private double lado;

    public Cuadrado(double lado){
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }
}
