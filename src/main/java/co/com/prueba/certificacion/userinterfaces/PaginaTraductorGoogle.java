package co.com.prueba.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaTraductorGoogle {
    public static final Target IDIOMA_INICIAL = Target.the("Botón idioma Fuente")
            .locatedBy("//div[@class='sl-more tlid-open-source-language-list']");
    public static final Target SELECCIONAR_IDIOMA_INICIAL = Target.the("seleccionar idioma inicial")
            .locatedBy("//div[@class='language_list_item_icon sl_list_es_checkmark']/following-sibling::div");
    public static final Target IDIOMA_FINAL = Target.the("boton seleccionar idioma final")
            .locatedBy("//div[@class='tl-more tlid-open-target-language-list']");
    public static final Target SELECCIONAR_IDIOMA_FINAL = Target.the("seleccionar idioma final")
            .locatedBy("//div[@class='language_list_item_icon tl_list_en_checkmark']/following-sibling::div");
    public static final Target TEXTO_IDIOMA_INICIAL = Target.the("Ingresar palabra inicial")
            .located(By.id("source"));
    public static final Target TEXTO_IDIOMA_FINAL = Target.the("Verificar palabra final")
            .locatedBy("//span[@class='tlid-translation translation']/span[text()='{0}']");
}
