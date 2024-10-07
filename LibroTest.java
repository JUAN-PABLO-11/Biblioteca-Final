package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import co.edu.uniquindio.poo.model.Libro;

public class LibroTest {

    @Test
public void testUnidadesDisponiblesNegativas() {
    Libro libro = new Libro("001", "978-3-16-148410-0", "Disponible", "Autor Prueba", "Título Prueba", "Editorial Prueba", LocalDate.of(2023, 1, 1), 10);

    libro.setUnidadesDisponibles(-5);

    assertFalse(libro.getUnidadesDisponibles() >= 0, "Las unidades disponibles no deben ser negativas");
}
    
@Test
public void testTituloVacioONulo() {
    Libro libro = new Libro("001", "978-3-16-148410-0", "Disponible", "Autor Prueba", null, "Editorial Prueba", LocalDate.of(2023, 1, 1), 10);
    
    // Verificar que el título no esté vacío
    assertNotNull(libro.getTitulo(), "El título no debe ser nulo");

    // Caso 2: Probar con un título vacío
    libro.setTitulo("");  // Cambiamos el título a una cadena vacía
    assertFalse(libro.getTitulo().isEmpty(), "El título no debe estar vacío");
}
}
