import java.util.Scanner;
import models.Libro;
import models.Disco;
import models.Idioma;
import models.Video;

public class App {
    public static void main(String[] args) {

        // Atributos para Libro
        String tituloLibro;
        double precioLibro;
        int numeroPaginas;
        int anioPublicacion;

        // Atributos para Disco
        String tituloDisco;
        double precioDisco;
        float duracionMinutos;

        // Atributos para Video
        String tituloVideo;
        double precioVideo;
        float duracionHoras;
        models.Idioma idiomaVideo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("EDITORIAL - La de algo");
        System.out.println("========================================\n");

        // Entrada de datos para Libro
        System.out.println("--- Libro ---");
        System.out.print("Ingrese el titulo del libro: ");
        tituloLibro = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
        precioLibro = scanner.nextDouble();

        System.out.print("Ingrese el numero de paginas: ");
        numeroPaginas = scanner.nextInt();

        System.out.print("Ingrese el año de publicación: ");
        anioPublicacion = scanner.nextInt();
        System.out.println("-------------------------\n");

        scanner.nextLine(); // Scanner Scans and scans and fails

        // Entrada de datos para Disco
        System.out.println("--- Disco ---");
        System.out.print("Ingrese el titulo del disco: ");
        tituloDisco = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
        precioDisco = scanner.nextDouble();

        System.out.print("Ingrese la duracion (minutos): ");
        duracionMinutos = scanner.nextFloat();
        System.out.println("-------------------------\n");

        // Entrada de datos para Video
        scanner.nextLine();
        System.out.println("--- Video ---");
        System.out.print("Ingrese el titulo del video: ");
        tituloVideo = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
        precioVideo = scanner.nextDouble();

        System.out.print("Ingrese la duracion (horas): ");
        duracionHoras = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("Seleccione el idioma:");
        System.out.println("1. ESPANOL");
        System.out.println("2. INGLES");
        System.out.println("3. ALEMAN");
        System.out.println("4. PORTUGUES");
        System.out.print("Opcion (1-4): ");
        int opcionIdioma = scanner.nextInt();

        switch (opcionIdioma) {
            case 1:
                idiomaVideo = Idioma.ESPANOL;
                break;
            case 2:
                idiomaVideo = Idioma.INGLES;
                break;
            case 3:
                idiomaVideo = Idioma.ALEMAN;
                break;
            case 4:
            default:
                idiomaVideo = Idioma.PORTUGUES;
                break;
        }
        System.out.println("-------------------------\n");

        scanner.close();

        Libro libro = new Libro(tituloLibro, precioLibro, numeroPaginas, anioPublicacion);
        Disco disco = new Disco(tituloDisco, precioDisco, duracionMinutos);
        Video video = new Video(tituloVideo, precioVideo, idiomaVideo, duracionHoras);

        System.out.println(libro);
        System.out.println(disco);
        System.out.println(video);
    }
}
