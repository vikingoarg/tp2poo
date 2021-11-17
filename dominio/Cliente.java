package dominio;



public class Cliente {

    private int dni;
    private String nombre;
    private String apellido;
    private String tipoContribuyente;


    public Cliente(int dni, String nombre, String apellido, String tipoContribuyente) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoContribuyente = tipoContribuyente;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTipoContribuyente() {
        return tipoContribuyente;
    }




    
    


}
