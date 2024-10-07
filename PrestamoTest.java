package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class PrestamoTest {

    @Test
    public void testFechasAlRevez() {
        LocalDate fechaPrestamo = LocalDate.of(2024, 11, 11);
        LocalDate fechaEntrega = LocalDate.of(2024, 10, 11);

        assertTrue(fechaEntrega.isBefore(fechaPrestamo) || fechaEntrega.isEqual(fechaPrestamo),
            "La fecha de devolución no puede ser posterior a la fecha de préstamo");
    }

    @Test
    public void testFechasIguales() {
        LocalDate fechaPrestamo = LocalDate.of(2024, 11, 11);
        LocalDate fechaEntrega = LocalDate.of(2024, 11, 11);
    
        assertTrue(fechaEntrega.isEqual(fechaPrestamo),
            "La fecha de devolución puede ser igual a la fecha de préstamo");
    }
    
 }
    
