import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figura {

    List<Punto> listaPuntos = new ArrayList<>();
    public abstract double calcularPerimetro();
    public abstract double calcularArea();

    public void ingresarPuntos()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la componente x del punto: ");
        double x = scanner.nextDouble();
        System.out.println("Ingrese la componente y del punto: ");
        double y = scanner.nextDouble();
        System.out.println("Ingrese la componente z del punto: ");
        double z = scanner.nextDouble();
        listaPuntos.add(new Punto(x, y, z));
    }

    public double calcularDistancia(int i, int j)
    {
        Punto punto1 = listaPuntos.get(i);
        Punto punto2 = listaPuntos.get(j);
        double dist = Math.sqrt(Math.pow(punto1.getX() - punto2.getX(), 2) + Math.pow(punto1.getY() - punto2.getY(), 2));
        return dist;
    }
}
