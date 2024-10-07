package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.DetallePrestamo;
import co.edu.uniquindio.poo.model.Libro;
import java.time.LocalDate;

public class DetallePrestamoTest {
     @Test
    public void testAgregarLibros() {
        // Crear un objeto DetallePrestamo
        DetallePrestamo detalle = new DetallePrestamo("20000", "1");

        // Crear un libro de prueba
        Libro libro = new Libro("001", "978-3-16-148410-0", "Disponible", "Autor Prueba", "Libro Prueba", "Editorial Prueba", LocalDate.of(2023, 1, 1), 10);

        // Agregar el libro a la lista de libros del préstamo
        detalle.getLibroPrestamo().add(libro);

        // Verificar que el libro haya sido agregado a la lista
        assertEquals(1, detalle.getLibroPrestamo().size(), "Debería haber un libro en la lista de préstamo");
        assertEquals(libro, detalle.getLibroPrestamo().get(0), "El libro agregado debería ser igual al libro creado");
    }
    @Test
    public void testValoresIncorrectosFalla() {
        // Crear un objeto DetallePrestamo
        DetallePrestamo detalle = new DetallePrestamo("30000", "4");

        // Verificar que el subtotal es un valor incorrecto (esto debería fallar)
        assertEquals("40000", detalle.getSubtotal(), "El subtotal debería ser 40000 y esto es incorrecto, por lo que la prueba fallará.");

        // Verificar que la cantidad es un valor incorrecto (esto debería fallar)
        assertEquals("5", detalle.getCantidad(), "La cantidad debería ser 5 y esto es incorrecto, por lo que la prueba fallará.");
    }
    
}
