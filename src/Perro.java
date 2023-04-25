public class Perro extends Mascota {
    boolean Pulgas;
    boolean Muerde;
    

    public Perro(String nombre, int precio, boolean vacunamalota, String origen, byte vacunas, boolean Pulgas,boolean Muerde) {
        super(nombre, precio, vacunamalota, origen, vacunas);
        this.Pulgas = Pulgas;
    }
    public void obtain(){
        System.out.println("Perro");
    }
    public boolean isPulgas() {
        return Pulgas;
    }
    public void setPulgas(boolean pulgas) {
        Pulgas = pulgas;
    }
    public boolean isMuerde() {
        return Muerde;
    }
    public void setMuerde(boolean muerde) {
        Muerde = muerde;
    }
    
}
