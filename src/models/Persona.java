package models;


public class Persona {
    private Integer id;
    private PersonaGenero personaGeneroId;
    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer usuario;
    private Integer contraseña;

    public Persona(Integer id, PersonaGenero personaGeneroId, String nombre, String apellido, Integer dni) {
        this.id = id;
        this.personaGeneroId = personaGeneroId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Persona(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonaGenero getPersonaGeneroId() {
        return personaGeneroId;
    }

    public void setPersonaGeneroId(PersonaGenero personaGeneroId) {
        this.personaGeneroId = personaGeneroId;
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

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Integer getContraseña() {
        return contraseña;
    }

    public void setContraseña(Integer contraseña) {
        this.contraseña = contraseña;
    }

    public void add(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
