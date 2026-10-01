package org.example;
import java.net.URL;
import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) throws Exception{
        URL resource = Main.class
                .getClassLoader()
                .getResource("hola.txt");

        if (resource == null) {
            throw new IllegalArgumentException(
                    "No se encontró hola.txt en src/main/resources"
            );
        }

        String ruta = Paths.get(resource.toURI()).toString();
        LecturaArchivo lectura = new LecturaArchivo(ruta);

        System.out.println("Nombre: " + lectura.getNombre());
        System.out.println("Tamaño: " + lectura.getTamanio() + " KB");
        System.out.println("Número de líneas: " + lectura.getNumLineas());
        System.out.println("Resumen: " + lectura);

    }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

}

