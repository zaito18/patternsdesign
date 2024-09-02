package org.example.estructurales.facade;

public class EntradasFacade {
    private ReservaDeTickets reserva;
    private VerificadorDeAsientos verificador;
    public EntradasFacade() {
        reserva = new ReservaDeTickets();
        verificador = new VerificadorDeAsientos();
    }

    public void comprarEntradas(String cliente,double valor){
        verificador.buscarAsientosDisponibles();
        reserva.reservarTicket();
    }
}
