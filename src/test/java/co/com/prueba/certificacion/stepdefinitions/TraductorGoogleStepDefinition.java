package co.com.prueba.certificacion.stepdefinitions;

import co.com.prueba.certificacion.exceptions.TraduccionErrores;
import co.com.prueba.certificacion.models.Usuarios;
import co.com.prueba.certificacion.models.builders.UsuariosBuilders;
import co.com.prueba.certificacion.questions.EvaluarPalabra;
import co.com.prueba.certificacion.tasks.IrA;
import co.com.prueba.certificacion.tasks.Traducir;
import co.com.prueba.certificacion.utils.drivers.MyChromeDriver;
import co.com.prueba.certificacion.utils.drivers.constantes.MensajesError;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.hamcrest.Matchers;

public class TraductorGoogleStepDefinition {

    private Actor maria;

    @Dado("^que (.*) se encuentra en el traductor de google$")
    public void queSeEncuentraEnElTraductorDeGoogle(String nombre) {
        maria = Actor.named(nombre);
        maria.can(BrowseTheWeb.with(MyChromeDriver.web().inUrl("https://www.google.com/")));
        maria.wasAbleTo(IrA.traductorGoogle());
    }

    @Cuando("^ella traduce la palabra \"([^\"]*)\" del español al inglés$")
    public void ellaTraduceLaPalabraDelEspañolAlInglés(String palabraInicial) {
        maria.wasAbleTo(Traducir.palabra(palabraInicial));
    }

    @Entonces("^ella puede ver la palabra \"([^\"]*)\" en la pantalla$")
    public void ellaPuedeVerLaPalabraEnLaPantalla(String palabraFinal) {
        maria.should(GivenWhenThen.seeThat(EvaluarPalabra.traduccion(palabraFinal), Matchers.equalTo("hfbvbv"))
                .orComplainWith(TraduccionErrores.class, MensajesError.MENSAJE_ERROR)
        );
    }

    @Cuando("^el usuario puede ejecutar un modelo$")
    public void elUsuarioPuedeEjecutarUnModelo()  {
        Usuarios maria = new Usuarios(UsuariosBuilders.usuario().conNombre("Maria").conApellido("Vasquez").conEdad("21"));
    }

}
