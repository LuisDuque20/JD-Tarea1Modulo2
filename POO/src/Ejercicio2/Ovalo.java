package Ejercicio2;

public class Ovalo extends FiguraGeometrica{
    private double ejeMayor;
    private double ejeMenor;

    public Ovalo(double ejeMayor, double ejeMenor){
        super("Ovalo");
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }

    @Override
    public double calcularArea(){
        return Math.PI * ejeMenor * ejeMayor;
    }

    @Override
    public double calcularPerimetro(){
        return Math.PI * (3*(ejeMayor + ejeMenor) - Math.sqrt((3*ejeMayor + ejeMenor)*(ejeMayor + 3*ejeMenor)));
    }

}
