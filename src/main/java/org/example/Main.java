package org.example;

import org.example.comportamiento.observer.DiarioClarin;
import org.example.comportamiento.observer.SubcritorDiario;
import org.example.comportamiento.strategy.strategies.EstrategiaDePago;
import org.example.comportamiento.strategy.strategies.PagarConPaypal;
import org.example.comportamiento.strategy.strategies.PagarConTarjetaDeCredito;
import org.example.comportamiento.strategy.strategies.Pedido;
import org.example.creacionales.builder.Pizza;
import org.example.creacionales.builder.PizzaBuilder;
import org.example.creacionales.factoryMethod.factories.AutoFactory;
import org.example.creacionales.factoryMethod.factories.VehiculoFactory;
import org.example.creacionales.factoryMethod.impl.Auto;
import org.example.creacionales.factoryMethod.impl.Moto;
import org.example.creacionales.factoryMethod.interfaces.Vehiculo;
import org.example.creacionales.singleton.AppConfig;
import org.example.estructurales.adapter.PosnetAdapter;
import org.example.estructurales.adapter.ProcesadorDePago;
import org.example.estructurales.adapter.TransferenciasBancarias;
import org.example.estructurales.decorator.AzucarDecorator;
import org.example.estructurales.decorator.Bebida;
import org.example.estructurales.decorator.Cafe;
import org.example.estructurales.decorator.LecheDecorator;
import org.example.estructurales.facade.EntradasFacade;
import org.example.estructurales.facade.ReservaDeTickets;
import org.example.estructurales.facade.VerificadorDeAsientos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static EstrategiaDePago estrategiaDePago;
    private static Pedido pedido = new Pedido();

    public static void main(String[] args) throws IOException {


        //singleton();

        //factoryMethod();

        //Builder();

        //adapter();

        //decorator();

        //facade();

        //observer();

        //strategy();


    }

    private static void strategy() throws IOException {
        System.out.print("seleccione medio de pago >>");
        int opcion = Integer.parseInt(reader.readLine());

        if(opcion == 1) {
            estrategiaDePago = new PagarConPaypal();
        }else{
            estrategiaDePago = new PagarConTarjetaDeCredito();
        }
        pedido.setEstrategia(estrategiaDePago);
        pedido.confirmacion(3000);
    }

    private static void observer() {
        DiarioClarin diarioClarin = new DiarioClarin();

        SubcritorDiario subcritorDiario1 = new SubcritorDiario("ivan");
        SubcritorDiario subcritorDiario2 = new SubcritorDiario("gonza");

        diarioClarin.registrarObservador(subcritorDiario1);
        diarioClarin.registrarObservador(subcritorDiario2);

        diarioClarin.publicarNoticia("El dolar aumento drasticamente");
    }

    private static void facade(){

        // Clase para gestionar asientos
        VerificadorDeAsientos verificadorDeAsientos = new VerificadorDeAsientos ();
        verificadorDeAsientos.buscarAsientosDisponibles();

        // Clase para reservar el ticket
        ReservaDeTickets reservation = new ReservaDeTickets();
        reservation.reservarTicket();

        // Clase para procesar el pago
        ProcesadorDePago paymentProcessor = new TransferenciasBancarias("SANTANDER");
        paymentProcessor.ejecutarTransaccion("gonza",5000);

        EntradasFacade entradasFacade = new EntradasFacade();
        entradasFacade.comprarEntradas("gonza",5000);

    }

    private static void Builder() {
        //sirve para armar un objeto si nla necesidad de conocer el orden de los argumentos del constructor,a demas de que podemos definir exactamente
        //como queremos armar el objeto
        Pizza pizza  = new PizzaBuilder().agregarPepperoni().agregarQueso().agregarBacon().seleccionarTamanio("XL").build();

        System.out.println(pizza);
    }

    private static void adapter() {

    }

    private static void decorator() {
        //PATRON DECORATOR
        // Crear una bebida simple: un café
        Bebida cafe = new Cafe();
        System.out.println(cafe.getDescription() + " cuesta $" + cafe.getPrice());

        // Añadir leche al café
        Bebida cafeConLeche = new LecheDecorator(cafe);
        System.out.println(cafeConLeche.getDescription() + " cuesta $" + cafeConLeche.getPrice());

        //Aniado azucar

        Bebida cafeConLecheYAzucar = new AzucarDecorator(cafeConLeche);
        System.out.println(cafeConLecheYAzucar.getDescription() + " cuesta $" + cafeConLecheYAzucar.getPrice());
    }

    private static void problemaSinFactory(String vehiculoACrear){
        Vehiculo vehiculo =  null ;
            if("AUTO".equals(vehiculoACrear)){
                vehiculo=new Auto();
            }else if ("MOTO".equals(vehiculoACrear)){
                vehiculo=new Moto();
            }
         vehiculo.probar();

    }


    private static void factoryMethod() {

        VehiculoFactory vehiculoFactory = new AutoFactory();
        vehiculoFactory.comprarVehiculo();

    }

    private static void singleton() {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();
        if (config1 == config2) {
            System.out.println("¡La configuración de la aplicación es un Singleton! Ambas referencias apuntan al mismo objeto.");
        }
    }

}