import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("El siguiente programa te dice si eres menor o mayor de edad");
        Scanner sc = new Scanner (System.in); 
System.out.println ("INGRESE SU EDAD"); 
int edad = sc.nextInt(); 

        if (edad >=18) {
        System.out.println ("ERES MAYOR DE EDAD"); 
           

           } else {
                System.out.println("ERES MENOR DE EDAD");
            }

        }
    }

