
package s2.practica_andreflores;
import java.util.Scanner;
public class S2Practica_AndreFlores {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Menu");
        System.out.println("1 -> Problema de division");
        System.out.println("2 -> Problema de primeros 10 multiplos");
        System.out.println("3 -> tabla de 1 o 0");
        System.out.println("4 -> Sumatoria");
        System.out.println("5 -> auto suma");
        System.out.println("6 -> terminar");
        
        int opcion = leer.nextInt();
        if (opcion ==6){
            System.out.println("Saliendo... ");
        } // fin if opcion salida
        while(opcion!=6){
            
            if (opcion == 1){

            } // fin opcion 1
            else if ( opcion == 2){
                    // entradas
                    System.out.println(" ha escogido la opcion 2");
                    System.out.print("ingrese numero del que quiere ver los multiplos:  ");
                    int mult = leer.nextInt();
                    int limite = 9;
                    // validacion
                    if (mult < 0) {
                        System.out.println("No se puede hacer tabla con numero negativo");
                        
                    } // mult
                    else if (mult == 0) {
                        System.out.println("el numero 0 no puede hacer tabla");
                        
                    } // fin de else if mult
                    else {
                        int i = 0;
                        // calculo de la tabla
                        while (i <= limite){
                            int promedio = i * mult;
                            System.out.printf("%d x %d = %d%n", mult, i, promedio);
                            i++; 
                        } // fin while limite
                    } // fin else int
            } // fin de opcion 2
            else if (opcion == 3) {

                } // fin opcion 3
            else if (opcion == 4){
                
            } // fin opcion 4
            
            else if (opcion == 5){
                Scanner sc = new Scanner(System.in);
                System.out.println(" ha escogido la opcion 5");
                
                System.out.print(" ingrese su numero:  ");
                String numeros = sc.next();
                
                int total = 0;

                for (int i = 0; i< numeros.length(); i++) {
                    total += Integer.parseInt(numeros.substring(i, i+1));
                    } // fin for
                System.out.println("la respuesta es:  "+ total);               
            } // fin opcion 5
            else
            if(opcion == 6) {

            } // fin if op6
        System.out.println("Menu");
        System.out.println("1 -> Problema de division");
        System.out.println("2 -> Problema de primeros 10 multiplos");
        System.out.println("3 -> tabla de 1 o 0");
        System.out.println("4 -> Sumatoria");
        System.out.println("5 -> auto suma");
        System.out.println("6 -> terminar");

        opcion = leer.nextInt();
        if (opcion ==6){
        System.out.println("Saliendo... ");
        }
        
        } while(opcion!=6);// fin del while opcion 6
        
    } // fin de main
    
} // fin de class
