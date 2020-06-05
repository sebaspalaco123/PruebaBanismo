package com.banistmo.www.tasks;

import com.banistmo.www.user_interfaces.CiberSeguridad;
import com.banistmo.www.user_interfaces.HomeAprenderFacil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.pages.PageObject;


public class SeleccionarOpcion implements Task {

     public SeleccionarOpcion() {
        super();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeAprenderFacil.CIBER_SEGURIDAD),
                Click.on(CiberSeguridad.VER_MAS_ACTIVOS));
    }

    public static SeleccionarOpcion seleccionarOpcion() {
        return Tasks.instrumented(SeleccionarOpcion.class);
    }
}
