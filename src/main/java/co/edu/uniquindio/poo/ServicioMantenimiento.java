package co.edu.uniquindio.poo;

public class ServicioMantenimiento implements ServicioCuidadoResidencial {

    @Override
    public void asignarTrabajo() {
        System.out.println("El equipo de mantenimiento estara a cargo de este proyecto");
        
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Fecha Limite 24/03/2024");
        
    }

    @Override
    public void informarSobrePago() {
        System.out.println("El valor puede variar dependiendo la dificultad del costo de los materiales, herramientas e instrumentos utilizados");
        
    }
    
    
}
