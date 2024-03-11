package co.edu.uniquindio.poo;

public class ReparacionFactory implements ServicioFactory{

    @Override
    public ServicioCuidadoResidencial creaServicio() {
        return new ServicioReparacion();
    }
    
}
