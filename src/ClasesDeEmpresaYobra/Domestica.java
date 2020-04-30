package ClasesDeEmpresaYobra;

import ClasesDeEmpleados.Empleados;
import ClasesDeEmpleados.Obrero;

import java.util.List;

public class Domestica extends Obra {
    private int cantidadHab;

    public Domestica() {

    }

    public Domestica(String direccion, double cantidadMt2, double costoMt2, int tiempoEstimado, List<Empleados> empleados,int cantidadHab) {
    super(direccion,cantidadMt2,costoMt2,tiempoEstimado,empleados);
    this.cantidadHab=cantidadHab;
    }

    public int getCantidadHab() {
        return cantidadHab;
    }

    public void setCantidadHab(int cantidadHab) {
        this.cantidadHab = cantidadHab;
    }

    @Override
    public String toString() {
        return "\nDomestica{" +
                "cantidadHab=" + cantidadHab +
                "} " + super.toString();
    }
}
