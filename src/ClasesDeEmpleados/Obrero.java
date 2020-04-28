package ClasesDeEmpleados;

import Interfaces.Construccion;

public class Obrero extends Empleados implements Construccion {
    private int edad;
    private static final int SO=1500;
    public Obrero(){}
    public Obrero(String nombre, String dni,int telefono ,int edad)
    {
        super(nombre,dni,telefono,SO);
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getDni() {
        return super.getDni();
    }

    @Override
    public int getTelefono() {
        return super.getTelefono();
    }

    public static int getSO() {
        return SO;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void setTelefono(int telefono) {
        super.setTelefono(telefono);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setDni(String dni) {
        super.setDni(dni);
    }

    @Override
    public String Construir() {
        return "Soy obrero y construyo";
    }
}
