import java.util.Scanner;

public class App {
    public void clearscreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void main(String[] args)  {
        App borrar=new App();
        boolean num = true;
        while(num==true){
            
            System.out.println("=====BIENVENIDO A MUNDO MASCOTAS======");
            System.out.println("1. Insertar Mascota");
            System.out.println("2. Actualizar Mascota");
            System.out.println("3. Eliminar Mascota");
            System.out.println("4. Buscar Mascota");
            System.out.println("5. Listar Mascotas");
            System.out.println("6. Finalizar");
            Scanner input= new Scanner(System.in);
            System.out.print("Ingresa una opcion: ");

            byte control= input.nextByte();
            

            Base base= new Base();
            switch(control){
                case 1:
                borrar.clearscreen();
                    
                    base.AñadirMascota();
                    
                    break;
                case 2:
                    borrar.clearscreen();
                    base.Actualizar();
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
                 num=false;
                 break;
                
                default:
                    System.out.println("Opcion invalida");
                    break;
                


            }
        }
    }

    
    
}
    

