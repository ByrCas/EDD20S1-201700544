
public class NodoSimple{

         private NodoSimple siguiente;
         private Usuario duenio;
         private int cantidad;

        public NodoSimple(NodoSimple parNodoS, Usuario parUsuario, int parCantidad){
               this.cantidad = parCantidad;
               this.duenio = parUsuario;
               this.siguiente = parNodoS;
        }

        public int obtenerCantidad(){
            return this.cantidad;
        }

        public void asignarCantidad(int parCantidad){
             this.cantidad = parCantidad;
        }

        public Usuario obtenerUsuario(){
            return this.duenio;
        }

        public void asignarUsuario(Usuario parUsuario){
             this.duenio = parUsuario;
        }

        public NodoSimple obtenerSiguiente(){
            return this.siguiente;
        }

        public void asignarSiguiente(NodoSimple parSiguiente){
             this.siguiente = parSiguiente;
        }

}