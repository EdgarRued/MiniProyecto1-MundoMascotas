import java.lang.reflect.GenericArrayType;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.text.AbstractDocument.LeafElement;
public class Base {
    
    
    static ArrayList<Mascota> Mascotas= new ArrayList<Mascota>();
    Scanner general = new Scanner(System.in);
        static byte decision;
        static byte contMascotas=0;


    public void AñadirMascota(){
        System.out.flush();
        System.out.println("Que mascota desea añadir?");
                System.out.println("1. Gato");
                System.out.println("2. Perro");
                Scanner input2= new Scanner(System.in);
                System.out.print("R: ");
                decision = general.nextByte();
                clearscreen();
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
                    System.out.print("Origen: ");
                    String origen= i3.nextLine();
                    System.out.print("Vacunas Aplicadas: ");
                    Byte vacunas=i4.nextByte();
                    System.out.print("Vacuna malota aplicada?...Si==1/No==2: ");
                    Boolean vaccineValue ;
                    byte vm;
                    vm = i5.nextByte();
                    if (vm==1){
                        vaccineValue=true;
                    }
                    else{
                    vaccineValue=false;
                    }
                    System.out.print("Su gato tiene garras?...Si=1 / no=2: ");
                    Boolean newGarras;
                    byte vm2;
                    vm2= i6.nextByte();
                    if (vm2==1){
                        newGarras=true;
                    }
                    else{
                        newGarras=false;
                    }


                    System.out.println("====================================");
                    // 1 para si
                    // 2 para 20
                    String root;
                    System.out.print("Mascota agregada correctamente...digite cualquier tecla para continuar...:");
                    
                    root= i3.nextLine();
                    contMascotas++;
            
                    Gato gatito = new Gato(nombre,precio,vaccineValue,origen,vacunas,newGarras);
                    
                    
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
                    System.out.print("Origen: ");
                    String origen = i3.nextLine();
                    System.out.print("Vacunas Aplicadas: ");
                    byte vacunas = i4.nextByte();
                    System.out.print("Vacuna Malota aplicada?... Si=1 / No=2: ");
                    Boolean vmalota;
                    byte des=i5.nextByte();
                    if(des==1){
                        vmalota=true;
                    }else{
                        vmalota=false;
                    }


                    System.out.print("Tiene pulgas?... Si=1 / No=2: ");
                    Boolean plg;
                    
                    Byte Pulgas = i6.nextByte();
                    if(Pulgas==1){
                        plg=true;
                    }else{
                        plg=false;
                    }
                    
                    
                    
                    
                    System.out.print("Muerde?...Si=1 / No=2: ");
                    Boolean mrde;
                    byte des2=i7.nextByte();
                    if(des2==1){
                        mrde=true;
                    }else{
                        mrde=false;
                    }
                    System.out.println("==============================================");
                    String bil;
                    System.out.print("Mascota agregada correctamente...digite cualquier tecla para continuar...:");
                    bil=i1.nextLine();
                    contMascotas++;
                    Perro perrito = new Perro(nombre,precio,vmalota,origen,vacunas,plg,mrde);
                    Mascotas.add(perrito);
                } else{
                    System.out.println("error... intentelo de nuevo");
                }
                clearscreen();
        
                
    }

    
    public void Listar(){
        if(contMascotas!=0){
        Scanner control=new Scanner(System.in);
        System.out.flush();
        System.out.println("Lista de mascotas: ");

        for(int i = 0; i < Mascotas.size(); i++){
            System.out.println("=====================");
            System.out.println("Mascota N°"+(i+1));
            System.out.println("=====================");
        if(Mascotas.get(i) instanceof Perro){
            Scanner controller= new Scanner(System.in);

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
            
            System.out.println("Muerde: "+ mensaje2);
            System.out.println("Origen: "+pulgas.getOrigen());
            System.out.println("Vacunas Aplicadas: "+pulgas.getVacunas());
            
            System.out.println("Vacuna Malota: "+msg);
            System.out.println("=====================");
            System.out.println("- - - - - - - - - - - - - - - - - -");
            if(i<=Mascotas.size()){
            System.out.print("introduzca cualquier digito para ver la siguiente mascota...");
            String p= controller.nextLine();}
            clearscreen();
        } else if (Mascotas.get(i) instanceof Gato ){
        String msg,ms1;
        Scanner controller= new Scanner(System.in);
        Gato garras= ((Gato)Mascotas.get(i));
        System.out.println("Nombre: "+garras.getNombre());
        System.out.println("Precio: "+garras.getPrecio());
           if (garras.isGarras()==true){
                msg = "Si";
           }else{
                msg = "No";
           }

           if(garras.isVacunaMalota()==true){
                ms1 = "Si";
           }else{
                ms1 = "No";
           }

        System.out.println("Garras: "+msg);   
        System.out.println("Vacuna Malota: "+ms1);
        System.out.println("Origen: "+garras.getOrigen());
        System.out.println("Vacunas Aplicadas: "+garras.getVacunas());
        System.out.println("===================================");
        System.out.println("- - - - - - - - - - - - - - - - - -");
        
           if(i<=Mascotas.size()){
        System.out.print("introduzca cualquier digito para ver la siguiente mascota...");
        String p= controller.nextLine();
            }
        }
    }
    clearscreen();
    System.out.print("No hay mas mascotas, Digite cualquier letra para continuar...");
    String ctrl=control.nextLine();
    ctrl=null;
    clearscreen();
}else if(contMascotas==0){
    System.out.println("No hay mascotas en la lista...presione e ingrese cualquier tecla para continuar");
    Scanner pip=new Scanner(System.in);
    String pep = pip.nextLine(); 
}
        
}

    public void BuscarMascota(String name){
        clearscreen();
        boolean encontro=false;
        System.out.println("=========================");
        for (int i=0; i<Mascotas.size();i++){
            String nom;
            nom = Mascotas.get(i).getNombre();
            
                
                if(name.equals(nom)){
                    encontro=true;
                    System.out.println("Nombre a buscar: "+name);
                    System.out.println("========================");
                    String ms1;
                    System.out.println("Nombre: "+nom);
                    System.out.println("Precio: "+Mascotas.get(i).getPrecio());
                    if(Mascotas.get(i).isVacunaMalota()==true){
                        ms1="Si";
                    }else{
                        ms1="No";
                    }
                    System.out.println("Vacunas Aplicadas: "+Mascotas.get(i).getVacunas());
                    System.out.println("Origen: "+Mascotas.get(i).getOrigen());
                    System.out.println("Vacuna Malota aplicada?: "+ms1);
                    if (Mascotas.get(i) instanceof Perro){
                        String ms,ms3;
                        Perro perro= ((Perro)Mascotas.get(i));
                        if (perro.isPulgas()==true){
                            ms="Si";
                        }else{
                            ms="No";
                        }
                        if(perro.isMuerde()==true){
                            ms3="Si";
                        }else{
                            ms3="No";

                        }
                        System.out.println("Muerde: "+ms3);
                        System.out.println("El perro presenta pulgas: "+ms);
                    
                    }else if(Mascotas.get(i) instanceof Gato){
                        String m;
                        Gato gato=((Gato)Mascotas.get(i));
                        if(gato.isGarras()==true){
                            m="Si";
                        }else{
                            m="No";
                        }
                        System.out.println("Garras: "+m);

                    }
                    System.out.println("=========================");
                    Scanner p=new Scanner(System.in);
                    System.out.println("Digite cualquier letra para continuar... ");
                    String a= p.nextLine();
                    

                
                }
                
            }
            if (encontro==false){
                System.out.println("No se encontro ninguna mascota relacionada con ese nombre..");
                System.out.println("                       <>                             ");
                System.out.print("Digite cualquier tecla para continuar...");
                Scanner ip=new Scanner(System.in);
                String imp= ip.nextLine();
            }
            clearscreen();
        }
        /*for(int j=0; j<Mascotas.size();j++){
            String nom1;
            if(Mascotas.get(j) instanceof Perro){
                
                
                nom1 = Mascotas.get(j).getNombre();
                if(name!=nom1){
                    Perro CastPerro= ((Perro)Mascotas.get(j));
                    Scanner control=new Scanner(System.in);
                    System.out.println("============================");
                    System.out.println("Nombre Asociado: "+name);
                    System.out.println("Precio: "+CastPerro.getPrecio());
                    String mensaje,mensaje2,msg;
                    if (CastPerro.isPulgas()==true){
                        mensaje="Si";
                    }else{
                        mensaje="No";
                    }
                    
                    System.out.println("El perro presenta pulgas: "+ mensaje);
        
                    if (CastPerro.isMuerde()==true){
                        mensaje2="Si";
                    }else{
                        mensaje2="No";
                    }
        
                    if (CastPerro.isVacunaMalota()==true){
                        msg="Si";
                    }else{
                        msg="No";
                    }
                    
                    System.out.println("Muerde: "+ mensaje2);
                    System.out.println("Origen: "+CastPerro.getOrigen());
                    System.out.println("Vacunas Aplicadas: "+CastPerro.getVacunas());
                    
                    System.out.println("Vacuna Malota:"+msg);
                    
                    System.out.print("Digite cualquier letra para continuar...");
                    String ctrl=control.nextLine();
                    ctrl=null;
                    break;
                    
                
                

            }*/
        public void Actualizar(){
            if(contMascotas!=0){
            clearscreen();
            Scanner capturar,num,num2;
            capturar= new Scanner(System.in);
            num = new Scanner(System.in);
            num2 = new Scanner(System.in);
            
            System.out.println("mostrando lista para actualizar...");
            Listar();
            
            System.out.println("¿desea ver la lista de nuevo?... ");
            System.out.println("1.Si, no vi que mascota queria actualizar");
            System.out.println("2.No, ya se que mascota deseo actualizar");
            System.out.print("ingrese el numero asociado a su respuesta--> ");
            Byte number= num2.nextByte();
            clearscreen();
            if(number==1){
                preguntar();
            }else if(number==2){
            
            System.out.println("ingrese el N° de la mascota que desea actualizar: ");
            int capt= capturar.nextInt();
             clearscreen();
            
        
        System.out.println("¿Que dato desea actualizar?");
        System.out.println("1.Nombre");
        System.out.println("2.Precio");
        System.out.println("3.Vacunas");
        System.out.println("4.Origen");
        System.out.println("5.VacunaMalota");

        capt=capt-1;
        if (Mascotas.get(capt) instanceof Perro){
            Scanner f1;
            f1=new Scanner(System.in);
            Perro castinP= ((Perro)Mascotas.get(capt));
            System.out.println("6.Muerde");
            System.out.println("7.Tiene pulgas");
            System.out.print("Ingrese un numero de opcion: ");
            int option=num.nextInt();
            clearscreen();
            switch(option){
                case 1:
                clearscreen();
                    System.out.print("ingrese el nuevo nombre:");
                    String newname=f1.nextLine();
                    castinP.setNombre(newname);
                    break;
                case 2:
                clearscreen();
                    System.out.print("ingrese el nuevo precio: ");
                    int newprice = f1.nextInt();
                    castinP.setPrecio(newprice);
                    break;
                case 3:
                clearscreen();
                    System.out.print("ingrese la nueva cant. de vacunas aplicas: ");
                    Byte newvacuum = f1.nextByte();
                    castinP.setVacunas(newvacuum);
                    break;
                case 4:
                clearscreen();
                    System.out.print("ingrese el nuevo lugar de origen: ");
                    String newcountry= f1.nextLine();
                    castinP.setOrigen(newcountry);
                    break;
                
                case 5:
                clearscreen();
                    if (castinP.isVacunaMalota()==false){
                    System.out.print("¿Vacuna malota aplicada recientemente?...Si=1 / No=2: ");
                    Byte desi= f1.nextByte();
                    clearscreen();
                    if ((desi==1)){
                        clearscreen();
                        boolean newStateVacunaMalota=true;
                        castinP.setVacuna(newStateVacunaMalota);
                        }else{
                            clearscreen();
                        System.out.println("no se actualizó ningun dato...");
                        }
                
                    }else if(castinP.isVacunaMalota()==true){
                        clearscreen();
                    System.out.println("Vacuna malota ya aplicada");
                    System.out.println("==============================");
                    }
                    clearscreen();
                    Scanner pi=new Scanner(System.in);
                    System.out.print("Proceso terminado, ingrese cualquier caracter para continuar: ");
                    String entry = pi.nextLine();


                    break;
                case 6:
                    if(castinP.isMuerde()==true){
                        System.out.println("¿El perro ya no muerde?: ");
                        System.out.println("1. Si, aun muerde");
                        System.out.println("2. No. ya no muerde");
                        System.out.print("ingrese un numero asociado a su respuesta: ");
                        Byte resp = f1.nextByte();
                        if (resp==2){
                            boolean newStateMuerde=false;
                            castinP.setMuerde(newStateMuerde);
                            }else if(resp==1){
                            System.out.println("no se actualizó ningun dato...");
                            }else{
                                System.out.println("opcion introducida invalida...");
                            }
                        
                    }else{
                        System.out.println("¿El perro empezo a morder?");
                        System.out.println("1. Si, ahora muerde");
                        System.out.println("2. No, el perro sigue sin morder");
                        System.out.print("ingrese un numero asociado a su respuesta: ");
                        Byte resp= f1.nextByte();
                        if (resp==1){
                            boolean newStateMuerde=true;
                            castinP.setMuerde(newStateMuerde);
                            }else if(resp==2){
                            System.out.println("no se actualizó ningun dato...");
                            }else{
                                System.out.println("opcion introducida invalida...");
                            }


                    }
                    break;
                    
                case 7:
                    if(castinP.isPulgas()==true){
                        System.out.println("¿El perro ya no tiene pulgas?: ");
                        System.out.println("1. Si, aun tiene");
                        System.out.println("2. No. ya no tiene");
                        System.out.print("ingrese un numero asociado a su respuesta: ");
                        Byte resp = f1.nextByte();
                        if (resp==2){
                            boolean newStatePulgas=false;
                            castinP.setPulgas(newStatePulgas);
                            }else if(resp==1){
                            System.out.println("no se actualizó ningun dato...");
                            }else{
                                System.out.println("opcion introducida invalida...");
                            }
                        
                    }else{
                        System.out.println("¿El perro contrajo pulgas?");
                        System.out.println("1. Si, ahora tiene pulgas");
                        System.out.println("2. No, el perro sigue sin tener pulgas");
                        System.out.print("ingrese un numero asociado a su respuesta: ");
                        Byte resp= f1.nextByte();
                        if (resp==1){
                            boolean newStatePulgas=true;
                            castinP.setPulgas(newStatePulgas);
                            }else if(resp==2){
                            System.out.println("no se actualizó ningun dato...");
                            }else{
                                System.out.println("opcion introducida invalida...");
                            }


                    }break;

                    default:
                        System.out.println("opcion introducida invalida...");
                        break;

                }
            

            
        }else if(Mascotas.get(capt) instanceof Gato){
            Scanner f1;
            f1= new Scanner(System.in);
            Gato castinG= ((Gato)Mascotas.get(capt));
            System.out.println("6.Garras");
            System.out.print("ingresa un numero de opcion: ");
            int op= num2.nextInt();
            clearscreen();
            switch(op){
                case 1:
                    clearscreen();
                    System.out.print("ingrese el nuevo nombre:");
                    String newname=f1.nextLine();
                    castinG.setNombre(newname);
                    break;
                case 2:
                    clearscreen();
                    System.out.print("ingrese el nuevo precio: ");
                    int newprice = f1.nextInt();
                    castinG.setPrecio(newprice);
                    break;
                case 3:
                    clearscreen();
                    System.out.print("ingrese la nueva cant. de vacunas aplicas: ");
                    Byte newvacuum = f1.nextByte();
                    castinG.setVacunas(newvacuum);
                    break;
                case 4:
                    clearscreen();
                    System.out.print("ingrese el nuevo lugar de origen: ");
                    String newcountry= f1.nextLine();
                    castinG.setOrigen(newcountry);
                    break;
                
                case 5:
                    if (castinG.isVacunaMalota()==false){
                    System.out.println("¿Vacuna malota aplicada recientemente?...Si==1/No==2: ");
                    Byte desi= f1.nextByte();
                    boolean newStateVacunaMalota;
                    if (desi==1){
                        newStateVacunaMalota=true;
                        castinG.setVacuna(newStateVacunaMalota);
                        }else{
                        System.out.println("no se actualizó ningun dato...");
                        }
                
                    }else if(castinG.isVacunaMalota()==true){
                    clearscreen();
                    System.out.println("Vacuna malota ya aplicada...digite cualquier caracter para continuar");
                    Scanner p=new Scanner(System.in);
                    String ct=p.nextLine();
                    }
                    break;
                case 6:
                    if(castinG.isGarras()==true){
                        clearscreen();
                        System.out.println("¿Las garras del gato fueron cortadas?");
                        System.out.println("1. Si, fueron cortadas");
                        System.out.println("2. No, aun tiene garras");
                        System.out.print("ingrese un numero asociado a su respuesta: ");
                        Byte resp= f1.nextByte();
                        if(resp==1){
                            clearscreen();
                            boolean newStateGarras = false;
                            castinG.setGarras(newStateGarras);
                        }else if(resp==2){
                            clearscreen();
                            System.out.println("ningun dato fue actualizado");
                        }

                    }else{
                    clearscreen();
                       System.out.println("Las garras del gato ya fueron cortadas...");
                    }

            }
        }
        clearscreen();
        }
    }else if(contMascotas==0){
        System.out.println("No hay mascotas, inserte alguna para actualiarla");
        Scanner p1 = new Scanner(System.in);
        System.out.print("ingrese cualquier tecla para continuar...:");
        String hin = p1.nextLine(); 
    }





        
        
        




        //System.out.println("==============================");
        //System.out.print("Introduzca cualquier caracter para volver al menu...:  ");
//        String nm= e1.nextLine();

    }
    public void clearscreen(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }
    public void preguntar(){
        clearscreen();
        Scanner capturar,num,num2;
        capturar= new Scanner(System.in);
        num = new Scanner(System.in);
        num2 = new Scanner(System.in);
        Byte n;
        Scanner d;
        d=new Scanner(System.in);
        Listar();
        System.out.println("¿desea ver la lista de nuevo?... ");
        System.out.println("1.Si, no vi que mascota queria actualizar");
        System.out.println("2.No, ya se que mascota deseo actualizar");
        System.out.print("ingrese el numero asociado  a su respuesta--> ");
        n=d.nextByte();
        clearscreen();
        if (n==1){
            
            preguntar();
            clearscreen();
        }
        if (n==2){
            System.out.println("ingrese el N° de la mascota que desea actualizar: ");
            int capt= capturar.nextInt();
            clearscreen();
            
        clearscreen();
        System.out.println("¿Que dato desea actualizar?");
        System.out.println("1.Nombre");
        System.out.println("2.Precio");
        System.out.println("3.Vacunas");
        System.out.println("4.Origen");
        System.out.println("5.VacunaMalota");

        capt=capt-1;
        if (Mascotas.get(capt) instanceof Perro){
            Scanner f1;
            f1=new Scanner(System.in);
            Perro castinP= ((Perro)Mascotas.get(capt));
            System.out.println("6.Muerde");
            System.out.println("7.Tiene pulgas");
            System.out.print("Ingrese un numero de opcion: ");
            int option=num.nextInt();
            switch(option){
                case 1:
                clearscreen();
                    System.out.print("ingrese el nuevo nombre:");
                    String newname=f1.nextLine();
                    castinP.setNombre(newname);
                    break;
                case 2:
                clearscreen();
                    System.out.print("ingrese el nuevo precio: ");
                    int newprice = f1.nextInt();
                    castinP.setPrecio(newprice);
                    break;
                case 3:
                clearscreen();
                    System.out.print("ingrese la nueva cant. de vacunas aplicas: ");
                    Byte newvacuum = f1.nextByte();
                    castinP.setVacunas(newvacuum);
                    break;
                case 4:
                clearscreen();
                    System.out.print("ingrese el nuevo lugar de origen: ");
                    String newcountry= f1.nextLine();
                    castinP.setOrigen(newcountry);
                    break;
                
                case 5:
                clearscreen();
                    if (castinP.isVacunaMalota()==false){
                    System.out.println("¿Vacuna malota aplicada recientemente?...Si/No: ");
                    String desi= f1.nextLine();
                    if ((desi=="Si")||(desi=="si")||(desi=="SI")){
                        boolean newStateVacunaMalota=true;
                        castinP.setVacuna(newStateVacunaMalota);
                        }else{
                        System.out.println("no se actualizó ningun dato...");
                        }
                
                    }else if(castinP.isVacunaMalota()==true){
                    System.out.println("Vacuna malota ya aplicada");
                    }
                    break;
                case 6:
                clearscreen();
                    if(castinP.isMuerde()==true){
                        System.out.println("¿El perro ya no muerde?: ");
                        System.out.println("1. Si, aun muerde");
                        System.out.println("2. No. ya no muerde");
                        System.out.print("ingrese un numero asociado a su respuesta: ");
                        Byte resp = f1.nextByte();
                        if (resp==2){
                            clearscreen();
                            boolean newStateMuerde=false;
                            castinP.setMuerde(newStateMuerde);
                            }else if(resp==1){
                            clearscreen();

                            System.out.println("no se actualizó ningun dato...");
                            }else{
                                clearscreen();

                                System.out.println("opcion introducida invalida...");
                            }
                        
                    }else{
                        System.out.println("¿El perro empezo a morder?");
                        System.out.println("1. Si, ahora muerde");
                        System.out.println("2. No, el perro sigue sin morder");
                        System.out.print("ingrese un numero asociado a su respuesta: ");
                        Byte resp= f1.nextByte();
                        if (resp==1){
                            clearscreen();
                            boolean newStateMuerde=true;
                            castinP.setMuerde(newStateMuerde);
                            }else if(resp==2){
                                clearscreen();
                                System.out.println("no se actualizó ningun dato...");
                            }else{
                                clearscreen();

                                System.out.println("opcion introducida invalida...");
                            }


                    }
                    break;
                    
                case 7:
                clearscreen();
                    if(castinP.isPulgas()==true){
                        System.out.println("¿El perro ya no tiene pulgas?: ");
                        System.out.println("1. Si, aun tiene");
                        System.out.println("2. No. ya no tiene");
                        System.out.print("ingrese un numero asociado a su respuesta: ");
                        Byte resp = f1.nextByte();
                        if (resp==2){
                            boolean newStatePulgas=false;
                            castinP.setPulgas(newStatePulgas);
                            }else if(resp==1){
                            System.out.println("no se actualizó ningun dato...");
                            }else{
                                System.out.println("opcion introducida invalida...");
                            }
                        
                    }else{
                        System.out.println("¿El perro contrajo pulgas?");
                        System.out.println("1. Si, ahora tiene pulgas");
                        System.out.println("2. No, el perro sigue sin tener pulgas");
                        System.out.print("ingrese un numero asociado a su respuesta: ");
                        Byte resp= f1.nextByte();
                        if (resp==1){
                            boolean newStatePulgas=true;
                            castinP.setPulgas(newStatePulgas);
                            }else if(resp==2){
                            System.out.println("no se actualizó ningun dato...");
                            }else{
                                System.out.println("opcion introducida invalida...");
                            }


                    }break;

                    default:
                    clearscreen();
                        System.out.println("opcion introducida invalida...");
                        break;

                }
            

            
        }else if(Mascotas.get(capt) instanceof Gato){
            
            Scanner f1;
            f1= new Scanner(System.in);
            Gato castinG= ((Gato)Mascotas.get(capt));
            System.out.println("6.Garras");
            System.out.print("ingresa un numero de opcion: ");
            int op= num2.nextInt();
            switch(op){
                case 1:
                clearscreen();
                    System.out.print("ingrese el nuevo nombre:");
                    String newname=f1.nextLine();
                    castinG.setNombre(newname);
                    break;
                case 2:
                clearscreen();
                    System.out.print("ingrese el nuevo precio: ");
                    int newprice = f1.nextInt();
                    castinG.setPrecio(newprice);
                    break;
                case 3:
                clearscreen();
                    System.out.print("ingrese la nueva cant. de vacunas aplicas: ");
                    Byte newvacuum = f1.nextByte();
                    castinG.setVacunas(newvacuum);
                    break;
                case 4:
                clearscreen();
                    System.out.print("ingrese el nuevo lugar de origen: ");
                    String newcountry= f1.nextLine();
                    
                    castinG.setOrigen(newcountry);
                    break;
                
                case 5:
                clearscreen();
                    if (castinG.isVacunaMalota()==false){
                    System.out.println("¿Vacuna malota aplicada recientemente?...Si/No: ");
                    String desi= f1.nextLine();
                    if ((desi=="Si")||(desi=="si")||(desi=="SI")){
                        boolean newStateVacunaMalota=true;
                        castinG.setVacuna(newStateVacunaMalota);
                        }else{
                        System.out.println("no se actualizó ningun dato...");
                        }
                
                    }else if(castinG.isVacunaMalota()==true){
                    System.out.println("Vacuna malota ya aplicada");
                    }
                    break;
                case 6:
                clearscreen();
                    if(castinG.isGarras()==true){
                        System.out.println("¿Las garras del gato fueron cortadas?");
                        System.out.println("1. Si, fueron cortadas");
                        System.out.println("2. No, aun tiene garras");
                        System.out.print("ingrese un numero asociado a su respuesta: ");
                        Byte resp= f1.nextByte();
                        if(resp==1){
                            boolean newStateGarras = false;
                            castinG.setGarras(newStateGarras);
                        }else if(resp==2){
                            System.out.println("ningun dato fue actualizado");
                        }

                    }else{
                       System.out.println("Las garras del gato ya fueron cortadas...");
                    }

            }
        }
        clearscreen();
        }
            
        
    }

    public void BuscarEliminar(String name1){
        for (int i=0; i<Mascotas.size();i++){
            String nom;
            nom = Mascotas.get(i).getNombre();
            
                clearscreen();
                if(name1.equals(nom)){
                        Mascota mas = Mascotas.get(i);
                        Mascotas.remove(mas);
                        contMascotas--;
                    }
                      
                }
                System.out.println("=========================");
                    Scanner p=new Scanner(System.in);
                    System.out.println("Digite cualquier letra para continuar... ");
                    String a= p.nextLine(); 
            }

    public void GotVacunaMalota(){
        int cont=0;
        System.out.println("==================================================");
        System.out.println("Nombres de mascotas que tienen la Vacuna Malota aplicada:");
            System.out.println("=================================================");
        for (int i=0; i<Mascotas.size();i++){
            
            boolean save = Mascotas.get(i).isVacunaMalota();
            String captName= Mascotas.get(i).getNombre();
            
            if(save==true){
                System.out.println(captName);
                cont++;
            }
        }if(cont!=0){
            System.out.println("============================================");
        }
        if (cont==0){
            System.out.println("No hay ninguna mascota con la vacuna malota aplicada");
            System.out.println("==============================================");
        }
        Scanner stop=new Scanner(System.in);
        System.out.print("ingrese cualquier digito para continuar: ");
        String step=stop.nextLine();
    }
    }
  

    

