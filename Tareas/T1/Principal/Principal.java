import java.util.Scanner;

/*ESTRUCTURA DE DATOS USAC Sección: A
Byron Gerardo Castillo Gómez
201700544 */

public class Principal{

    public static void main(String[] args){
        Scanner lector_opcion = new Scanner(System.in);
        Scanner lector_info = new Scanner(System.in);
        String opcion_elegida; int opcion_transformada = 0;
        String dimension_elegida; int dimension_transformada = 0;
        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Dimensionar Matriz");
            System.out.println("2. Salir");
            try {
                opcion_elegida = lector_opcion.nextLine();
                opcion_transformada = castearStringaInt(opcion_elegida);
                switch(opcion_transformada){
                        case 1 :
                            //leemos la entrada de la dimensión:
                            System.out.println("Ingrese una dimensión para la matriz cuadrada: ");
                            try {
                                dimension_elegida = lector_info.nextLine();
                                dimension_transformada = castearStringaInt(dimension_elegida);
                                //dimensionamos la matriz:
                                dimensionar_matriz(dimension_transformada);
                            } catch (Exception e) {
                                System.out.println("Valor inadecuado, Debe introducir una dimensión numérica!!");
                            }
                        break;
                        case 2:
                            System.out.println("Fin del programa...");
                            lector_opcion.close();
                            lector_info.close();
                        break;
                        default:
                             System.out.println("Valor inadecuado, elija una opción presente en el menú");
                             break;
                }
            } catch (Exception exc) {
                System.out.println("Por favor ingrese una opción numérica correspondiente a las opciones del menú");
            }
        }while(opcion_transformada != 2);
     }

     public static void dimensionar_matriz(int dimension){
         //declaramos una matriz cuya dimensión vendrá de los parámetros:
         int matriz_dimensionada[][] = new int[dimension][dimension];
         //recorremos la matriz y la rellenamos de 0 (para evitar posiciones nulas al imprimir)
         for (int recorredor_columna = 0; recorredor_columna < dimension; recorredor_columna++) {
            for (int recorredor_fila = 0; recorredor_fila < dimension; recorredor_fila++) {
                matriz_dimensionada[recorredor_fila][recorredor_columna] = 0;
            }
         }
         rellenar_matriz(matriz_dimensionada, dimension);
         graficar_matriz(matriz_dimensionada, dimension);
     }

     public static void rellenar_matriz(int parMatriz[][], int dimension){
         /*Recorremos la matriz, por cada fila hará un recorrido de cada columna, si la columna
          actual es de los extremos toda la columna cambiará su valor a 1, de lo contrario solo 
          los extremos de la columna lo harán*/ 
            for (int recorredor_columna = 0; recorredor_columna < dimension; recorredor_columna++) {
                if(recorredor_columna == 0 || recorredor_columna == dimension-1){
                    for (int recorredor_fila = 0; recorredor_fila < dimension; recorredor_fila++) {
                        parMatriz[recorredor_fila][recorredor_columna] = 1;
                    }
                }else{
                    parMatriz[0][recorredor_columna] = 1;
                    parMatriz[dimension-1][recorredor_columna] = 1;
                }
                
            }      
     }

     public static void graficar_matriz(int parMatriz[][], int dimension){
         //Recorremos la matriz fila por fila, obteniendo el dato de la matriz para imprimirlo
        for (int recorredor_fila = 0; recorredor_fila < dimension; recorredor_fila++) {
            System.out.print("\n | ");
            for (int recorredor_columna = 0; recorredor_columna < dimension; recorredor_columna++) {
                System.out.print(parMatriz[recorredor_fila][recorredor_columna] + " | ");
            }
        }
        System.out.print("\n");
     }

     public static int castearStringaInt(String opcion){
       int nuevo_entero = Integer.parseInt(opcion);
       return nuevo_entero;
    }
    
}

   
    