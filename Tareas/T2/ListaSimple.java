
public class ListaSimple{

        private NodoSimple encabezador;
        public static int cuentaNodos=0;

        public ListaSimple() {
            this.encabezador = null;
            
        }
        
        public void agregarAListaSimple(Usuario parUsuario, int parCantidad){
            NodoSimple nuevoDato = new NodoSimple(null, parUsuario, parCantidad);
            if (encabezador==null) {
                encabezador = new NodoSimple(null, parUsuario, parCantidad);
                System.out.println("Ser agrego cabeza a la lista");
            }
            else{
                NodoSimple momentaneo = encabezador;
                for (int recorrido = 0; recorrido < cuentaNodos-1; recorrido++) {
                  momentaneo = momentaneo.obtenerSiguiente();
                }
                momentaneo.asignarSiguiente(nuevoDato);
                System.out.println("Ser agrego nuevo elemento a la lista");
            }
            cuentaNodos=cuentaNodos+1;
        }
         
        public boolean estaVacia(){
            boolean indicador=true;
            if (encabezador!=null) {
                indicador=false;
            }
            return indicador;
        }
            
        public int contarNodos(){
            return cuentaNodos;
        }
        
        
        public Usuario obtenerUsuarioNodo(int ubicacion){
            Usuario dato;
            NodoSimple temporal=encabezador;
            for (int recorrido = 0; recorrido <ubicacion; recorrido++) {
                temporal=temporal.obtenerSiguiente();
            } 
            dato = temporal.obtenerUsuario();
            return dato;
        }

        public int obtenerCantidadNodo(int ubicacion){
            int dato;
            NodoSimple temporal=encabezador;
            for (int recorrido = 0; recorrido <ubicacion; recorrido++) {
                temporal=temporal.obtenerSiguiente();
            } 
            dato = temporal.obtenerCantidad();
            return dato;
        }



}