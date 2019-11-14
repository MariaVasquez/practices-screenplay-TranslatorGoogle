package co.com.prueba.certificacion.models;

import co.com.prueba.certificacion.models.builders.UsuariosBuilders;

public class Usuarios {
    private String nombre;
    private String apellido;
    private String documento;
    private String telefono;
    private String edad;

    public Usuarios(UsuariosBuilders usuariosBuilder) {
        this.nombre = usuariosBuilder.getNombre();
        this.apellido = usuariosBuilder.getApellido();
        this.documento = usuariosBuilder.getDocumento();
        this.telefono = usuariosBuilder.getTelefono();
        this.edad = usuariosBuilder.getEdad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
