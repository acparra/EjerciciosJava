import java.util.Scanner;

public class App {

    private static double[] TurnosM = new double[2]; 
    private static double[] TurnosN = new double[2];
    private static Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        ingresarEmpleadosM();
        ingresarEmpleadosN();
        System.out.println("El total de los sueldos de la mañana es: " + obtenerSueldos(TurnosM));
        System.out.println("El total de los sueldos de la noche es: " + obtenerSueldos(TurnosN));
    }

    private static void ingresarEmpleadosM(){
        System.out.println("Ingrese los sueldos de los empleado del turno de la mañana");
        for (int i = 0; i < TurnosM.length; i++){
            System.out.println("Ingrese el sueldo del empleado " + i + ": ");
            TurnosM[i] = scanner.nextDouble();
        }

    }
    private static void ingresarEmpleadosN(){
        System.out.println("Ingrese los sueldos de los empleado del turno de la noche");
        for (int i = 0; i < TurnosN.length; i++){
            System.out.println("Ingrese el sueldo del empleado " + i + ": ");
            TurnosN[i] = scanner.nextDouble();
        } 
    }

    private static double obtenerSueldos(double[] Vector){
        double Sueldo = 0;
        for (int i = 0; i < Vector.length; i++){
            Sueldo += Vector[i];
        }
        return Sueldo;
    }


}