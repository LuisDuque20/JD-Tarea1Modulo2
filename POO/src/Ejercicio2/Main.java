package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[4];

        figuras[0] = new Circulo(5);
        figuras[1] = new Ovalo(6, 3);
        figuras[2] = new Cuadrado(4);
        figuras[3] = new Triangulo(3, 4, 3, 4, 5);

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Figura: " + figura.getNombre());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("----------------------------");
        }
    }
}
