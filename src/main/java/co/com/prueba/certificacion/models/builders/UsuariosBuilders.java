package co.com.prueba.certificacion.models.builders;

import co.com.prueba.certificacion.models.Usuarios;
import co.com.prueba.certificacion.utils.drivers.Builder;

public class UsuariosBuilders implements Builder<Usuarios>{
    private String nombre;
    private String apellido;
    private String documento;
    private String telefono;

    private String edad;

    public UsuariosBuilders() {
        this.nombre = "";
        this.apellido = "";
        this.documento = "";
        this.telefono = "";
        this.edad = "";
    }

    public static UsuariosBuilders usuario(){
        return  new UsuariosBuilders();
    }

    //sobrecarga
    public  UsuariosBuilders conNombre(String nombre){
        this.nombre = nombre;
        return  this;
    }

    public  UsuariosBuilders conApellido(String apellido){
        this.apellido = apellido;
        return  this;
    }

    public  UsuariosBuilders conDocumento(String documento){
        this.documento = documento;
        return  this;
    }

    public  UsuariosBuilders conTelefono(String telefono){
        this.telefono = telefono;
        return  this;
    }

    public  UsuariosBuilders conEdad(String edad){
        this.edad = edad;
        return  this;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEdad() {
        return edad;
    }

    @Override
    public Usuarios buil() {
        return new Usuarios(this);
    }
}
