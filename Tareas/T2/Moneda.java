
public class Moneda{

       private String nombre;
       private String simbolo;
       private int monedero;
       private ListaSimple duenios;

       public Moneda(String parNombre, String parSimbolo, int parMonedero){
           this.duenios = new ListaSimple();
            this.monedero = parMonedero;
            this.nombre = parNombre;
            this.simbolo = parSimbolo;
       }


       public void nombrar(String parNombre){
            this.nombre = parNombre;
       }

       public void simbolizar(String parSimbolo){
        this.simbolo = parSimbolo;
       }

       public void delimitar(int parMonedero){
        this.monedero = parMonedero;
       }

       public void agregar(String nombreUsuario){
             Usuario usuarioNuevo = new Usuario(nombreUsuario);
             this.duenios.agregarAListaSimple(usuarioNuevo, 0);
       }

       public void trasladar(int cantidad, String idUsuario){
            String id;
            if(this.monedero >= cantidad){
                NodoSimple temporal=duenios.obtenerEncabezador();
                for (int recorrido = 0; recorrido < duenios.contarNodos(); recorrido++) {
                    id = temporal.obtenerUsuario().obtenerID();
                    if(id.equals(idUsuario)){
                            temporal.asignarCantidad(temporal.obtenerCantidad() + cantidad);
                            this.monedero = this.monedero - cantidad;    
                            System.out.println("Traslado exitoso");
                            break;
                    }else if(recorrido == duenios.contarNodos()-1){
                        System.out.println("Usuario no encontrado para el traslado");
                    }else{
                        temporal=temporal.obtenerSiguiente();
                    }
                } 
            }else{
                System.out.println("No se puede hacer el traslado desde el monedero, no hay suficientes monedas");
            }
       }

       public void transferir(String id_usuario_1, String id_usuario_2, int cantidad){
        String id;
            NodoSimple temporal=duenios.obtenerEncabezador();
            for (int recorrido = 0; recorrido < duenios.contarNodos(); recorrido++) {
                id = temporal.obtenerUsuario().obtenerID();
                if(id.equals(id_usuario_1)){
                        temporal.asignarCantidad(temporal.obtenerCantidad() - cantidad);
                        this.monedero = this.monedero - cantidad;    
                        break;
                }else if(recorrido == duenios.contarNodos()-1){
                    System.out.println("Usuario no encontrado para el traslado");
                }else{
                    temporal=temporal.obtenerSiguiente();
                }
            } 
            temporal=duenios.obtenerEncabezador();
            for (int recorrido = 0; recorrido < duenios.contarNodos(); recorrido++) {
                id = temporal.obtenerUsuario().obtenerID();
                if(id.equals(id_usuario_2)){
                        temporal.asignarCantidad(temporal.obtenerCantidad() + cantidad);
                        this.monedero = this.monedero - cantidad;    
                        System.out.println("Traslado exitoso");
                        break;
                }else if(recorrido == duenios.contarNodos()-1){
                    System.out.println("Usuario no encontrado para el traslado");
                }else{
                    temporal=temporal.obtenerSiguiente();
                }
            } 
            
       }

        public void detallar(){
            NodoSimple temporal=duenios.obtenerEncabezador();
            for (int recorrido = 0; recorrido <duenios.contarNodos(); recorrido++) {
                System.out.println("| ");
                System.out.print(temporal.obtenerUsuario().obtenerID() + ", ");
                System.out.print(temporal.obtenerUsuario().obtenerNombre() + ", ");
                System.out.print(temporal.obtenerCantidad());
                System.out.print(" |");
                temporal=temporal.obtenerSiguiente();
                System.out.println("\n");
            } 
        }
}








