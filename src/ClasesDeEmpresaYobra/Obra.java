package ClasesDeEmpresaYobra;

import ClasesDeEmpleados.Arquitecto;
import ClasesDeEmpleados.Empleados;
import ClasesDeEmpleados.Maestro;

import java.util.List;

public class Obra {
   /* • Dirección
• Cantidad de metros cuadrados
• Tiempo estimado de obra (Este es un valor en días)
• Costo por metro cuadrado
• Listado del personal asignado (arquitectos, obreros y maestros
            mayores de la empresa)*/
   private String direccion;
   private double cantidadMt2;
   private double costoMt2;
   ///listado de empleados
    private List<Empleados> E;


    public Obra(){}
    public Obra(String direccion,double cantidadMt2,double costoMt2,List<Empleados> E)
    {
        this.cantidadMt2=cantidadMt2;
        this.costoMt2=cantidadMt2;
        this.direccion=direccion;
    }
    public void setE(Arquitecto a, List <Maestro> m,List<Empleados> E)
    {
        if (a instanceof (Arquitecto)){
        this.E
    }
    }
}
