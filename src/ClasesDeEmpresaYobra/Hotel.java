package ClasesDeEmpresaYobra;

import ClasesDeEmpleados.Empleados;

import java.util.List;

public class Hotel extends Comerciales{
    private int cantidadPisos;
    public Hotel (){

    }
    public Hotel (String direccion, double cantidadMt2, double costoMt2, int tiempoEstimado, List<Empleados> empleados,String nombreObra,int cantidadPisos)
    { super(direccion,cantidadMt2,costoMt2,tiempoEstimado,empleados,nombreObra);
        this.cantidadPisos=cantidadPisos;
    }
    public int getCantidadPisos() { return cantidadPisos; }
    public void setCantidadPisos(int cantidadPisos) { this.cantidadPisos = cantidadPisos; }
    @Override
    public  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "\nHotel{" +
                "cantidadPisos=" + cantidadPisos +
                "} " + super.toString();
    }
}
