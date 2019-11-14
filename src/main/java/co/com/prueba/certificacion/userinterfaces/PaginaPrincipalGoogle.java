package co.com.prueba.certificacion.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipalGoogle {
    public static final Target APLICACIONES_GOOGLE = Target.the("El botón de google Apps")
            .located(By.id("gbwa"));
    public static final Target TRADUCTOR_GOOGLE = Target.the("Boton de traductor de Google").located(By.xpath("//span[@class='Rq5Gcb' and contains(.,'Traductor')]"));
}
