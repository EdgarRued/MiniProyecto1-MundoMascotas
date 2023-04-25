public class Gato extends Mascota {
    boolean garras;
    
    
    

    public Gato(String nombre, int precio, boolean vacunamalota, String origen, byte vacunas, boolean garras) {
        super(nombre, precio, vacunamalota, origen, vacunas);
        this.garras = garras;
    }

    public void obtener(){
        System.out.println("Gato");
    }

    public boolean isGarras() {
        return garras;
    }

    public void setGarras(boolean garras) {
        this.garras = garras;
    }
    
}
