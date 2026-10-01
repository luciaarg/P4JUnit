package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.net.URL;
import java.nio.file.Paths;


import static org.junit.jupiter.api.Assertions.*;

class LecturaArchivoTest {
    private static LecturaArchivo lecturaArchivo;
    @BeforeAll
    static void setUp() throws Exception {
        URL resource = LecturaArchivoTest.class
                .getClassLoader()
                .getResource("hola.txt");

        assertNotNull(
                resource,
                "El archivo hola.txt no se encontró en src/test/resources"
        );

        String ruta = Paths.get(resource.toURI()).toString();
        lecturaArchivo = new LecturaArchivo(ruta);
    }


    @Test
    void getNombre() {
    }

    @Test
    void getTamanio() {
    }

    @Test
    void getNumLineas() {
    }

    @Test
    void testToString() {
    }
}