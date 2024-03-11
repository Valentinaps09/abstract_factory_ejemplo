package co.edu.uniquindio.poo;

public class ServicioReparacion implements ServicioCuidadoResidencial{

    @Override
    public void asignarTrabajo() {
        System.out.println("El equipo de reparacion estara a cargo de este proyecto");
        
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Fecha limite 24/03/2024");
        
    }

    @Override
    public void informarSobrePago() {
        System.out.println("El valor puede variar si es grupal o individual");
        
    }

    
}
