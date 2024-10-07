package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Estudiante extends Persona{
    private ArrayList<DetallePrestamo> listaDetallesPrestamo;

    public Estudiante(String nombre, String id, String correo, String telefono) {
        super(nombre, id, telefono, correo);
        listaDetallesPrestamo = new ArrayList<>();
    }
    
    public ArrayList<DetallePrestamo> getListaDetallesPrestamo() {
        return listaDetallesPrestamo;
    }

    public void setListaDetallesPrestamo(ArrayList<DetallePrestamo> listaDetallesPrestamo) {
        this.listaDetallesPrestamo = listaDetallesPrestamo;
    }

}
