package ClasesDeEmpleados;

import Interfaces.Construccion;

public class Empleados  {
    private String nombre;
    private String dni;
    private int telefono;
    private int salario;
    public Empleados(){

    }
    public Empleados (String nombre,String dni,int telefono, int salario)
    {
        this.dni=dni;
        this.nombre=nombre;
        this.telefono=telefono;
        this.salario=salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }


   public Empleados getEmpleados(){
        return this;
    }

    @Override
    public String toString() {
        return "\nEmpleados{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                ", salario=" + salario +
                '}';
    }

    public int getSalario() {
        return salario;
    }



    @Override
    protected Empleados clone() throws CloneNotSupportedException {
        return this;
    }
}
