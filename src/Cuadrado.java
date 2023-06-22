import java.util.Scanner;

public class Cuadrado extends Figura{
    double l;
    @Override
    public double calcularPerimetro() {
        return l * 4;
    }

    @Override
    public double calcularArea() {
        return Math.pow(l, 2);
    }

    public void ingresarLado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        l = scanner.nextDouble();
    }
}
