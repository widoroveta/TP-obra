package ClasesDeEmpresaYobra;

import ClasesDeEmpleados.Empleados;

import java.util.List;

public class Comercio extends Comerciales {
    private String rubro;

    public Comercio() {
    }

    public Comercio(String direccion, double cantidadMt2, double costoMt2, int tiempoEstimado, List<Empleados> empleados, String nombreDelaObra, String rubro) {
        super(direccion, cantidadMt2, costoMt2, tiempoEstimado, empleados, nombreDelaObra);
        this.rubro = rubro;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "\nComercio{" +
                "rubro='" + rubro + '\'' +
                "} " + super.toString();
    }
}