import java.util.Scanner;

public class App {
    public void clearscreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }  
    public static void main(String[] args)  {
        App borrar=new App();
        int num,gor,cont;
        num = 1;
        gor= 1;
        cont=0;
        while(num==1){
            borrar.clearscreen();
            System.out.println("=====BIENVENIDO A MUNDO MASCOTAS======");
            System.out.println("1. Insertar Mascota");
            System.out.println("2. Actualizar Mascota");
            System.out.println("3. Eliminar Mascota");
            System.out.println("4. Buscar Mascota Por Nombre");
            System.out.println("5. Listar Mascotas");
            System.out.println("6. Finalizar Gestion(desplegar 2do menu)");
            Scanner input= new Scanner(System.in);
            System.out.print("Ingresa una opcion: ");
            byte control= input.nextByte();
            Base base= new Base();
            
            switch(control){
                case 1:
                    borrar.clearscreen(); 
                    base.AñadirMascota(); 
                    cont++;
                    break;
                case 2:
                    borrar.clearscreen();
                    base.Actualizar();
                    break;
                case 3:
                if(cont!=0){
                    borrar.clearscreen();
                    Scanner r=new Scanner(System.in);
                    System.out.print("Digite el nombre de la mascota a eliminar: ");
                    String name1 = r.nextLine();
                    borrar.clearscreen();
                    base.BuscarEliminar(name1);
                }else if(cont==0){
                    borrar.clearscreen();
                    System.out.println("No hay mascotas para eliminar");
                    System.out.println("    --><><><><><><><><--    ");
                    System.out.print("Ingrese cualquier tecla para continar....");
                    Scanner p=new Scanner(System.in);
                    String t= p.nextLine();
                }
                    break;
                case 4:
                    borrar.clearscreen();
                    Scanner r1=new Scanner(System.in);
                    System.out.print("introduzca el nombre a buscar: ");
                    String name = r1.nextLine();
                    base.BuscarMascota(name);
                    break;
                case 5:
                    borrar.clearscreen();
                    base.Listar();
                    break;
                case 6:
                while(gor==1){
                borrar.clearscreen();
                Scanner y;
                y=new Scanner(System.in);
                System.out.println("===== 2do Menu =====");
                System.out.println("1. Que mascotas tienen la vacuna malota");
                System.out.println("2. Top 5 mascotas mas costosas");
                System.out.println("3. Que Mascotas no tiene como pais de origen latinoamerica");
                System.out.println("4. Volver al menu principal");
                System.out.println("5. Finalizar ejecucion");
                System.out.print("ingrese el numero asociado a su respuesta: ");
                Byte opt = y.nextByte();
                
                switch(opt){
                    case 1:
                        borrar.clearscreen();
                        base.GotVacunaMalota();
                        break;
                    case 2:
                        borrar.clearscreen();
                        base.TopM();

                        break;
                    case 3:
                        borrar.clearscreen();
                        base.NotLatinoamerica();

                        break;
                    case 4:
                        gor=2;
                        break;
                    case 5:
                    gor=3;
                    break;
                    default:
                    System.out.println("Opcion invalida...");
                    break;
                }}
                if(gor==2){
                    num=1;
                    gor=1;
                }else if(gor==3){
                    num=2;

                }
                borrar.clearscreen();
                System.out.println("!Hasta pronto¡...");
                 break;
                
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }   
}