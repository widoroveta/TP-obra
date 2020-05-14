import ClasesDeEmpleados.Arquitecto;
import ClasesDeEmpleados.Empleados;
import ClasesDeEmpleados.Maestro;
import ClasesDeEmpleados.Obrero;
import ClasesDeEmpresaYobra.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // write your code here
        //Obreros
        Obrero o1 = new Obrero("carlos", "465654554", 4752145, 25);
        Obrero o2 = new Obrero("leandro", "23213212", 4752554, 26);
        Obrero o3 = new Obrero("lionel", "45464654", 4745455, 32);
        Obrero o4 = new Obrero("sergio", "54546465", 4734545, 41);
        Obrero o5 = new Obrero("manuel", "54564654", 4754445, 20);
        Obrero o6 = new Obrero("emanuel", "54546654", 4762145, 22);
        Obrero o7 = new Obrero("gonzalo", "54646464", 4782145, 29);
        Obrero o8 = new Obrero("lautaro", "55654654", 4772245, 35);
        Obrero o9 = new Obrero("ricardo", "56465645", 4725545, 36);
        Obrero o10 = new Obrero("ricardo", "56465645", 4725545, 36);
        Obrero o11 = new Obrero("ruben", "5646645", 4729875, 47);
        Obrero o12 = new Obrero("dario", "564464645", 4565545, 65);
        //Maestros
        Maestro m1 = new Maestro("miguel", "22323232", 4175546, 50);
        Maestro m2 = new Maestro("natanael", "15455456", 4756546, 60);
        Maestro m3 = new Maestro("gerardo", "20000014", 456465, 45);
        Maestro m4 = new Maestro("matias", "30005454", 4825545, 52);
        Maestro m5 = new Maestro("daniel", "14464640", 5465456, 52);
        Maestro m6 = new Maestro("lionel", "42155546", 546466545, 24);
        Maestro m7 = new Maestro("diego", "456545564", 545466564, 44);
        Maestro m8 = new Maestro("marcos", "54654646454", 464654646, 54);
        //Arquitectos
        Arquitecto a1 = new Arquitecto("daniel", "121454654", 65646455, 50545654);
        Arquitecto a2 = new Arquitecto("enrique", "54654545", 6464655, 54564654);
        Arquitecto a3 = new Arquitecto("luis", "46464333", 5454545, 546546);
        //listado de la empresa
        List<Empleados> listadoEmpresa = new ArrayList<>();
        listadoEmpresa.add(o1);
        listadoEmpresa.add(o2);
        listadoEmpresa.add(o3);
        listadoEmpresa.add(o4);
        listadoEmpresa.add(o5);
        listadoEmpresa.add(o6);
        listadoEmpresa.add(o7);
        listadoEmpresa.add(o8);
        listadoEmpresa.add(o9);
        listadoEmpresa.add(o10);
        listadoEmpresa.add(o11);
        listadoEmpresa.add(o12);
        listadoEmpresa.add(m1);
        listadoEmpresa.add(m2);
        listadoEmpresa.add(m3);
        listadoEmpresa.add(m4);
        listadoEmpresa.add(m5);
        listadoEmpresa.add(m6);
        listadoEmpresa.add(m7);
        listadoEmpresa.add(m8);
        listadoEmpresa.add(a1);
        listadoEmpresa.add(a2);
        listadoEmpresa.add(a3);
        //Obras
        //Lista De obra
        List<Empleados> Edomestica1 = new ArrayList<>();
        Edomestica1.add(o1);
        Edomestica1.add(o3);
        Edomestica1.add(o4);
        Edomestica1.add(o5);
        Edomestica1.add(a1);
        Edomestica1.add(m2);
        Edomestica1.add(m8);
        Domestica domestica = new Domestica("colon 9700", 100, 45, 45, Edomestica1, 4);
        List<Empleados> Ecomercio = new ArrayList<>();
        Ecomercio.add(o1);
        Ecomercio.add(o5);
        Ecomercio.add(o7);
        Ecomercio.add(o8);
        Ecomercio.add(o9);
        Ecomercio.add(a2);
        Ecomercio.add(m2);
        Comercio comercio = new Comercio("alem 4321", 50, 75, 80, Ecomercio, "lo de toto", "kiosko");
        List<Empleados> EHotel = new ArrayList<>();
        EHotel.add(o2);
        EHotel.add(o12);
        EHotel.add(o11);
        EHotel.add(o3);
        EHotel.add(o4);
        EHotel.add(m6);
        EHotel.add(a3);
        Hotel hotel = new Hotel("sarmiento 2502", 100, 1000, 200, EHotel, "san remo", 9);
        //Empresa
         //listado de obras
        List<Obra> listadoDeObras = new ArrayList<>();
        listadoDeObras.add((Obra) domestica);
        listadoDeObras.add((Obra) comercio);
        listadoDeObras.add((Obra) hotel);

        Empresa Atlas = new Empresa("atlas", listadoEmpresa, listadoDeObras);

        //front-end
        System.out.println("Que desea hacer?");
        System.out.println("\n1)ver acciones de cada tipo de empleados");
        System.out.println("\n2)Ver la empresa");
        System.out.println("\n3)obras y su costo");

        int opcion = 0;

        Scanner scan = new Scanner(System.in);


        opcion = scan.nextInt();
        switch (opcion) {
            case 1:

                System.out.println(o1.toString());
                System.out.println("\n" + o1.Construir());
                System.out.println(m1.toString());
                System.out.println("\n" + m1.Construir());
                System.out.println(a1.toString());
                System.out.println("\n" + a1.CrearPLanos());

                break;
            case 2:
                System.out.println(Atlas.toString());
                break;
            case 3:
                for (int i = 0; i < listadoDeObras.size(); i++) {

                    System.out.println(listadoDeObras.get(i).toString() + "\nCosto: " + listadoDeObras.get(i).CalcularCosto());

                }
                break;
        }
    }


}

