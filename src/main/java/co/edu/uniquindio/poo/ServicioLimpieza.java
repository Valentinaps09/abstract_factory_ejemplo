package co.edu.uniquindio.poo;

public class ServicioLimpieza implements ServicioCuidadoResidencial{

    @Override
    public void asignarTrabajo() {
        System.out.println("El equipo de de limpieza estara a cargo de este proyecto");
        
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Fecha limite de 24/03/2024" );
        
    }

    @Override
    public void informarSobrePago() {
        System.out.println("El costo puede varias dependiendo el tamaño de la locacion" );
        
    }
    
    
}
