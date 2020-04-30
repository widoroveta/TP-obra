package ClasesDeEmpleados;

public class Arquitecto extends Empleados {
private static  final int SA=2000;
private int numeroMatricula;
    public Arquitecto(){
}
public Arquitecto(String nombre,String dni,int telefono, int numeroMatricula)
{
    super(nombre,dni,telefono,SA);
    this.numeroMatricula=numeroMatricula;
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

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public static int getSA() {
        return SA;
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

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    public String CrearPLanos ()
    {
        return "Creando mi próximo plano";
    }



    @Override
    public String toString() {
        return "\nArquitecto{" +
                "numeroMatricula=" + numeroMatricula +
                "} " + super.toString();
    }

    @Override
    public Empleados clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
