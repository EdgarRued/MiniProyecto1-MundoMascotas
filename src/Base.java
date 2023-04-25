import java.lang.reflect.GenericArrayType;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.Scanner;
public class Base {
    static ArrayList<Mascota> Mascotas= new ArrayList<Mascota>();
        static byte decision;


    public void AñadirMascota(){
        System.out.flush();
        System.out.println("Que mascota desea añadir?");
                System.out.println("1. Gato");
                System.out.println("2. Perro");
                Scanner input2= new Scanner(System.in);
                System.out.print("R: ");
                decision = input2.nextByte();
                if (decision==1){
                    Scanner i1,i2,i3,i4,i5,i6;
                    i1= new Scanner(System.in);
                    i2= new Scanner(System.in);
                    i3= new Scanner(System.in);
                    i4= new Scanner(System.in);
                    i5= new Scanner(System.in);
                    i6= new Scanner(System.in);
                    System.out.println("--Digite la informacion-- ");
                    System.out.print("Nombre: ");
                    String nombre = i1.nextLine();
                    System.out.print("Precio: ");
                    int precio = i2.nextInt();
                    System.out.print("Vacuna malota aplicada?...Si/No: ");

                    String vacunamalota = i3.nextLine();
                    boolean vmalota=true;
                    if (vacunamalota=="Si"){
                            vmalota = true;
                    }else if (vacunamalota=="No"){
                            vmalota = false;
                    }
                    
                    System.out.print("Origen: ");
                    String origen = i4.nextLine();
                    System.out.print("Su gato tiene garras?... Si/No: ");
                    String garras = i5.nextLine();
                    boolean grra = true;
                    if (garras=="Si"){
                        grra=true;
                    }else if(garras=="No"){
                        grra=false;
                    }

                    System.out.println("Vacunas aplicadas: ");
                    byte vacunas = i6.nextByte();
                    Gato gatito = new Gato(nombre,precio,vmalota,origen,vacunas,grra);
                    Mascotas.add(gatito);
                }
                else if (decision==2){
                    Scanner i1,i2,i3,i4,i5,i6,i7;
                    i1= new Scanner(System.in);
                    i2= new Scanner(System.in);
                    i3= new Scanner(System.in);
                    i4= new Scanner(System.in);
                    i5= new Scanner(System.in);
                    i6= new Scanner(System.in);
                    i7= new Scanner(System.in);
                    System.out.println("--Digite la informacion--");
                    System.out.print("Nombre: ");
                    String nombre = i1.nextLine();
                    System.out.print("Precio: ");
                    int precio = i2.nextInt();
                    System.out.print("Vacuna malota aplicada?...Si/No: ");
                    String vacunamalota = i3.nextLine();
                    boolean vmalota=true;
                    if (vacunamalota=="Si"){
                        vmalota=true;
                    }else if(vacunamalota=="No"){
                        vmalota=false;
                    }
                    System.out.print("Origen: ");
                    String origen = i4.nextLine();
                    System.out.print("Tiene pulgas?... Si/No: ");
                    String Pulgas = i5.nextLine();
                    boolean plg=true;
                    if(Pulgas=="Si"){
                        plg=true;
                    }else if(Pulgas=="No"){
                        plg=false;
                    }
                    System.out.print("Vacunas aplicadas: ");
                    byte vacunas = i6.nextByte();
                    System.out.print("Muerde?...Si/No:");
                    String muerde = i7.nextLine();
                    Boolean mrd = true;
                    if(muerde=="Si"){
                        mrd=true;
                    }else if(muerde=="No"){
                        mrd=false;
                    }
                    Perro perrito = new Perro(nombre,precio,vmalota,origen,vacunas,plg,mrd);
                    Mascotas.add(perrito);
                } else{
                    System.out.println("error... intentelo de nuevo");
                }
        
                
    }

    
    public void Listar(){
        System.out.flush();
        System.out.println("Lista de mascotas: ");

        for(int i = 0; i < Mascotas.size(); i++){
            System.out.println("===================================");
        if(Mascotas.get(i) instanceof Perro){

            Perro pulgas = ((Perro)Mascotas.get(i));
            System.out.println("Nombre: " +pulgas.getNombre());

            System.out.println("Precio: "+pulgas.getPrecio());
            String mensaje,mensaje2,msg;
            if (pulgas.isPulgas()==true){
                mensaje="Si";
            }else{
                mensaje="No";
            }
            
            System.out.println("El perro presenta pulgas: "+ mensaje);

            if (pulgas.isMuerde()==true){
                mensaje2="Si";
            }else{
                mensaje2="No";
            }

            if (pulgas.isVacunaMalota()==true){
                msg="Si";
            }else{
                msg="No";
            }
            
            System.out.println("Muerde: "+ mensaje2);;

        
            


            System.out.println("Origen: "+pulgas.getOrigen());
            System.out.println("Vacunas Aplicadas"+pulgas.getVacunas());
            
            System.out.println("Vacuna Malota:"+msg);
            
            
            
        
        
        

    } else if (Mascotas.get(i) instanceof Gato ){
        String msg,ms1;
        Gato garras= ((Gato)Mascotas.get(i));
        System.out.println("Nombre: "+garras.getNombre());
        System.out.println("Precio: "+garras.getPrecio());
           if (garras.isGarras()==true){
                msg = "Si";
           }else{
                msg = "No";
           }
        System.out.println("Garras: "+garras.isGarras());   
        System.out.println("Vacuna Malota: "+garras.isVacunaMalota());
        System.out.println("Origen: "+garras.getOrigen());
        System.out.println("Vacunas Aplicadas: "+garras.getVacunas());
        System.out.println("===================================");

        
    }}
        
        /*int i=0;
        while ( i<Mascotas.size()){
            i++;
            System.out.println("mascota N°"+ (i+1));
            if(Mascotas.get(i) instanceof Perro){

                Perro pulgas = ((Perro)Mascotas.get(i));
                System.out.println("Nombre: " +pulgas.getNombre());

                System.out.println("Precio: "+pulgas.getPrecio());
                String mensaje,mensaje2,msg;
                if (pulgas.isPulgas()==true){
                    mensaje="Si";
                }else{
                    mensaje="No";
                }
                
                System.out.println("El perro presenta pulgas: "+ mensaje);

                if (pulgas.isMuerde()==true){
                    mensaje2="Si";
                }else{
                    mensaje2="No";
                }

                if (pulgas.isVacunaMalota()==true){
                    msg="Si";
                }else{
                    msg="No";
                }
                
                System.out.println("Muerde: "+ mensaje2);;

            
                


                System.out.println("Origen: "+pulgas.getOrigen());
                System.out.println("Vacunas Aplicadas"+pulgas.getVacunas());
                
                System.out.println("Vacuna Malota:"+msg);
                
                
                
            
            
            

        } else if (Mascotas.get(i) instanceof Gato ){
            String msg,ms1;
            Gato garras= ((Gato)Mascotas.get(i));
            System.out.println("Nombre: "+garras.getNombre());
            System.out.println("Precio: "+garras.getPrecio());
               if (garras.isGarras()==true){
                    msg = "Si";
               }else{
                    msg = "No";
               }
            System.out.println("Garras: "+garras.isGarras());   
            System.out.println("Vacuna Malota: "+garras.isVacunaMalota());
            System.out.println("Origen: "+garras.getOrigen());
            System.out.println("Vacunas Aplicadas: "+garras.getVacunas());
            
            
            
        }*/
        System.out.println("===========================");
        
        }


  
    }
    

