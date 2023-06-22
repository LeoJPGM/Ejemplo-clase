import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("==== Menu ====");
            System.out.println("1. Triangulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Circulo");
            System.out.println("4 Salir");

            System.out.println("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    Triangulo triangulo = new Triangulo();
                    System.out.println("Has seleccionado el triangulo.");
                    System.out.println("Ingresa los puntos en x, y, z: ");
                    triangulo.ingresarPuntos();

                    System.out.println("Que deseas calcular?");
                    System.out.println("A) Perimetro");
                    System.out.println("B) Area");

                    System.out.println("Seleccione una opcion: ");
                    char opcionTri = scanner.next().charAt(0);
                    if (opcionTri == 'a' || opcionTri == 'A') {
                        double perimetro = triangulo.calcularPerimetro();
                        System.out.println("El perimetro del triangulo es: " + perimetro);
                    } else if (opcionTri == 'b' || opcionTri == 'B') {
                        double area = triangulo.calcularArea();
                        System.out.println("El area del triangulo es: " + area);
                    } else {
                        System.out.println("Opcion invalida");
                    }
                }
                case 2 -> {
                    Cuadrado cuadrado = new Cuadrado();
                    System.out.println("Has seleccionado el cuadrado.");
                    cuadrado.ingresarLado();

                    System.out.println("Que deseas calcular?");
                    System.out.println("A) Perimetro");
                    System.out.println("B) Area");
                    System.out.println("Seleccione una opcion: ");
                    char opcionCuad = scanner.next().charAt(0);
                    if (opcionCuad == 'a' || opcionCuad == 'A') {
                        cuadrado.calcularPerimetro();
                    } else if (opcionCuad == 'b' || opcionCuad == 'B') {
                        cuadrado.calcularArea();
                    } else {
                        System.out.println("Opcion invalida");
                    }
                }
                case 3 -> {
                    System.out.println("Has seleccionado el circulo.");
                    System.out.println("Que deseas calcular?");
                    System.out.println("A) Perimetro");
                    System.out.println("B) Area");
                    System.out.println("Seleccione una opcion: ");
                    char opcionCir = scanner.next().charAt(0);
                    if (opcionCir == 'a' || opcionCir == 'A') {
                        //Perimetro cl
                    } else if (opcionCir == 'b' || opcionCir == 'B') {
                        //Area cl
                    } else {
                        System.out.println("Opcion invalida");
                    }
                }
                case 4 -> {
                    System.out.println("Hasta pronto!");
                    System.exit(0);
                }
                default -> System.out.println("Opcion invalida");
            }

        }
    }
}