import java.util.Scanner;
public class EJ2 {
    public static int[] comensales;
    public static String menus[][] = {
        {"P1", "1500", "P2", "1500", "P3", "1500"},
        {"P1", "3000", "P2", "3000", "P3", "3000"},
        {"P1", "4500", "P2", "4500", "P3", "4500"}
    };

    public static Scanner scanner = new Scanner(System.in);
    public static int nComensales = 0;

    // CONSTANTES PARA COLOR DE LETRA
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(menus.length);
        System.out.println(ANSI_GREEN + "SISTEMA DEL CAMARERO" + ANSI_RESET);
        while (nComensales == 0){
            printInfo("Ingresa el numero de comensales: ");
            printRespuesta();
            nComensales = scanner.nextInt();
            if (nComensales > 0 && nComensales <=5){
                comensales = new int[nComensales+1];
                comensales[0] = nComensales+1;
            } else{
                printError("El numero de comensales solo puede comprender un rango de 1 a 5");
                printError("Intenta nuevamente");
                System.out.println("");
                nComensales = 0;
            }
        }

        System.out.println("");
        printInfo("A continuacion ingresa el menu seleccionado por cada comensal (1, 2 o 3): ");
        int menuTemp;
        for (int i = 1; i <= nComensales; i++){
            menuTemp = 0;
            while (menuTemp == 0){
                System.out.print(ANSI_GREEN + "INFO: " + ANSI_RESET +"Comensal " + i + ": ");
                menuTemp = scanner.nextInt();
                if (menuTemp > 0 && menuTemp <= menus.length){
                    comensales[i] = menuTemp;
                } else {
                    printError("El numero de menu solo puede comprender un rango de 1 a 3");
                    printError("Intenta nuevamente");
                    System.out.println("");
                    menuTemp = 0;
                }
                }
        }


        System.out.println("");
        printInfo("LA FACTURA ES LA SIGUIENTE");
        System.out.println("");


        System.out.printf("%12s%12s%12s", "COMENSAL", "MENU", "VALOR");
        double totalCena = 0;
        for (int i = 1; i <= nComensales; i++){
            System.out.println("");
            System.out.printf("%12s%12s%12s", ""+i+"", ""+comensales[i]+"", "");
            for(int j = 0; j < menus[comensales[i]-1].length; j = j+2 ){
                System.out.println("");
                System.out.printf("%12s%12s%12s", "", menus[comensales[i]-1][j], menus[comensales[i]-1][j+1]);
                totalCena += Double.parseDouble(menus[comensales[i]-1][j+1]);              
           }
        }
        System.out.println("");
        System.out.printf("%12s", "El valor de la cena es: " + totalCena);
        System.out.println("");

    }  
    
    public static void printInfo(String msg){
        System.out.println(ANSI_GREEN + "INFO: " + ANSI_RESET + msg);
    }

    public static void printError(String msg){
        System.out.println(ANSI_RED + "ERROR: " + ANSI_RESET + msg);
    }

    public static void printRespuesta(){
        System.out.print(ANSI_GREEN + "RESPUESTA: " + ANSI_RESET);
    }
}
