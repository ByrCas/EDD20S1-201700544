import java.util.Scanner;

public class Principal {

    public static void main (String[] args){
        
        Scanner lector_n = new Scanner(System.in);
        Scanner lector_s = new Scanner(System.in);
        Scanner lector_c = new Scanner(System.in);
        String nombre, simbolo; int cantidad;

        System.out.println("Ingrese el nombre de la moneda:");
        nombre = lector_n.nextLine();
        System.out.println("Ingrese la simbología de la moneda");
        simbolo = lector_s.nextLine();
        System.out.println("Ingrese la cantidad del monedero:");
        cantidad = Integer.parseInt(lector_c.nextLine());
        Moneda monetaria = new Moneda(" ", "", 0);
        monetaria.delimitar(cantidad);
        monetaria.nombrar(nombre);
        monetaria.simbolizar(simbolo);
        try {
            Scanner lector_opción = new Scanner(System.in);
            Scanner lector_nom = new Scanner(System.in);
            Scanner lector_tras = new Scanner(System.in);
            Scanner lector_cant_tras = new Scanner(System.in);
            int cant_tras; String usuario_tras;
            String opcion;
            do {
                System.out.println("Elija una opción:");
                System.out.println("1.Agregar dueño/usuario");
                System.out.println("2.Trasladar del Monedero");
                System.out.println("3.Transferir a otro dueño");
                System.out.println("4.Detallar");
                System.out.println("5.Salir");
                opcion = lector_opción.nextLine();
                switch(opcion){
                    case "1":
                           System.out.println("Ingrese el nombre del dueño nuevo:");
                           monetaria.agregar(lector_nom.nextLine());
                    break;
                    case "2":
                           System.out.println("Ingrese el ID del usuario a trasladar");
                           usuario_tras = lector_tras.nextLine();
                           System.out.println("Ingrese la cantidad a trasladar");
                           cant_tras = Integer.parseInt(lector_cant_tras.nextLine());
                           monetaria.trasladar(cant_tras, usuario_tras);
                    break;
                    case "3": //
                    case "4":
                          monetaria.detallar();
                    break;
                }
            } while (!opcion.equals("5"));
            System.out.println("Fin del programa...");
        } catch (Exception e) {
            System.out.println("el dato ingresado no es válido");
        }
        
        

    }
}