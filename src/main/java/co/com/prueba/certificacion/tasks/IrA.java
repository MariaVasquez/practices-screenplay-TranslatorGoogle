
package co.com.prueba.certificacion.tasks;

//mejorar las líneas de código
import static co.com.prueba.certificacion.userinterfaces.PaginaPrincipalGoogle.*;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.WebDriver;

public class IrA implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(APLICACIONES_GOOGLE));
        WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
        driver.switchTo().frame(0);
        actor.attemptsTo(Click.on(TRADUCTOR_GOOGLE));
        driver.switchTo().parentFrame();

    }

    public static IrA traductorGoogle() {
        return Tasks.instrumented(IrA.class);
    }
}
