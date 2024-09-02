package org.example.estructurales.facade;

import org.example.estructurales.adapter.TransferenciasBancarias;

public class EntradasFacade {
    private ReservaDeTickets reserva;
    private VerificadorDeAsientos verificador;
    private TransferenciasBancarias procesador;
    public EntradasFacade() {
        reserva = new ReservaDeTickets();
        verificador = new VerificadorDeAsientos();
        procesador = new TransferenciasBancarias("BBVA");
    }

    public void comprarEntradas(String cliente,double valor){
        verificador.buscarAsientosDisponibles();
        reserva.reservarTicket();
        procesador.ejecutarTransaccion(cliente,valor);
    }
}
