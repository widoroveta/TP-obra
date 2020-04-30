package ClasesDeEmpresaYobra;

import ClasesDeEmpleados.Empleados;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombreEmpresa;
    private List<Empleados> empleadosList= new ArrayList<>();
    private List<Obra> obrasList=new ArrayList<>();
    public Empresa (){
    }
    public Empresa (String nombreEmpresa,List<Empleados>empleados,List<Obra>obras){
        this.empleadosList=empleados;
        this.nombreEmpresa=nombreEmpresa;
        this.obrasList=obras;
    }

    public List<Empleados> getEmpleadosList() {
        return empleadosList;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public List<Obra> getObrasList() {
        return obrasList;
    }

    public void setEmpleadosList(List<Empleados> empleadosList) {
        this.empleadosList = empleadosList;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setObrasList(List<Obra> obrasList) {
        this.obrasList = obrasList;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", empleadosList=" + empleadosList +'\'' +
                ", obrasList=" + obrasList +
                '}';
    }
}
