package co.edu.uniquindio.poo;

public class LimpiezaFactory implements ServicioFactory{

    @Override
    public ServicioCuidadoResidencial creaServicio() {
        // TODO Auto-generated method stub
        return new ServicioLimpieza();
    }


    
}
