import java.util.Scanner;

/*ESTRUCTURA DE DATOS USAC Sección: A
Byron Gerardo Castillo Gómez
201700544 */

public class Principal{

    public static void main(String[] args){
        //leemos la entrada de la dimensión:
        Scanner lector_info = new Scanner(System.in);
        System.out.println("Ingrese una dimensión para la matriz cuadrada: ");
        int dimension_elegida = lector_info.nextInt();
        lector_info.close();
        //dimensionamos la matriz:
        dimensionar_matriz(dimension_elegida);
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
}


    