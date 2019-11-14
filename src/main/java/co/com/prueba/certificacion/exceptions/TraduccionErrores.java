package co.com.prueba.certificacion.exceptions;

public class TraduccionErrores extends AssertionError{
    public TraduccionErrores (String mensaje, Throwable causa){
        super(mensaje,causa);
    }
}
