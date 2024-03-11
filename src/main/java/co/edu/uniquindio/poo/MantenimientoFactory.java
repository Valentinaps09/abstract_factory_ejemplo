package co.edu.uniquindio.poo;

public class MantenimientoFactory implements ServicioFactory{

    @Override
    public ServicioCuidadoResidencial creaServicio() {
        // TODO Auto-generated method stub
        return new ServicioReparacion();
    }

    
}
