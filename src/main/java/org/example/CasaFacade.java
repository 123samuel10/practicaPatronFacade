package org.example;

public class CasaFacade {
    private SistemaDeIluminacion iluminacion;
    private SistemaDeClimatizacion climatizacion;
    private SistemaDeSeguridad seguridad;
    private SistemaDeEntretenimiento entretenimiento;  // Nuevo sistema

    public CasaFacade() {
        this.iluminacion = new SistemaDeIluminacion();
        this.climatizacion = new SistemaDeClimatizacion();
        this.seguridad = new SistemaDeSeguridad();
        this.entretenimiento = new SistemaDeEntretenimiento(); // Inicializamos el nuevo sistema
    }

    public void modoNoche() {
        iluminacion.apagarLuces();
        climatizacion.encenderAireAcondicionado();
        seguridad.activarSistema();
        entretenimiento.apagarTelevisor();  // Apagar el televisor en modo noche
        System.out.println("Modo noche activado.");
    }

    public void modoDia() {
        iluminacion.encenderLuces();
        climatizacion.apagarAireAcondicionado();
        seguridad.desactivarSistema();
        entretenimiento.encenderTelevisor();  // Encender el televisor en modo día
        System.out.println("Modo día activado.");
    }
}
