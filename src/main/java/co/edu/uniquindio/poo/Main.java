package co.edu.uniquindio.poo;

import java.util.Scanner;
public class Main {
   
        
    public static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int eleccion;
        do{
            eleccion = preguntarServicio();
            switch (eleccion) {
                case 1:
                    usarServicio(new LimpiezaFactory());
                    break;
                case 2:
                    usarServicio (new MantenimientoFactory());
                    break;
                case 3: 
                    usarServicio ( new ReparacionFactory());
                    break;
                case 4:
                    System.out.println("Cerrando programa.");
                    break;
                default:
                    System.out.println("Seleccione una opción valida.");        
            }
            System.out.println("\n");        
        }
        while (eleccion != 4);
    }

    public static void usarServicio(ServicioFactory factory){
        ServicioCuidadoResidencial servicio = factory.creaServicio();
        servicio.asignarTrabajo();
        servicio.indicarFechaEntrega();
        servicio.informarSobrePago();
    }

    public static int preguntarServicio(){
        System.out.println(
            "Menú opciones\n"

            + "1.Solicitar Servicio de Limpieza\n"
            + "2.Solicitar Servicio de Mantenimiento\n"
            + "3.Solicitar Servicio de Reparacion\n"
            + "4.Cerrar programa\n"
            + "Seleccione opcion: "
        );
        return  Integer.parseInt(S.nextLine());
    }
}

