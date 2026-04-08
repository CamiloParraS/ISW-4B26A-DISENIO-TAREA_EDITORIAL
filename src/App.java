import java.util.Scanner;
import models.Libro;
import models.Disco;

public class App {
    public static void main(String[] args) {

        // LIBRO COSAS
        String titulo;
        double Precio;
        int numeroPaginas;
        int anioPublicacion;
        // DISCO COSAS
        String tituloDisco;
        double PrecioDisco;
        float duracionMinutos;


        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("welcome to the mogging station");
        System.out.println("================================\n");

        // LIBORSSSSSS
        System.out.println("===============================");
        System.out.print("Write the title of the mogging manual:  ");
        titulo = scanner.nextLine();
        System.out.print("Write the price of the mogging manual:  ");
        Precio = scanner.nextDouble();
        System.out.print("Write the number of pages of the mogging manual:  ");
        numeroPaginas = scanner.nextInt();
        System.out.print("Write the year of publication of the mogging manual:  ");
        anioPublicacion = scanner.nextInt();
        System.out.println("===============================\n");

        scanner.nextLine(); // Consume the newline left by nextInt()

        System.out.println("================================");
        System.out.print("Write the title of the mogging album:  ");
        tituloDisco = scanner.nextLine();
        System.out.print("Write the price of the mogging album:  ");
        PrecioDisco = scanner.nextDouble();
        System.out.print("Write the duration in minutes of the mogging album:  ");
        duracionMinutos = scanner.nextFloat();
        System.out.println("================================\n");

        scanner.close();

        // Crear las cosas
        Libro libro = new Libro(titulo, Precio, numeroPaginas, anioPublicacion);
        Disco disco = new Disco(tituloDisco, PrecioDisco, duracionMinutos);

        // Mostrar las cosas
        System.out.println(libro);
        System.out.println(disco);
    }
}
