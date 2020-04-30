package ClasesDeEmpresaYobra;

import ClasesDeEmpleados.Empleados;

import java.util.List;

public class Comerciales extends Obra {
    private String nombreDelaObra;
    public Comerciales (){
    }
    public Comerciales (String direccion, double cantidadMt2, double costoMt2, int tiempoEstimado, List<Empleados> empleados, String nombreDelaObra)
    {
        super(direccion, cantidadMt2,costoMt2,tiempoEstimado, empleados);
        this.nombreDelaObra=nombreDelaObra;
    }
    public void setNombreDelaObra(String nombreDelaObra) {
        this.nombreDelaObra = nombreDelaObra;
    }
    public String getNombreDelaObra() {
        return nombreDelaObra;
    }
    @Override
    public String toString() {
        return "\nComerciales{" +
                "nombreDelaObra='" + nombreDelaObra + '\'' +
                "} " + super.toString();
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

