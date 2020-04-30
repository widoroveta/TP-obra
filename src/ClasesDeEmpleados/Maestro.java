package ClasesDeEmpleados;

import Interfaces.Construccion;

public class Maestro extends Empleados implements Construccion {
    private int edad;
    private static final int SM=1800;
    public Maestro(){};
    public Maestro (String nombre,String dni,int telefono,int edad){
        super(nombre,dni,telefono,SM);
        this.edad=edad;
    }

    @Override
    public void setDni(String dni) {
        super.setDni(dni);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setTelefono(int telefono) {
        super.setTelefono(telefono);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int getTelefono() {
        return super.getTelefono();
    }

    @Override
    public String getDni() {
        return super.getDni();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public int getEdad() {
        return edad;
    }

    public static int getSM() {
        return SM;
    }

    @Override
    public String Construir() {
        return "Soy maestro y superviso las construcciones";
    }

    @Override
    public String toString() {
        return "\nMaestro{" +
                "edad=" + edad +
                "} " + super.toString();
    }

    @Override
    public Empleados clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
