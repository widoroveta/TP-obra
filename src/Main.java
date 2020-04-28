import ClasesDeEmpleados.Arquitecto;
import ClasesDeEmpleados.Maestro;
import ClasesDeEmpleados.Obrero;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Obrero o=new Obrero();
        Maestro m=new Maestro();
        Arquitecto a=new Arquitecto();
        System.out.println(o.Construir());
        System.out.println(m.Construir());
        System.out.println(a.CrearPLanos() );
    }
}
