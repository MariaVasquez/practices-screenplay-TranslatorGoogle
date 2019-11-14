package co.com.prueba.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static co.com.prueba.certificacion.userinterfaces.PaginaTraductorGoogle.*;

public class Traducir implements Task {
    private String palabraInicial;

    public Traducir(String palabraInicial) {
        this.palabraInicial = palabraInicial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IDIOMA_INICIAL),
                Click.on(SELECCIONAR_IDIOMA_INICIAL),
                Click.on(IDIOMA_FINAL),
                Click.on(SELECCIONAR_IDIOMA_FINAL),
                Enter.theValue(palabraInicial).into(TEXTO_IDIOMA_INICIAL)
        );
    }

    public static Traducir palabra(String palabrainicial) {
        return Tasks.instrumented(Traducir.class, palabrainicial);
    }
}
