
import java.util.Random;

public class Usuario{

    private String id;
    private String nombre;


    public Usuario(String parNombre){
         Random generador = new Random();
         int aleatorio = generador.nextInt(100);
         this.id = parNombre.substring(0,1) + String.valueOf(aleatorio);
         this.nombre = parNombre;
    }

    public String obtenerID(){
        return this.id;
    }

    public void asignarID(String parId){
         this.id = parId;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public void asignarNombre(String parNombre){
         this.nombre = parNombre;
    }


}