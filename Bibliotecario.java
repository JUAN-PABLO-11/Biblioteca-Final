package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Bibliotecario extends Persona{
    private double salario;
    private int años;
    private ArrayList<Prestamo> listaPrestamos;  

    // Constructor ajustado
    public Bibliotecario(String nombre, String id, String telefono, String correo, double salario, int años, ArrayList<Prestamo> listaPrestamos) {
        super(nombre, id, telefono, correo);
        this.salario = salario;
        this.años = años;
        this.listaPrestamos = listaPrestamos != null ? listaPrestamos : new ArrayList<>();
    }

    // Getters y Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }
}
