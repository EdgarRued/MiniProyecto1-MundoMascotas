public class Mascota {
    String nombre;
    int precio;
    byte vacunas;
    boolean vacunamalota;
    String origen;

    public Mascota(String nombre, int precio, boolean vacunamalota, String origen, byte vacunas) {
        this.precio = precio;
        this.vacunamalota = vacunamalota;
        this.origen = origen;
        this.nombre = nombre;
        this.vacunas = vacunas;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public boolean isVacunaMalota() {
        return vacunamalota;
    }
    public void setVacuna(boolean vacunamalota) {
        this.vacunamalota = vacunamalota;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public byte getVacunas() {
        return vacunas;
    }
    public void setVacunas(byte vacunas) {
        this.vacunas = vacunas;
    }
}