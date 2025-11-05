package consolas;
import java.util.Scanner;
import logica.Parcial;

public class ConsolaMain {
    public static void main(String[] args) {
        Parcial parcial = new Parcial();
        Scanner sc = new Scanner(System.in);


        try {
            System.out.print("Ingrese a: ");
            double a = sc.nextDouble();
            System.out.print("Ingrese b: ");
            double b = sc.nextDouble();
            System.out.print("Ingrese c: ");
            double c = sc.nextDouble();

            double[] resultado = parcial.ecuacionsegundogrado(a, b, c);
            System.out.println("x1 = " + resultado[0]);
            System.out.println("x2 = " + resultado[1]);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
