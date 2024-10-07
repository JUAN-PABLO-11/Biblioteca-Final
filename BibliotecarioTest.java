package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Bibliotecario;


public class BibliotecarioTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCrearBibliotecario() {
        Bibliotecario bibliotecario = new Bibliotecario("Robinson", "496168454", "3005403056", "Robinson@gmail.com", 1.000, 98, null);
        assertEquals("Robinson", bibliotecario.getNombre());
        assertEquals("496168454", bibliotecario.getId());
        assertEquals("3005403056", bibliotecario.getTelefono());
        assertEquals("Robinson@gmail.com", bibliotecario.getCorreo());
        assertEquals(1.000, bibliotecario.getSalario());
        assertEquals(98, bibliotecario.getAños());
    }
    public void testModificarEdad(){
        Bibliotecario bibliotecario = new Bibliotecario("Robinson", "496168454", "3005403056", "Robinson@gmail.com", 1.000, 98, null);
        bibliotecario.setAños(100);
        assertEquals(100, bibliotecario.getAños());
    }
}

    
