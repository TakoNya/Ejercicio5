package archivosejercicio5;
import java.io.*;

public class ArchivosEjercicio5 {

        public static void main(String[] args) {
            System.out.println("Contando la cantidad de letras \"a\"...");
            int contador = 0;
            try{
                FileInputStream archivoEntrada = new FileInputStream (new File ("archivo5.txt"));
                int dato;
                while ((dato = archivoEntrada.read())!= -1){
                    if (dato == 97)                                //97 es el código ASCII de "a"
                        contador++;
                }
                archivoEntrada.close();
                
            }catch (Exception errorDeArchivo){
                System.out.println("Ha habido problemas: " + errorDeArchivo.getMessage());
            }
            System.out.println("La cantidad de letras \"a\" en el archivo es : " + contador);
            
            
        
    }
    
}
