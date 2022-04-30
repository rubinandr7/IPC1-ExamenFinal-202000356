package examenfinal;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opM = 0, num1 = 0, num2 = 0;
        double pira = 0;
        
        while(opM!=4){
            System.out.println("**********************");
            System.out.println("* 1. Ejercicio 1     *");
            System.out.println("* 2. Ejercicio 2     *");
            System.out.println("* 3. Ejercicio 3     *");
            System.out.println("* 4. Salir           *");
            System.out.println("**********************");
            System.out.println("Elija una opción");
            opM = sc.nextInt();
            sc.nextLine();
            
            switch(opM){
                case 1:
                    System.out.println("Ingrese el primer número");
                    num1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el segundo número");
                    num2 = sc.nextInt();
                    sc.nextLine();
                    if (num1>num2) {
                        System.out.println("El número mayor es: " + num1);
                    } else{
                        System.out.println("El número mayor es: " + num2);
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Ingrese un número impar");
                    pira = sc.nextFloat();
                    sc.nextLine();
                    if (pira%2==0) {
                        System.out.println("Ingrese un número impar");
                        pira = sc.nextFloat();
                        sc.nextLine();
                        double div = pira / 2;
                        double filas = div + 0.5;
                        for (int i = 1; i <= filas; i++) {
                            for (int j = 1; j <= filas-i; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 1; j <= (i*2)-1; j++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    } else{
                        double div = pira / 2;
                        double filas = div + 0.5;
                        for (int i = 1; i <= filas; i++) {
                            for (int j = 1; j <= filas-i; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 1; j <= (i*2)-1; j++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Ingrese el número de vacas disponibles");
                    int numV = sc.nextInt();
                    sc.nextLine();
                    System.out.println("¿Cuál es el peso límite del caminión en kilogramos");
                    int pesoM = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Lista separada por comas de pesos de vacas");
                    String cad1 = sc.nextLine();
                    String[] pesoV = cad1.split(",");
                    System.out.println("Lista separada por comas de producción de leche de vaca");
                    String cad2 = sc.nextLine();
                    String[] proV = cad2.split(",");
                    System.out.println("Hasta aquí quedó :,)");
                    break;
                default:
                    System.out.println("Elija un número válido");
            }
        }
    }
    
}
