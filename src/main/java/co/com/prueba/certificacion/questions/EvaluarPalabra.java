package co.com.prueba.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.prueba.certificacion.userinterfaces.PaginaTraductorGoogle.*;

//clase que retorna un string
public class EvaluarPalabra implements Question <String>{

    private String palabraFinal;

    public EvaluarPalabra(String palabraFinal) {
        this.palabraFinal = palabraFinal;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TEXTO_IDIOMA_FINAL.of(palabraFinal)).viewedBy(actor).asString();
    }

    public static EvaluarPalabra traduccion(String palabraFinal){
        return new EvaluarPalabra(palabraFinal);
    }

}
