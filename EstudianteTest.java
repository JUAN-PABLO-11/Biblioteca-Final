package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import co.edu.uniquindio.poo.model.Estudiante;


public class EstudianteTest {
    public void testNombreVacioONulo() {
    Estudiante estudiante = new Estudiante(null, "24465345234","56789008" , "corre@gmail");
    
    // Verificar que el título no esté vacío
    assertNotNull(estudiante.getNombre(), "El nombre no debe ser nulo");

    // Caso 2: Probar con un título vacío
    estudiante.setNombre("");  // Cambiamos el título a una cadena vacía
    assertFalse(estudiante.getNombre().isEmpty(), "El nombre no debe estar vacío");

    estudiante.setCorreo("");
    assertFalse(estudiante.getCorreo().contains("@"), "El correo electrónico no debe ser válido si está vacío");
}
}
    

