package ClasesDeEmpresaYobra;

import ClasesDeEmpleados.Arquitecto;
import ClasesDeEmpleados.Empleados;
import ClasesDeEmpleados.Maestro;
import ClasesDeEmpleados.Obrero;

import java.util.ArrayList;
import java.util.Arrays;
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
    private int tiempoEstimado;
    private List<Empleados> empleados = new ArrayList<>();

    public Obra() {
    }

    public Obra(String direccion, double cantidadMt2, double costoMt2, int tiempoEstimado, List<Empleados> empleados) {
        this.cantidadMt2 = cantidadMt2;
        this.costoMt2 = cantidadMt2;
        this.direccion = direccion;
        this.tiempoEstimado = tiempoEstimado;
        this.empleados = empleados;
    }
    public void setCantidadMt2(double cantidadMt2) {
        this.cantidadMt2 = cantidadMt2;
    }
    public void setCostoMt2(double costoMt2) {
        this.costoMt2 = costoMt2;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }
    public List<Empleados> getEmpleados() { return empleados; }
    public void setEmpleados(List<Empleados> empleados) { this.empleados = empleados; }
    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    public double getCantidadMt2() {
        return cantidadMt2;
    }
    public double getCostoMt2() {
        return costoMt2;
    }
    public String getDireccion() {
        return direccion;
    }
    @Override
    public String toString() {
        return "\nObra{" +
                "direccion='" + direccion + '\'' +
                ", cantidadMt2=" + cantidadMt2 +
                ", costoMt2=" + costoMt2 +
                ", empleados=" + empleados +
                '}';
    }
    public double CalcularCosto() {
        double costo = 0;
        double costoEmpleados = 0;
        for (int i = 0; i < empleados.size(); i++) {
            costoEmpleados += empleados.get(i).getSalario();
        }
        //((costo_por_metro * mt2) + (costo_de_empleados)) * cantidad_días
        costo = (this.costoMt2 * this.cantidadMt2) + (costoEmpleados * tiempoEstimado);
        return costo;
    }


}
